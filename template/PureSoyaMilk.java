package DesignPattern.template;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiment() {

    }

    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
