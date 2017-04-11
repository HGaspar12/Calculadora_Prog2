package heranca;


public class Lampada {
    int potencia;
    String marca;
    boolean estado;
    
    void acender(){
        if(estado == false){
          estado = true;  
        }
    }
    
    void apagar(){
        if(estado == true){
          estado = false;
        }   
    }
    
}
