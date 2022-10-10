package br.imc.unifei.inimigo;

public class CavaleiroNegro extends Inimigo {

    public CavaleiroNegro(String nome, double vida, String arma) {
        super(nome, vida, arma);
        //this.nome = "Alterando acesso do atributo por meio do 'protected'";
    }

    @Override
    public void atacando() {
        System.out.println("Cavaleiro Negro atacando");
    }

    @Override
    public void tomarDano() {
        this.vida =- 20;
    }

    public void ataqueRapido(){
        System.out.println("Ataque rápido do Cavaleiro Negro!\n");
    }
}
