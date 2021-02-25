package DesignPattern.composite;

public abstract class OrganizationComponent {
    private String name;
    private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void add(OrganizationComponent organizationComponent) {

    }

    public void remove(OrganizationComponent organizationComponent) {

    }

    public abstract void print();
}
