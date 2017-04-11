package estacionamentouenp;

import java.util.Date;

public class Emprestimo {
    Integer codigo; //Integer atributo que é um objeto|(int é um tipo primitivo, não possui metodos e atributos)
    Carro carro;
    Motorista motorista;    
    Date saida;
    Date retorno;
    Integer kmSaida;
    Integer kmRetorno;
    
    
    public Emprestimo(Carro carro){
        codigo = 0;
        this.carro = carro;
        
        kmSaida = 0;
    }
    
    public void emprestar(Carro carro, Motorista motorista, Integer kmAtual){
        this.carro = carro;
        this.motorista = motorista;
        this.kmSaida = kmAtual;
        this.saida = new Date();
        this.carro.emprestar();        
    }
    
    public void devolver(Integer kmRetorno){
        this.kmRetorno = kmRetorno;
        this.retorno = new Date();
    }
}
