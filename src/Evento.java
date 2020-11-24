package src;
import src.Compromissos;

public class Evento extends Compromissos{
    private String local;
    private String tipo;

    public Evento(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, int grauPrioridade, String nomeOrientado, String assunto, String local) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel, grauPrioridade, nomeOrientado, assunto);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
