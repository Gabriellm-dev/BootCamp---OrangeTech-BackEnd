public class Moto extends Veiculo {
    private String tipo;

    public Moto(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return "Moto " + tipo;
    }
}