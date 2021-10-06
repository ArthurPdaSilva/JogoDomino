package jogodomino;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean fim = false;
        int pecaEscolhida = 0;
        Jogo jogo = new Jogo();
        jogo.embaralhar();
        Domino[] pecasDaMao = {jogo.puxarPeca(), jogo.puxarPeca(), jogo.puxarPeca(), jogo.puxarPeca(), jogo.puxarPeca(),jogo.puxarPeca()};
        
        
        while(!jogo.isFim()){
            Domino pecaDaVez = jogo.puxarPeca();
            System.out.println("Peça da vez: " + pecaDaVez);
            System.out.println("Peças na sua mão: " + Arrays.toString(pecasDaMao));
            System.out.println("Indique o índice da peça que deseja casar (0-5):");
            pecaEscolhida = Integer.parseInt(input.nextLine());
            if(pecasDaMao[pecaEscolhida] != null){
                jogo.pontuar(pecasDaMao[pecaEscolhida], pecaDaVez);
                pecasDaMao[pecaEscolhida] = null;
            }else{
                while(pecasDaMao[pecaEscolhida] == null){
                    System.out.println("Infelizmente, não a peça nessa posição, escolha outra!");
                    System.out.println("Indique o índice da peça que deseja casar (0-5):");
                    pecaEscolhida = Integer.parseInt(input.nextLine());
                }
                jogo.pontuar(pecasDaMao[pecaEscolhida], pecaDaVez);
                pecasDaMao[pecaEscolhida] = null;
            }
              
        }
        System.out.println("Você fez " + jogo.getPontos() + " pontos");
    }

}
