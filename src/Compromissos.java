package src;

public abstract class Compromissos
{
    private String data;
    private String hora;
    private int duracao;
    private int indentificador;
    private String tipoIdentificador;
    private int multiplicador;
    private boolean adiavel;
    private int grauPrioridade;

    public Compromissos(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, int grauPrioridade) {
        this.data = data;
        this.hora = hora;
        this.duracao = duracao;
        this.indentificador = indentificador;
        this.tipoIdentificador = tipoIdentificador;
        this.multiplicador = multiplicador;
        this.adiavel = adiavel;
        this.grauPrioridade = grauPrioridade;
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

    public boolean isAdiavel() {
        return adiavel;
    }

    public void setAdiavel(boolean adiavel) {
        this.adiavel = adiavel;
    }

    public int getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(int grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }

    @Override
    public String toString() {
        return "Compromissos{" +
                "data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", duracao=" + duracao +
                ", indentificador=" + indentificador +
                ", tipoIdentificador='" + tipoIdentificador + '\'' +
                ", multiplicador=" + multiplicador +
                ", adiavel=" + adiavel +
                ", grauPrioridade=" + grauPrioridade +
                '}';
    }
}
