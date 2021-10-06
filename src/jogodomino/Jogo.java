package jogodomino;

public class Jogo {
    private Domino[] arrayPecas;
    private int indiceDapecaASerPuxada;
    private int pontos;
    private boolean fim;
    
    public Jogo(){
        this.arrayPecas = new Domino[28];
        this.indiceDapecaASerPuxada = 0;
        this.pontos = 0;
        this.fim = false;
        int count = 0, posi = 0;
        for(int a = 6; a >= 0; a--){
            for(int b = 0; b <= 6 - count; b++){
                arrayPecas[posi] = new Domino(a,b);
                posi++;
            }
            count++;
        }
    }
    
    public boolean isFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }
    
    public Domino[] getArrayPecas() {
        return arrayPecas;
    }

    public void setArrayPecas(Domino[] arrayPecas) {
        this.arrayPecas = arrayPecas;
    }

    public int getIndiceDapecaASerPuxada() {
        return indiceDapecaASerPuxada;
    }

    public void setIndiceDapecaASerPuxada(int indiceDapecaASerPuxada) {
        this.indiceDapecaASerPuxada = indiceDapecaASerPuxada;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public void pontuar(Domino pecaDaMao, Domino pecaDaVez){
        if(pecaDaMao.getLadoA() == pecaDaVez.getLadoA() || pecaDaMao.getLadoB() == pecaDaVez.getLadoB() || pecaDaMao.getLadoA() == pecaDaVez.getLadoB()|| pecaDaMao.getLadoB() == pecaDaVez.getLadoA()){
            System.out.println(pecaDaMao + " se conecta com " + pecaDaVez);
            this.pontos++;
            if(pontos == 6){
                System.out.println("Você venceu! Fim de jogo.");
                this.fim = true;
            }
        }else{
            System.out.println(pecaDaMao + " não se conecta com " + pecaDaVez);
            System.out.println("Você perdeu! Fim de jogo.");
            this.fim = true;
        }
    }
    
    public void embaralhar(){
        this.indiceDapecaASerPuxada = 0;
        for(int c = 0; c <= 100; c++){
            int indice0 = (int)(Math.random() * 28);
            int indice1 = (int)(Math.random() * 28);
            Domino temporario = this.arrayPecas[indice0];
            this.arrayPecas[indice0] = this.arrayPecas[indice1];
            this.arrayPecas[indice1] = temporario;
            
        }
    }
    
    public Domino puxarPeca(){
        if(this.indiceDapecaASerPuxada == 28){
            return null;
        }else{
            Domino object = this.arrayPecas[indiceDapecaASerPuxada];
            this.indiceDapecaASerPuxada++;
            return object;
        }
    }
}
