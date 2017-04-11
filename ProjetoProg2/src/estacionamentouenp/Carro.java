package estacionamentouenp;

public class Carro {
    Integer codigo;
    String placa;
    String cor;
    String marca;
    String modelo;
    Boolean livre;
    
    public Carro(){
        codigo = 0;
        placa = "";
        cor = "";
        marca = "";
        modelo = "";
        livre = true;
    }
    
    public void emprestar(){
        livre = false;
    }
    
    public void devolver(){
        livre = true;
    }
    
    /*public Carro(String placa){ // sobrecarga = 2 métodos
        codigo = 0;
        this.placa = placa;
        cor = "";
        marca = "";
        modelo = "";
    }*/
}
