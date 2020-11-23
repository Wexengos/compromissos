package src;

public class CompParticular extends Compromissos{
    private String motivo;

    public CompParticular(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, String motivo, int grauPrioridade) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel, grauPrioridade);
        this.motivo = motivo;
        this.setMultiplicador(2);
        this.setAdiavel(true);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
