package DesignPattern.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneClass = cloneClass;
        this.cloneName = cloneName;
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
