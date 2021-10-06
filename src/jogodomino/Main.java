package jogodomino;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Domino c = new Domino();
        c.setLadoA(6);
        c.setLadoB(4);
        c.desenhar();
        Jogo jogo = new Jogo();
        System.out.println(Arrays.toString(jogo.arrayPecas));
        jogo.embaralhar();
        System.out.println(Arrays.toString(jogo.arrayPecas));
    }

}
