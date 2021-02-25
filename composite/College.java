package DesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    @Override
    public String getName() {
        return super.getName();
    }

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("-----------" + getName() + "-----------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
