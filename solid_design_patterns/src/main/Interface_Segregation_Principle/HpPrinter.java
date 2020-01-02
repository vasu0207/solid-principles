package main.Interface_Segregation_Principle;

public class HpPrinter implements IPrint {
    @Override
    public void scanContent() {
        System.out.println("HpPrinter.scanContent");
    }

    @Override
    public void xeroxContent() {
        System.out.println("HpPrinter.xeroxContent");
    }

    @Override
    public void faxContent() {
        System.out.println("HpPrinter.faxContent");
    }

    @Override
    public void stapleContent() {
        System.out.println("HpPrinter.stapleContent - functionality not available");
    }
}
