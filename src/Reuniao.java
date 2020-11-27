package src;

public class Reuniao extends Compromissos {

    private String assunto;



    public Reuniao(int indentificador, String tipoIdentificador,String data, String hora, int duracao, boolean adiavel, String assunto,int grauPrioridade) {
        super(indentificador, tipoIdentificador, data, hora, duracao, grauPrioridade,adiavel);
        this.adiavel = adiavel;
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
    public void converteDuracaoHora() {

    }

}