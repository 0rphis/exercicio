package grupo.exercicio;

import Utilidades.Data;

public abstract class Veiculo {

    private String placa;
    private String modelo;
    private double precoDiaria;
    private Data dataAquisicao;

    public Veiculo() {

    }
    

    public Veiculo(String placa, String modelo, double precoDiaria, Data dataAquisicao) {
        this.placa = placa;
        this.modelo = modelo;
        this.precoDiaria = precoDiaria;
        this.dataAquisicao = dataAquisicao;
    }

    
    public abstract void acelerar();
    
    public final void ligar(){
        System.out.println("O veículo está ligado.");
    }
    
    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public Data getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Data dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    @Override
    public String toString() {
        String texto = "Número da placa: " + placa
                + "\nNome do modelo: " + modelo
                + "\nPreço da diária: " + precoDiaria
                + "\nData de aquisição: " + dataAquisicao +
                "\nAluguéis: \n";

        // esse trecho só funciona se você tiver um array ou lista de aluguel
        // por exemplo: private Aluguel[] aluguel;
        // for (int i = 0; i < aluguel.length; i++) {
        //     texto += aluguel[i] + "\n";
        // }

        return texto;
    }
}
