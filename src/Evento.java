package src;

import src.Compromissos;

public class Evento extends Compromissos {
    private String local;
    private String nomeEvento;

    public Evento(int indentificador, String tipoIdentificador, String data, String hora, int duracao, String nomeEvento, String local, int grauPrioridade,boolean adiavel) {
        super(indentificador, tipoIdentificador, data, hora, duracao, grauPrioridade,adiavel);
        this.local = local;
        this.nomeEvento = nomeEvento;
        setMultiplicador(3);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    @Override
    public void imprimiDado() {

    }

    @Override
    public void converteDuracaoHora() {

    }


}
