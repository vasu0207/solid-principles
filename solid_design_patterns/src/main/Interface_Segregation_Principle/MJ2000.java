package main.Interface_Segregation_Principle;

public class MJ2000 implements IPrint {
    @Override
    public void scanContent() {
        System.out.println("MJ2000.scanContent");
    }

    @Override
    public void xeroxContent() {
        System.out.println("MJ2000.xeroxContent");
    }

    @Override
    public void faxContent() {
        System.out.println("MJ2000.faxContent - dont have this functionaity");
    }

    @Override
    public void stapleContent() {
        System.out.println("MJ2000.stapleContent");
    }
}
