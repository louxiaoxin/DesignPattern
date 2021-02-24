package DesignPattern.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "lxx";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛的类");
        //方式一完成深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType.hashCode() == deepProtoType1.hashCode());
        System.out.println(deepProtoType.deepCloneableTarget.hashCode() == deepProtoType1.deepCloneableTarget.hashCode());
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType.hashCode() == deepProtoType2.hashCode());
        System.out.println(deepProtoType.deepCloneableTarget.hashCode() == deepProtoType2.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType);
        System.out.println(deepProtoType1);
        System.out.println(deepProtoType2);
    }
}
