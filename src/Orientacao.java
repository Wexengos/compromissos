package src;

import src.Compromissos;

import java.util.ArrayList;

public class Orientacao extends Compromissos
{
    private boolean adivel;
    private String nomeOrientado;
    private String tipo;
    private String assunto;

    public Orientacao(int indentificador, String tipoIdentificador, int multiplicador, String data, String hora, int duracao, int grauPrioridade, String nomeOrientado, String tipo, String assunto) {
        super(indentificador, tipoIdentificador, multiplicador, data, hora, duracao, grauPrioridade);

        this.nomeOrientado = nomeOrientado;
        this.tipo = tipo;
        this.assunto = assunto;
        setMultiplicador(1);
    }

    public boolean isAdivel() {
        return adivel;
    }

    public void setAdivel(boolean adivel) {
        this.adivel = adivel;
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
    public void calulaDuracao() {

    }
}
