
package heranca;

public class Lampada2 {
    
    
    public class Lampada {
    private int potencia;
    private String marca;
    private boolean acesa;
    
    void ligar(){
        acesa = true;
    }
    
    void apagar(){
        acesa = false;
    }
    
    private int getPotencia(){
        return potencia;
    }
    
    private int setPotencia(){
        return potencia;
    }
    
}
}
