package src;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;

public class Relatorios  {

    private ArrayList<Compromissos> compromissosInicial = new ArrayList<>();
    private ArrayList<Compromissos> compromissosCofirmados = new ArrayList<>();
    private ArrayList<Compromissos> compromissosAdiados = new ArrayList<>();
    private ArrayList<Compromissos> compromissosCancelados = new ArrayList<>();


    public void cadastraComp(Compromissos c){
        compromissosInicial.add(c);
    }

    public void CompromissosCofirmados(){
        /*
        System.out.print(" "+compromissosAdiados.get(i).getHora());
        System.out.print("");
        System.out.println(" "+compromissosAdiados.get(i).getData());
        System.out.println(" "+compromissosAdiados.get(i).getIndentificador());
        System.out.println(" PAU NO CU DO NILMER");

         */
    }
    }

    public void relatorioAdiados (){
        System.out.println("executado");
        Collections.sort(compromissosAdiados, new Comparator<Compromissos>() {
            @Override
            public int compare(Compromissos o1, Compromissos o2) {
                if(o1.getGrauPrioridade()< o2.getGrauPrioridade())return 1;
                else if(o1.getGrauPrioridade() > o2.getGrauPrioridade()) return -1;
                else return 0;
            }
        });

        for(int i=0;i<compromissosAdiados.size();i++){

            System.out.println(" "+compromissosAdiados.get(i).getIndentificador());
            System.out.println(" PAU NO CU DO NILMER");
            System.out.println(" "+compromissosAdiados.get(i).getGrauPrioridade());
        }

    }

    public void relatorioCancelados(){
        System.out.println("executado");
        Collections.sort(compromissosCancelados, new Comparator<Compromissos>() {
            @Override
            public int compare(Compromissos o1, Compromissos o2) {
                if(o1.getDuracao()< o2.getDuracao())return -1;
                else if(o1.getDuracao()< o2.getDuracao()) return 1;
                else return 0;
            }
        });

        for(int i=0;i<compromissosAdiados.size();i++){

            System.out.println(" "+compromissosAdiados.get(i).getIndentificador());
            System.out.println(" PAU NO CU DO NILMER");
            System.out.println(" "+compromissosAdiados.get(i).getGrauPrioridade());
        }



    }
    public void relatiorCompleto() {


    }



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

