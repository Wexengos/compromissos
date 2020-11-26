package src;

import src.Compromissos;

import java.text.ParseException;
import java.util.ArrayList;

public class Orientacao extends Compromissos {
    private boolean adiavel;
    private String nomeOrientado;
    private String tipo;
    private String assunto;

    public Orientacao(int indentificador, String tipoIdentificador, String data, String hora, int duracao, boolean adiavel, String nomeOrientado, String tipo, String assunto,int grauPrioridade) throws ParseException {
        super(indentificador, tipoIdentificador, data, hora, duracao, grauPrioridade,);

        this.nomeOrientado = nomeOrientado;
        this.tipo = tipo;
        this.assunto = assunto;
        setMultiplicador(1);
    }

    public boolean isAdiavel() {
        return adiavel;
    }

    public void setAdiavel(boolean adiavel) {
        this.adiavel = adiavel;
    }

    public String getNomeOrientado() {
        return nomeOrientado;
    }

    public void setNomeOrientado(String nomeOrientado) {
        this.nomeOrientado = nomeOrientado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void imprimiDado() {

    }

    @Override
    public void converteDuracaoHora() {

    }

}
