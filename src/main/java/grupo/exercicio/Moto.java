
package grupo.exercicio;

import Utilidades.Data;

public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(){
        
    } 
    
    public Moto (String placa, String modelo, double precoDiaria, Data dataAquisicao,
            int cilindradas){
        super(placa, modelo, precoDiaria, dataAquisicao);
        this.cilindradas = cilindradas;
    }
    
    

    @Override
    public void acelerar(){
        System.out.println("A moto esta acelerando...");
    }
    
    @Override
    public String toString(){
        return super.toString()+
        "Quantas cilindradas: " + cilindradas + "\n";
    }
    
}
