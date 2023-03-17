public class FabricaCarro implements FabricaVeiculo {
    public Carro criarCarro(String tipo) {
        return new Carro(tipo);
    }

    public Moto criarMoto(String tipo) {
        return null; // Não suportado pela fábrica de carros
    }
}