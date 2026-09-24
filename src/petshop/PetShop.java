package petshop;

public class PetShop {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.cor = "branco";
        meuCachorro.peso = 15;

        Gato gatoDaVizinha = new Gato();
        gatoDaVizinha.cor = "malhado";
        gatoDaVizinha.peso = 5;

        meuCachorro.comer();
        meuCachorro.enterrarOsso();
        gatoDaVizinha.subirEmArvore();

        Animal a1 = meuCachorro;
        Animal a2 = gatoDaVizinha;
        a1.fazerSom();
        a2.fazerSom();
    }

    
    
}
