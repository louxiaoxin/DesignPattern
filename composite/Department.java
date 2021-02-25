package DesignPattern.composite;

public class Department extends OrganizationComponent {
    @Override
    public String getName() {
        return super.getName();
    }

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
