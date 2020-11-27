package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Relatorios implements AcaoRelatorios {

    private List<Compromissos> compromissosInicial;
    private List<Compromissos> compromissosCofirmados;
    private List<Compromissos> compromissos_com_conflitos;
    private List<Compromissos> compromissosAdiados;
    private List<Compromissos> compromissosCancelados;


    public Relatorios() {
        this.compromissosInicial = new ArrayList<>();
        this.compromissosCofirmados = new ArrayList<>();
        this.compromissos_com_conflitos = new ArrayList<>();
        this.compromissosAdiados = new ArrayList<>();
        this.compromissosCancelados = new ArrayList<>();
    }

    public void cadastraComp(Compromissos c) {
        compromissosInicial.add(c);
    }

//    //@Override
//    public void compromissosConfirmados() {
//        System.out.println("america");
//        /*
//        for (int i = 0; i < compromissosInicial.size() - 1; i++) {
//            for (int j = i + 1; j < compromissosInicial.size(); j++) {
//
//                try {
//                    long epoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(compromissosInicial.get(i).getData()).getTime();
//                    long epoch1 = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(compromissosInicial.get(j).getData()).getTime();
//                    Date data1 = new Date(epoch);
//                    Date data2 = new Date(epoch1);
//                    if (data1.compareTo(data2) < 0) {
//                        compromissosCofirmados.add(compromissosInicial.get(i));
//
//                    } else {
//                        if (data1.compareTo(data2) > 0) {
//                            compromissosCofirmados.add(compromissosInicial.get(i));
//                        } else {
//                            if (data1.compareTo(data2) == 0) {
//                                compromissos_com_conflitos.add(compromissosInicial.get(i));
//                                compromissos_com_conflitos.add(compromissosInicial.get(j));
//
//                            }
//
//                        }
//                    }
//                }catch(Exception e){
//                            System.out.println("Erro");
//                        }
//
//                    }
//
//
//
//            }
//
//         */
//        }
//
//
//
//
//
// //   @Override
////    public void relatorioAdiados(){
////        System.out.println("executado");
////        Collections.sort(compromissosAdiados, new Comparator<Compromissos>() {
////            @Override
////            public int compare(Compromissos o1, Compromissos o2) {
////                if(o1.getGrauPrioridade()< o2.getGrauPrioridade())return 1;
////                else if(o1.getGrauPrioridade() > o2.getGrauPrioridade()) return -1;
////                else return 0;
////            }
////        });
////
////        FileWriter arq = new FileWriter("C:\\Users\\Marcos\\Desktop\\Trab\\compromissos\\arquivosLeitura\\teste saida\\relatorioAdiados.txt");
////        PrintWriter gravarArq = new PrintWriter(arq);
////
////
////        for(int i=0;i<compromissosInicial.size();i++){
////
////            gravarArq.printf(" \n"+compromissosInicial.get(i).getIndentificador());
////            gravarArq.printf(" PAU NO CU DO NILMER \n");
////            gravarArq.printf("  \n"+compromissosInicial.get(i).getGrauPrioridade());
////        }
////        arq.close();
////    }
//
//    @Override
//    public void relatorioCancelados() {
//        System.out.println("executado");
//        Collections.sort(compromissosCancelados, new Comparator<Compromissos>() {
//            @Override
//            public int compare(Compromissos o1, Compromissos o2) {
//                if(o1.getDuracao()< o2.getDuracao())return -1;
//                else if(o1.getDuracao()< o2.getDuracao()) return 1;
//                else return 0;
//            }
//        });
//
//        FileWriter arq = new FileWriter("C:\\Users\\Marcos\\Desktop\\Trab\\compromissos\\arquivosLeitura\\teste saida\\relatorioCancelados.txt");
//        PrintWriter gravarArq = new PrintWriter(arq);
//
//
//        for(int i=0;i<compromissosCancelados.size();i++){
//
//            gravarArq.printf(" \n"+compromissosCancelados.get(i).getIndentificador());
//            gravarArq.printf(" PAU NO CU DO NILMER \n");
//            gravarArq.printf("  \n"+compromissosCancelados.get(i).getGrauPrioridade());
//        }
//        arq.close();
//
//
//
//    }
//
//    @Override
//    public void relatorioCompleto() {
//
//    }
//


    public void imprimeRelatorioInicial() {

        for (int i = 0; i < compromissosInicial.size(); i++) {
            try {
                System.out.println(" " + compromissosInicial.get(i).getIndentificador());
                System.out.println(" " + compromissosInicial.get(i).getHora());
                System.out.println(" inicio  " + compromissosInicial.get(i).getInicioCompromisso());
                System.out.println(" final   " + compromissosInicial.get(i).getFinalCompromisso());
            } catch (Exception e) {
                System.out.println("problema dentro do ImprimeRelatorioInicial");
            }
        }

    }

    public void imprimeRelatorioConfirmados() {

        for (int i = 0; i < compromissosCofirmados.size(); i++) {
            System.out.println("-------------------------------------------------");
            System.out.println(" " + compromissosCofirmados.get(i).getData());
            System.out.println(" " + compromissosCofirmados.get(i).getHora());
            System.out.println("-------------------------------------------------");


        }
    }

    public void imprimeRelatorioDefeito() {

        for (int i = 0; i < compromissos_com_conflitos.size(); i++) {
            System.out.println("-------------------------------------------------");
            System.out.println(" " + compromissos_com_conflitos.get(i).getData());
            System.out.println(" " + compromissos_com_conflitos.get(i).getHora());
            System.out.println("-------------------------------------------------");


        }


    }

    public void imprimeAdiados() {
        for (int i = 0; i < compromissosAdiados.size(); i++) {
            System.out.println("-------------------------------------------------");
            System.out.println(" " + compromissosAdiados.get(i).getData());
            System.out.println(" " + compromissosAdiados.get(i).getHora());
            System.out.println("-------------------------------------------------");

        }
    }

    public void imprimeCancelados() {
        for (int i = 0; i < compromissosCancelados.size(); i++) {
            System.out.println("-------------------------------------------------");
            System.out.println(" " + compromissosCancelados.get(i).getData());
            System.out.println(" " + compromissosCancelados.get(i).getHora());
            System.out.println("-------------------------------------------------");

        }
    }

    @Override
    public void relatorioAdiados() {

    }

    @Override
    public void relatorioCancelados() {

    }

    @Override
    public void relatorioCompleto() {

    }

    @Override
    public void compromissosConfirmados() {


        for (int i = 0; i < compromissosInicial.size() - 1; i++) {
            for (int j = i + 1; j < compromissosInicial.size(); j++) {

                if (compromissosInicial.get(i).getData().equals(compromissosInicial.get(j).getData())) {
                    if (compromissosInicial.get(i).getFinalCompromisso() > compromissosInicial.get(j).getInicioCompromisso()) {


                        compromissosInicial.get(i).setConflito(true);
                        compromissosInicial.get(j).setConflito(true);
                    }


                } else if (compromissosInicial.get(i).getInicioCompromisso() == compromissosInicial.get(j).getInicioCompromisso()) {

                    compromissosInicial.get(i).setConflito(true);
                    compromissosInicial.get(j).setConflito(true);

                }

            }

        }
        for (int i = 0; i < compromissosInicial.size(); i++) {

            if (!compromissosInicial.get(i).getConflito() && !compromissosInicial.get(i).getAdd()) {
                compromissosCofirmados.add(compromissosInicial.get(i));
                compromissosInicial.get(i).setAdd(true);

            } else if (!compromissosInicial.get(i).getAdd()) {
                compromissos_com_conflitos.add(compromissosInicial.get(i));
                compromissosInicial.get(i).setAdd(true);

            }
        }
    }


    @Override

    public void compromissosAdiados() {


        for (int i = 0; i < compromissos_com_conflitos.size() - 1; i++) {
            
            for (int j = i + 1; j < compromissos_com_conflitos.size(); j++) {


                if (compromissos_com_conflitos.get(i).getData().equals(compromissos_com_conflitos.get(j).getData())) {


                    if (compromissos_com_conflitos.get(i).getGrauPrioridade() > compromissos_com_conflitos.get(j).getGrauPrioridade()) {

                        if (!compromissos_com_conflitos.get(j).getAdiavel()) {

                            compromissosAdiados.add(compromissos_com_conflitos.get(j));

                        } else {

                            compromissosCancelados.add(compromissos_com_conflitos.get(j));

                        }

                    } else if (compromissos_com_conflitos.get(i).getGrauPrioridade() < compromissos_com_conflitos.get(j).getGrauPrioridade()) {

                        if (!compromissos_com_conflitos.get(i).getAdiavel()) {

                            compromissosAdiados.add(compromissos_com_conflitos.get(i));

                        } else {
                            compromissosCancelados.add(compromissos_com_conflitos.get(i));

                        }
                    } else if (compromissos_com_conflitos.get(i).getGrauPrioridade() == compromissos_com_conflitos.get(j).getGrauPrioridade()) {

                        if (compromissos_com_conflitos.get(i).getInicioCompromisso() > compromissos_com_conflitos.get(j).getInicioCompromisso()) {
                            if (compromissos_com_conflitos.get(j).getAdiavel()) {

                                compromissosAdiados.add(compromissos_com_conflitos.get(j));
                            } else {
                                compromissosCancelados.add(compromissos_com_conflitos.get(j));

                            }
                        } else if (compromissos_com_conflitos.get(i).getInicioCompromisso() < compromissos_com_conflitos.get(j).getInicioCompromisso()) {

                            if (!compromissos_com_conflitos.get(i).getAdiavel()) {

                                compromissosAdiados.add(compromissos_com_conflitos.get(i));

                            } else {
                                compromissosCancelados.add(compromissos_com_conflitos.get(i));

                            }
                        }

                    } else {

                        SortedSet<String> ss = new TreeSet<String>();
                        ss.add(compromissos_com_conflitos.get(i).getTipoIdentificador());
                        ss.add(compromissos_com_conflitos.get(j).getTipoIdentificador());


                        if (ss.first().equals(compromissos_com_conflitos.get(i).getTipoIdentificador())) {


                            compromissos_com_conflitos.get(i).setConfirmado(true);

                            if (!compromissos_com_conflitos.get(j).getAdiavel()) {

                                compromissosAdiados.add(compromissos_com_conflitos.get(j));

                                compromissos_com_conflitos.remove(j);

                            }

                        } else {


                            compromissos_com_conflitos.get(j).setConfirmado(true);

                            if (!compromissos_com_conflitos.get(j).getAdiavel()) {

                                compromissosAdiados.add(compromissos_com_conflitos.get(i));

                                compromissos_com_conflitos.remove(i);

                            }
                        }


                    }
                }
            }

        }


    }
}








   /* @Override
    public void compromissoCancelados() {
        for (int i = 0; i < compromissos_com_conflitos.size() - 1; i++) {
            for (int j = i + 1; j < compromissos_com_conflitos.size(); j++) {



            }
        }

    */
















