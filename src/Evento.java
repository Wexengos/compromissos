package src;
import src.Compromissos;

public class Evento extends Compromissos{
    private String local;
    private String tipo;

    public Evento(String data, String hora, int duracao, int indentificador, char tipoIdentificador, int multiplicador, boolean adiavel, String local, String tipo) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel);
        this.local = local;
        this.tipo = tipo;
        this.setMultiplicador(3);
        this.setAdiavel(false);
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
