package petshop;

public class PetShop {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.cor = "branco";
        meuCachorro.peso = 15;

        Gato gatoDaVizinha = new Gato();
        gatoDaVizinha.cor = "malhado";
        gatoDaVizinha.peso = 5;

        Coelho meuCoelho = new Coelho();
        meuCoelho.cor = "preto";
        meuCoelho.peso = 5;

        meuCachorro.comer();
        meuCachorro.enterrarOsso();
        gatoDaVizinha.subirEmArvore();
        meuCoelho.pular();

        Animal a1 = meuCachorro;
        Animal a2 = gatoDaVizinha;
        Animal a3 = meuCoelho;
        a1.fazerSom();
        a2.fazerSom();
        a3.fazerSom();
    }

    
    
}
