package jogodomino;

public class Jogo {
    public Domino[] arrayPecas;
    public int indiceDapecaASerPuxada;
    
    public Jogo(){
        this.arrayPecas = new Domino[28];
        this.indiceDapecaASerPuxada = 0;
        int count = 0, posi = 0;
        for(int a = 6; a >= 0; a--){
            for(int b = 0; b <= 6 - count; b++){
                arrayPecas[posi] = new Domino(a,b);
                posi++;
            }
            count++;
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
