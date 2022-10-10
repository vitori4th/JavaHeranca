package br.imc.unifei;

import br.imc.unifei.inimigo.CavaleiroNegro;
import br.imc.unifei.inimigo.Inimigo;
import br.imc.unifei.inimigo.ZumbiLerdo;
import br.imc.unifei.jogador.Jogador;

public class Principal {
    public static void main(String[] args) {

        /* Inimigos */
        Inimigo cavaleiroNegro = new CavaleiroNegro("Cavaleiro Negro", 100, "Level 3");
        //System.out.println(cavaleiroNegro);
        //cavaleiroNegro.atacar();
        //cavaleiroNegro.ataqueRapido();


        Inimigo zumbiLerdo = new ZumbiLerdo("Zumbi Lerdo", 20, "Level 1");
        //System.out.println(zumbiLerdo);
        //zumbiLerdo.atacar();
        //zumbiLerdo.ataqueLerdo();

        /* Jogador */
        var jogadorOne = new Jogador("Bruna", 150);
        jogadorOne.atacar(cavaleiroNegro);
    }
}
