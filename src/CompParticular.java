package src;

public class CompParticular extends Compromissos{
    private String motivo;

    public CompParticular(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, int grauPrioridade, String nomeOrientado, String assunto, String motivo) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel, grauPrioridade, nomeOrientado, assunto);
        this.motivo = motivo;
        this.setMultiplicador(2);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
