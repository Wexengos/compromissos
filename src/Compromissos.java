package src;

public abstract class Compromissos  {


    private int indentificador;
    private String tipoIdentificador;
    private int multiplicador;
    private String data;
    private String hora;
    private int duracao;
    private int grauPrioridade;


    public Compromissos(int indentificador, String tipoIdentificador, int multiplicador, String data, String hora, int duracao, int grauPrioridade) {
        this.indentificador = indentificador;
        this.tipoIdentificador = tipoIdentificador;
        this.multiplicador = multiplicador;
        this.data = data;
        this.hora = hora;
        this.duracao = duracao;
        this.grauPrioridade = grauPrioridade;
    }




    public abstract void imprimiDado();

    public abstract void calulaDuracao();

    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public String getTipoIdentificador() {
        return tipoIdentificador;
    }

    public void setTipoIdentificador(String tipoIdentificador) {
        this.tipoIdentificador = tipoIdentificador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(int grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }


}