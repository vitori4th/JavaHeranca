package br.imc.unifei.jogador;

import br.imc.unifei.inimigo.Inimigo;

public class Jogador {

    private String nome;
    private double vida;

    public Jogador(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Inimigo inimigo) {
        inimigo.tomarDano();
        System.out.println("Informações do inimigo: ");
        inimigo.mostraInfo();
    }
}
