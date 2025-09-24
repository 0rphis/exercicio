package grupo.exercicio;
import Utilidades.Data;

public class Carro extends Veiculo {

    private int numPortas;
    private boolean temArCondicionado;

    public Carro() {

    }

    public Carro(String placa, String modelo, double precoDiaria,
            Data dataAquisicao, int numPortas, boolean temArCondicionado) {
        super (placa, modelo, precoDiaria, dataAquisicao);
        this.temArCondicionado = temArCondicionado; 
    }
    
    @Override
    public void acelerar(){
        System.out.println("O carro esta acelerando...");
    }
    
        @Override
    public String toString(){
        return super.toString()+
        "Numero de portas: " + numPortas + "\n" +
                "Ar condicionado: " + (temArCondicionado ? "Sim" : "Não") + "\n" ;
    }
    
    
}


