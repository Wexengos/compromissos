package src;

import src.Compromissos;

import java.util.ArrayList;

public class Orientacao extends Compromissos
{
    private ArrayList<String> orientados;
    private String tipo;

    public Orientacao(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, int grauPrioridade) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel, grauPrioridade);
        this.setMultiplicador(1);
        this.setAdiavel(true);
    }

    public ArrayList<String> getOrientados() {
        return orientados;
    }

    public void setOrientados(ArrayList<String> orientados) {
        this.orientados = orientados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
