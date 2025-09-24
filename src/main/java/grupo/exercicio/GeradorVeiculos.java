package grupo.exercicio;

import java.util.Random;
import Utilidades.Data;
public class GeradorVeiculos {

    private static final String[] CARROS = {
        "Ford Ka", "Ford Fiesta", "Ford Focus", "Chevrolet Onix", "Chevrolet Prisma",
        "Volkswagen Gol", "Volkswagen Polo", "Fiat Uno", "Fiat Argo", "Renault Sandero",
        "Renault Kwid", "Hyundai HB20", "Hyundai Creta", "Toyota Corolla", "Toyota Yaris",
        "Honda Civic", "Honda Fit", "Nissan March", "Nissan Kicks", "Jeep Compass",
        "Jeep Renegade", "Peugeot 208", "Citroën C3", "Chevrolet Cruze", "Fiat Cronos",
        "Volkswagen T-Cross", "Ford EcoSport", "Honda HR-V", "Toyota Hilux", "Hyundai Tucson",
        "Renault Logan", "Chevrolet Spin", "Fiat Punto", "Honda City", "Nissan Sentra",
        "Jeep Wrangler", "Peugeot 3008", "Ford Fusion", "Toyota RAV4", "Honda CR-V",
        "BMW 320i", "Audi A3", "Mercedes A200", "Volvo XC60", "Kia Sportage",
        "Mitsubishi Lancer", "Chevrolet Tracker", "Volkswagen Golf", "Fiat Mobi", "Hyundai i30"
    };

    private static final String[] MOTOS = {
        "Honda CG 125", "Honda CB 300", "Honda CB 650", "Honda XRE 300", "Honda PCX 150",
        "Yamaha YBR 125", "Yamaha Fazer 250", "Yamaha MT-07", "Yamaha XTZ 250", "Yamaha NMax",
        "Suzuki GSR 750", "Suzuki V-Strom 650", "Suzuki Intruder 150", "Kawasaki Ninja 400", "Kawasaki Z650",
        "Ducati Monster 821", "Ducati Multistrada 950", "BMW G 310 R", "BMW R 1250 GS", "BMW F 750 GS",
        "Triumph Street Triple", "Triumph Tiger 900", "Harley-Davidson Sportster", "Harley-Davidson Iron 883", "Harley-Davidson Softail",
        "Royal Enfield Classic 350", "Royal Enfield Himalayan", "KTM Duke 390", "KTM 390 Adventure", "KTM RC 390",
        "Honda CB Twister", "Honda Biz 110", "Yamaha Crypton", "Yamaha Fazer 150", "Suzuki Burgman 125",
        "Honda CBR 600", "Yamaha R6", "Kawasaki ZX-6R", "Ducati Panigale V2", "BMW S 1000 RR",
        "Husqvarna Svartpilen 401", "Benelli TNT 600", "Aprilia Tuono 660", "Aprilia RSV4", "MV Agusta Brutale",
        "Kawasaki Versys 650", "Triumph Bonneville", "Honda Gold Wing", "Yamaha Tenere 700", "Suzuki GSX-R750"
    };

    private static final char[] CONSOANTES = {
        'B','C','D','F','G','H','J','K','L','M','N','P','R','S','T','V','W','X','Z'
    };

    private static final char[] VOGAIS = {'A','E','I','O','U'};

    private static final Random RNG = new Random();

    // ===== Gerador de Placa =====
    private static String gerarPlaca() {
        char l1 = CONSOANTES[RNG.nextInt(CONSOANTES.length)];
        char l2 = VOGAIS[RNG.nextInt(VOGAIS.length)];
        char l3 = CONSOANTES[RNG.nextInt(CONSOANTES.length)];
        int n1 = RNG.nextInt(10);
        int n2 = RNG.nextInt(10);
        int n3 = RNG.nextInt(10);

        return "" + l1 + l2 + l3 + n1 + n2 + n3;
    }

    // ===== Gerador de Data =====
    private static Data gerarData() {
        int dia = 1 + RNG.nextInt(28);
        int mes = 1 + RNG.nextInt(12);
        int ano = 2020 + RNG.nextInt(6); // de 2020 até 2025
        return new Data(dia, mes, ano);
    }

    // ===== Gerar Carro =====
    public static Carro gerarCarro() {
        String modelo = CARROS[RNG.nextInt(CARROS.length)];
        String placa = gerarPlaca();
        double preco = 100 + RNG.nextInt(200); // valor da diária
        Data data = gerarData();
        int portas = 2 + RNG.nextInt(3); // 2 a 4 portas
        boolean ar = RNG.nextBoolean();

        return new Carro(placa, modelo, preco, data, portas, ar);
    }

    // ===== Gerar Moto =====
    public static Moto gerarMoto() {
        String modelo = MOTOS[RNG.nextInt(MOTOS.length)];
        String placa = gerarPlaca();
        double preco = 50 + RNG.nextInt(150); // valor da diária
        Data data = gerarData();
        int cilindradas = 100 + RNG.nextInt(900);

        return new Moto(placa, modelo, preco, data, cilindradas);
    }
}
