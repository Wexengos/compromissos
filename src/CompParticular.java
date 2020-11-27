package src;

public class CompParticular extends Compromissos{
    private String motivo;
    private String local;


    public CompParticular(int indentificador, String tipoIdentificador, String data ,String hora, int duracao,boolean adiavel, String motivo, String local,int grauPrioridade) {
        super(indentificador, tipoIdentificador, data, hora, duracao, grauPrioridade);
        this.motivo = motivo;
        this.local = local;
        setMultiplicador(2);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }



    @Override
    public void imprimiDado() {

    }

    @Override
    public void converteDuracaoHora() {

    }

}
