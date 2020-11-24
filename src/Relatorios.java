package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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


    public void relatorioAdiados () throws IOException {
        System.out.println("executado");
        Collections.sort(compromissosAdiados, new Comparator<Compromissos>() {
            @Override
            public int compare(Compromissos o1, Compromissos o2) {
                if(o1.getGrauPrioridade()< o2.getGrauPrioridade())return 1;
                else if(o1.getGrauPrioridade() > o2.getGrauPrioridade()) return -1;
                else return 0;
            }
        });

        FileWriter arq = new FileWriter("C:\\Users\\Marcos\\Desktop\\Trab\\compromissos\\arquivosLeitura\\teste saida\\relatorioAdiados.txt");
        PrintWriter gravarArq = new PrintWriter(arq);


        for(int i=0;i<compromissosInicial.size();i++){

            gravarArq.printf(" \n"+compromissosInicial.get(i).getIndentificador());
            gravarArq.printf(" PAU NO CU DO NILMER \n");
            gravarArq.printf("  \n"+compromissosInicial.get(i).getGrauPrioridade());
        }
        arq.close();

    }

    public void relatorioCancelados() throws IOException {
        System.out.println("executado");
        Collections.sort(compromissosCancelados, new Comparator<Compromissos>() {
            @Override
            public int compare(Compromissos o1, Compromissos o2) {
                if(o1.getDuracao()< o2.getDuracao())return -1;
                else if(o1.getDuracao()< o2.getDuracao()) return 1;
                else return 0;
            }
        });

        FileWriter arq = new FileWriter("C:\\Users\\Marcos\\Desktop\\Trab\\compromissos\\arquivosLeitura\\teste saida\\relatorioCancelados.txt");
        PrintWriter gravarArq = new PrintWriter(arq);


        for(int i=0;i<compromissosCancelados.size();i++){

            gravarArq.printf(" \n"+compromissosCancelados.get(i).getIndentificador());
            gravarArq.printf(" PAU NO CU DO NILMER \n");
            gravarArq.printf("  \n"+compromissosCancelados.get(i).getGrauPrioridade());
        }
        arq.close();



    }
    public void relatiorCompleto() {


    }



}







