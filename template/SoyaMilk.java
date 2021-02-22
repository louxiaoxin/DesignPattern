package DesignPattern.template;

public abstract class SoyaMilk {
    public final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiment();
        }
        soak();
        beat();
    }

    public void select() {
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    public abstract void addCondiment();

    public void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡，需要3小时");
    }

    public void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }

    public boolean customerWantCondiments() {
        return true;
    }
}
