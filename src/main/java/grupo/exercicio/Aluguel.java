package grupo.exercicio;

public class Aluguel {

    private Veiculo[] veiculo;
    private int quantidade;

    public Aluguel() {
        this(100); // valor padrão de capacidade
    }

    public Aluguel(int capacidade) {
        this.veiculo = new Veiculo[capacidade];
        this.quantidade = 0;
    }

    // método para adicionar UM veículo
    public int addVeiculo(Veiculo v) {
        if (quantidade < veiculo.length) {
            veiculo[quantidade++] = v;
            return 1;
        } else {
            return 0;
        }
    }

    // método para adicionar VÁRIOS veículos de uma vez
    public int addVeiculos(Veiculo[] lista) {
        int adicionados = 0;
        for (Veiculo v : lista) {
            if (addVeiculo(v) == 1) {
                adicionados++;
            }
        }
        return adicionados; // retorna quantos foram adicionados
    }

    public Veiculo[] getVeiculos() {
        return veiculo;
    }

    @Override
    public String toString() {
        String texto = "Veículos alugados:\n";
        for (int i = 0; i < quantidade; i++) {
            texto += veiculo[i].toString() + "\n\n";
        }
        return texto;
    }
}
