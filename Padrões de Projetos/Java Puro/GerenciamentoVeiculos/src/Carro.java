public class Carro extends Veiculo {
    private String tipo;

    public Carro(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return "Carro " + tipo;
    }
}