///

//o inicio do maior tem que ser maior doq o final do primeiro
//
//o maior inicio tem que ser maior doq o fim do menor inicio



//
//long maiorInicio =






// if(inicioComp2<finalComp1){
////                System.out.println("deu conflito pois o compromisso 1 ainda nao terminou");
////
////            }
////            else{
////                adiciona esse compromisso a lista de confirmados
////            }


//if (compromissosInicial.get(j).getInicioCompromisso() < compromissosInicial.get(i).getFinalCompromisso()) {
//                        //esse tem que ser smp menor
//                        System.out.println("DEU CONFLITO DO : " + compromissosInicial.get(j).getIndentificador() + "  com o : " + compromissosInicial.get(i).getIndentificador());
//                        compromissosInicial.get(i).setConflito(true);
//                        compromissosInicial.get(j).setConflito(true);
//                    } else {
//                        // System.out.println("adicionar agr o compromisso na lista de confirmados");
//                        if (!compromissosInicial.get(i).getConflito()) {
//                            compromissosCofirmados.add(compromissosInicial.get(i));
//                            compromissosInicial.get(i).setConflito(true);
//                        } else {
//                            // System.out.println("vou add oce nao");
//                        }
//                        if (!compromissosInicial.get(j).getConflito()) {
//                            compromissosCofirmados.add(compromissosInicial.get(j));
//                            compromissosInicial.get(j).setConflito(true);
//                        } else {
//                            //  System.out.println("vou add oce nao");
//                        }
//                    }