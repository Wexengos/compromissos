package src;

import src.Compromissos;

public class Aula extends Compromissos
{
    private String disciplina;
    private String tipo;

    public Aula(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, int grauPrioridade) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel , grauPrioridade);
        this.setMultiplicador(2);
        this.setAdiavel(false);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
