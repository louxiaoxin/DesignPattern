package DesignPattern.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级大学");
        OrganizationComponent computorCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoEngineeringCollege = new College("信息工程学院", "信息工程学院");
        computorCollege.add(new Department("软件工程", "软件工程不错"));
        computorCollege.add(new Department("网络工程", "网络工程不错"));
        computorCollege.add(new Department("计算机科学技术", "计算机科学技术不错"));
        infoEngineeringCollege.add(new Department("通信工程", "通信工程"));
        infoEngineeringCollege.add(new Department("信息工程", "信息工程"));
        university.add(computorCollege);
        university.add(infoEngineeringCollege);
        university.print();
    }
}
