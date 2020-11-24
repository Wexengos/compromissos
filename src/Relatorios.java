package src;

import java.util.ArrayList;
import java.util.Collections;

public class Relatorios implements Comparador<Compromissos>{

    private ArrayList<Compromissos> compromissosInicial = new ArrayList<>();
    private ArrayList<Compromissos> compromissosCofirmados = new ArrayList<>();
    private ArrayList<Compromissos> compromissosAdiados = new ArrayList<>();
    private ArrayList<Compromissos> compromissosCancelados = new ArrayList<>();

    @Override
    public int ordenaTempo(Compromissos outroCompromisso) {
        return 0;
    }






/*
    @Override
    public int comparadorAdiados(Compromissos c1, Compromissos c2) {
        if((c1.getGrauPrioridade()*c1.getMultiplicador())>(c2.getGrauPrioridade()* c2.getMultiplicador())){
            return -1;
        }
        if((c1.getGrauPrioridade()*c1.getMultiplicador())<(c2.getGrauPrioridade()* c2.getMultiplicador())){
            return 1;
        }
        return 0;

    }

    @Override
    public int comparadorCancelados(Compromissos c1, Compromissos c2) {

        if(c1.getDuracao()> c2.getDuracao()){
            return 1;
        }
        if(c1.getDuracao()> c2.getDuracao()){
            return -1;
        }

        return 0;
    }
    */
 */
}
