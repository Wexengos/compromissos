package src;

import src.Compromissos;

public class Aula extends Compromissos
{
    private String disciplina;
    private String tipo;

    public Aula(String data, String hora, int duracao, int indentificador, char tipoIdentificador, int multiplicador, boolean adiavel) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel);
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
