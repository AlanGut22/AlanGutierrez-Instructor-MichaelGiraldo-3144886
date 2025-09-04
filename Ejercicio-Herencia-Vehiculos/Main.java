public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Mazda", "2020");
        Moto moto = new Moto(20, "Yamaha", "2025");

        carro.mostrarInfo();
        carro.mostrarInfoCarro();
        moto.mostrarInfo();
        moto.mostrarInfoMoto();
    }
}