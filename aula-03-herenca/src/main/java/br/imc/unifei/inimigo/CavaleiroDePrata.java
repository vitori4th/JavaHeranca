package br.imc.unifei.inimigo;

public class CavaleiroDePrata extends Inimigo {


    public CavaleiroDePrata(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    @Override
    public void atacando() {
        System.out.println("Cavaleiro de Prata atacando");
    }

    @Override
    public void tomarDano() {
        this.vida =- 15;
    }

    public void ataqueForte() {
        System.out.println("Ataque forte do Cavaleiro de Prata!\n");
    }
}
