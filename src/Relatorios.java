package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Relatorios implements AcaoRelatorios {

    private List<Compromissos> compromissosInicial;
    private List<Compromissos> compromissosCofirmados ;
    private List<Compromissos> compromissos_com_conflitos ;
    private List<Compromissos> compromissosAdiados ;
    private List<Compromissos> compromissosCancelados ;


    public void cadastraComp(Compromissos c){
        compromissosInicial.add(c);
    }

    public Relatorios() {
        this.compromissosInicial= new ArrayList<>();
        this.compromissosCofirmados= new ArrayList<>();
        this.compromissos_com_conflitos= new ArrayList<>();
        this.compromissosAdiados= new ArrayList<>();
        this.compromissosCancelados= new ArrayList<>();
    }

    @Override
    public void compromissosConfirmados() {

        /*
        for (int i = 0; i < compromissosInicial.size() - 1; i++) {
            for (int j = i + 1; j < compromissosInicial.size(); j++) {

                try {
                    long epoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(compromissosInicial.get(i).getData()).getTime();
                    long epoch1 = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(compromissosInicial.get(j).getData()).getTime();
                    Date data1 = new Date(epoch);
                    Date data2 = new Date(epoch1);
                    if (data1.compareTo(data2) < 0) {
                        compromissosCofirmados.add(compromissosInicial.get(i));

                    } else {
                        if (data1.compareTo(data2) > 0) {
                            compromissosCofirmados.add(compromissosInicial.get(i));
                        } else {
                            if (data1.compareTo(data2) == 0) {
                                compromissos_com_conflitos.add(compromissosInicial.get(i));
                                compromissos_com_conflitos.add(compromissosInicial.get(j));

                            }

                        }
                    }
                }catch(Exception e){
                            System.out.println("Erro");
                        }

                    }



            }

         */
        }





    @Override
    public void relatorioAdiados() throws IOException {
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

    @Override
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

    @Override
    public void relatorioCompleto() {

    }




    public void imprimeRelatorioInicial(){

        for(int i = 0; i<compromissosInicial.size();i++){

            System.out.println(" "+compromissosInicial.get(i).getIndentificador());
            System.out.println(" " + compromissosInicial.get(i).getHora());

            System.out.println(" " + compromissosInicial.get(i).getHorafinal());

        }

    }

    public void imprimeRelatorioConfirmados() {

        for (int i = 0; i < compromissosCofirmados.size(); i++) {

            System.out.println(" " + compromissosCofirmados.get(i).getIndentificador());



        }
    }

    public void imprimeRelatorioDefeito() {

        for (int i = 0; i < compromissos_com_conflitos.size(); i++) {

            System.out.println(" " + compromissos_com_conflitos.get(i).getIndentificador());


        }


    }
}







