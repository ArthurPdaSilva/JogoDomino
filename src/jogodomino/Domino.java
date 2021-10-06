package jogodomino;

public final class Domino {
    private int ladoA;
    private int ladoB;

    public Domino(){}
    
    public Domino(int a, int b){
        this.setLadoA(a);
        this.setLadoB(b);
    }
     
    
    public void desenhar(){
        System.out.println(this.criarDomino(ladoA));
        System.out.println(this.criarDomino(ladoB));
    }
    
    private String criarDomino(int x){
        switch(x){
            case 0:
                return " **********\n" + "*          *\n" + "*          *\n" + "*          *\n" + " **********";
            case 1:
                return " **********\n" + "*          *\n" + "*    O     *\n" + "*          *\n" + " **********";
            case 2:
                return " **********\n" + "* O        *\n" + "*          *\n" + "*        O *\n" + " **********";
            case 3:
                return " **********\n" + "* O        *\n" + "*    O     *\n" + "*        O *\n" + " **********";
            case 4:
                return " **********\n" + "* O      O *\n" + "*          *\n" + "* O      O *\n" + " **********";
            case 5:
                return " **********\n" + "* O      O *\n" + "*    O     *\n" + "* O      O *\n" + " **********";
            default:
                return " **********\n" + "* O      O *\n" + "* O      O *\n" + "* O      O *\n" + " **********";
        }
    }
    
    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        if(ladoA >= 0 && ladoA <= 6)
            this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        if(ladoB >= 0 && ladoB <= 6)
            this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "[" + ladoA + ", " + ladoB + ']';
    }
    
    
   
}
