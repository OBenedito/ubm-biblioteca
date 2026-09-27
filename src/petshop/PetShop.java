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

        Passaro meuPassaro = new Passaro();
        meuPassaro.cor = "verde";
        meuPassaro.peso = 1;
        meuPassaro.envergadura = 0.3;

        meuCachorro.comer();
        meuCachorro.enterrarOsso();
        gatoDaVizinha.subirEmArvore();
        meuCoelho.pular();
        meuPassaro.voar();

        Animal[] animais = { meuCachorro, gatoDaVizinha, meuCoelho, meuPassaro };
        for (int i = 0; i < animais.length; i++) {
           animais[i].fazerSom(); 
        } 
    } 
}
