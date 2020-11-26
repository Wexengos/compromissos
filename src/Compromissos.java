package src;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Compromissos {


    private int indentificador;
    private String tipoIdentificador;
    private int multiplicador;
    private String data;
    private String hora;
    private int duracao;
    private int grauPrioridade;
    private String horafinal;


    public Compromissos(int indentificador, String tipoIdentificador, String data, String hora, int duracao, int grauPrioridade) throws ParseException {
        this.indentificador = indentificador;
        this.tipoIdentificador = tipoIdentificador;
        this.multiplicador = 2;
        this.data = data;
        this.hora = hora;
        this.duracao = duracao;
        this.grauPrioridade = grauPrioridade;
        this.horafinal=horafinal;


    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    public abstract void imprimiDado();

    public abstract void converteDuracaoHora();

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

    @Override
    public String toString() {
        return "Compromissos{" +
                "indentificador=" + indentificador +
                ", tipoIdentificador='" + tipoIdentificador + '\'' +
                ", multiplicador=" + multiplicador +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", duracao=" + duracao +
                ", grauPrioridade=" + grauPrioridade +
                '}';
    }

    public void calculaTempo() throws ParseException {

        long epoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(this.getData()).getTime();
        System.out.println(epoch);
        long duracao = this.getDuracao() * 60000;
        System.out.println(duracao);
        epoch+=duracao;
        System.out.println(epoch);
        Date date = new Date(epoch);
        System.out.println(date.getTime());
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String s = dateFormat.format(date);
        System.out.println(s);



    }
}