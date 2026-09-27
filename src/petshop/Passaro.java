package petshop;

public class Passaro extends Animal {
    protected double envergadura;

    public void voar() {
        System.out.println("voando...");
    }
    
    @Override 
    public void fazerSom() {
        System.out.println("piu piu");
    }
}
