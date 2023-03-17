public class Cliente {
    public static void main(String[] args) {
        // Criando uma fábrica de carros
        FabricaVeiculo fabricaCarro = new FabricaCarro();

        // Criando um objeto carro
        Carro carro = fabricaCarro.criarCarro("Sedan");
        Carro carro2 = fabricaCarro.criarCarro("O que voce quiser.");

        // Imprimindo a descrição do carro
        System.out.println("Veículo criado: "+ carro.getDescricao());
        System.out.println("Veículo criado: "+ carro2.getDescricao());

        // Criando uma fábrica de motos
        FabricaVeiculo fabricaMoto = new FabricaMoto();

        // Criando um objeto moto
        Moto moto = fabricaMoto.criarMoto("Esportiva");

        // Imprimindo a descrição da moto
        System.out.println("Veículo criado: " + moto.getDescricao());
    }
}