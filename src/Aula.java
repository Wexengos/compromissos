package src;

import src.Compromissos;

public class Aula extends Compromissos {
    private String nomeDisciplina;
    private String tipo;


    public Aula(int indentificador, String tipoIdentificador, String data, String hora, int duracao, int grauPrioridade, String nomeDisciplina, String tipo,boolean adiavel) {
        super(indentificador, tipoIdentificador, data, hora, duracao, grauPrioridade,adiavel);
        this.nomeDisciplina = nomeDisciplina;
        this.tipo = tipo;
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
    public void converteDuracaoHora() {


    }


}
