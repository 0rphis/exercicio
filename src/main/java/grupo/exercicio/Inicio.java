package grupo.exercicio;

public class Inicio {
    public static void main(String[] args) {
        // Gerar alguns carros
        System.out.println("=== Carros ===");
        for (int i = 0; i < 5; i++) {
            Carro c = GeradorVeiculos.gerarCarro();
            System.out.println(c);
        }

        // Gerar algumas motos
        System.out.println("\n=== Motos ===");
        for (int i = 0; i < 5; i++) {
            Moto m = GeradorVeiculos.gerarMoto();
            System.out.println(m);
        }

        // Adicionar em aluguel
        Aluguel aluguel = new Aluguel();
        Veiculo[] lista = { GeradorVeiculos.gerarCarro(), GeradorVeiculos.gerarMoto() };
        aluguel.addVeiculos(lista);

        System.out.println("\n=== Veículos no aluguel ===");
        for (Veiculo v : lista) {
            System.out.println(v);
        }
    }
}
