package src;

import src.Compromissos;

public class Aula extends Compromissos
{
    private String nomeDisciplina;
    private String tipo;

    public Aula(int indentificador, String tipoIdentificador, int multiplicador, String data, String hora, int duracao, int grauPrioridade, String nomeDisciplina, String tipo) {
        super(indentificador, tipoIdentificador, multiplicador, data, hora, duracao, grauPrioridade);
        this.nomeDisciplina = nomeDisciplina;
        this.tipo = tipo;
        setMultiplicador(2);
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimiDado() {
        System.out.println();
    }

    @Override
    public void calulaDuracao() {

    }
}
