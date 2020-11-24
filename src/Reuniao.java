package src;

public class Reuniao extends Compromissos {

    private String assunto;
    private boolean adiavel;


    public Reuniao(int indentificador, String tipoIdentificador, int multiplicador, String data, String hora, int duracao, int grauPrioridade, String assunto) {
        super(indentificador, tipoIdentificador, multiplicador, data, hora, duracao, grauPrioridade);
        this.assunto = assunto;
        setMultiplicador(4);
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public boolean isAdiavel() {
        return adiavel;
    }

    public void setAdiavel(boolean adiavel) {
        this.adiavel = adiavel;
    }

    @Override
    public void imprimiDado() {

    }

    @Override
    public void calulaDuracao() {

    }
}