package br.imc.unifei.inimigo;

public class ZumbiLerdo extends Inimigo {

    public ZumbiLerdo(String nome, double vida, String arma) {
        super(nome, vida, arma); //chamando construtor da superclasse
    }

    @Override
    public void atacando() {
        System.out.println("Zumbi lerdo atacando");
    }

    @Override
    public void tomarDano() {
        this.vida =- 5;
    }
}
