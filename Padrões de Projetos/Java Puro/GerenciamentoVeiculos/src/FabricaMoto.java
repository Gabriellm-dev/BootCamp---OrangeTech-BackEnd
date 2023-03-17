public class FabricaMoto implements FabricaVeiculo {
    public Carro criarCarro(String tipo) {
        return null; // Não suportado pela fábrica de motos
    }

    public Moto criarMoto(String tipo) {
        return new Moto(tipo);
    }
}

