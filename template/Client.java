package DesignPattern.template;

/**
 * 模板方法：
 *     基本思想是：算法只存在与一个地方，也就是在父类中，容易修改。需要修改算法时，只要修改父类的模板方法或者已经实现的某些步骤，子类就会继承这些修改
 *     实现了最大化代码服用。符类的模板方法和已实现的某些步骤会被子类继承而直接使用。
 *     既统一了算法，也提供了很大的灵活性。父类的模板方法确保了算法的结构保持不变，同时由子类提供部分步步骤的实现
 *     不足：
 *         每一个不同的实现都需要一个子类实现，导致类的个数增加，使得系统更加庞大
 *         一般模板方法都加上final关键字，防止子类重写模板方法。
 *         模板方法模式使用场景：当要完成在某个过程，该过程要执行一系列步骤，这一系列的步骤基本相同，但其个别步骤在实现时可能不同，通常考虑用模板方法模式来处理
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        SoyaMilk redbeanSoyaMilk = new RedBeanSoyaMilk();
        redbeanSoyaMilk.make();
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
