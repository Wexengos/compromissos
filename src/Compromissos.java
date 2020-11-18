package src;

public abstract class Compromissos
{
    private String data;
    private String hora;
    private int duracao;
    private int indentificador;
    private char tipoIdentificador;
    private int multiplicador;
    private boolean adiavel;

    public Compromissos(String data, String hora, int duracao, int indentificador, char tipoIdentificador, int multiplicador, boolean adiavel) {
        this.data = data;
        this.hora = hora;
        this.duracao = duracao;
        this.indentificador = indentificador;
        this.tipoIdentificador = tipoIdentificador;
        this.multiplicador = multiplicador;
        this.adiavel = adiavel;
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

    public char getTipoIdentificador() {
        return tipoIdentificador;
    }

    public void setTipoIdentificador(char tipoIdentificador) {
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

    @Override
    public String toString() {
        return "Compromissos{" +
                "data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", duracao=" + duracao +
                ", indentificador=" + indentificador +
                ", tipoIdentificador=" + tipoIdentificador +
                ", multiplicador=" + multiplicador +
                ", adiavel=" + adiavel +
                '}';
    }
}
