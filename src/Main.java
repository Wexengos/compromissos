//package src;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] src) {
//
//
//        Relatorios r = new Relatorios();
//
//
//        Aula a1 = new Aula(000001, "A", "05/04/2009", " 07:00", 120, 1, "Processamento de Dados I", "Graduacao");
//        Aula a2 = new Aula(000006, "A", "05/04/2009", " 13:00", 120, 1, "Processamento de Dados I", "Graduacao");
//        Aula a3 = new Aula(000004, "A", "05/04/2009", " 11:00", 120, 1, "Processamento de Dados I", "Graduacao");
//        Aula a4 = new Aula(000007, "A", "05/04/2009", " 09:00", 120, 1, "Processamento de Dados I", "Graduacao");
//
//        r.cadastraComp(a1);
//        r.cadastraComp(a2);
//        r.cadastraComp(a3);
//        r.cadastraComp(a4);
//    }
//        /*
//        Scanner ler = new Scanner(System.in);
//
//        System.out.printf("Informe o endereco do arquivo de texto:\n");
//        System.out.printf("Exemplo: D:\\git\\TrabOO\\compromissos\\arquivosLeitura\\agenda.txt \n");
//        //String nome = ler.nextLine(); //essa linha faz a leitura do local do arquivo de entrada pelo teclado
//        String nome = "C:\\Users\\Marcos\\Desktop\\Trab\\compromissos\\arquivosLeitura\\agenda.txt" ; //  <---- aqui ta de maneira fixa , altere para  o seu local para testes
//
//
//        System.out.printf("\nConteúdo do arquivo texto:\n");
//        try {
//            FileReader arq = new FileReader(nome);
//            BufferedReader lerArq = new BufferedReader(arq);
//            String linha = lerArq.readLine();                   // lê a primeira linha
//            String tipoCompromisso = linha.substring(0, 1);
//            // salva o tipo do compromisso   (salva o "A" ou o R ,ou o E por ex)
//
//            ArrayList<Compromissos>compromissos= new ArrayList();
//            Relatorios relatorio;
//            while (lerArq) {
//
//                // verificacoes dos tipos de compromissos e tratamento de leitura dos tipos
//                switch (tipoCompromisso) {
//                    case "A": {
//                        System.out.println(linha);
//                        int idCompromisso = Integer.parseInt(linha.substring(1, 7)); // VERIFICAR COM EDMAR SE TA OK
//
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String dataCompromisso = linha.substring(0, 10);
//                        String horaCompromisso = linha.substring(11, 16);
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int duracaoCompromisso = Integer.parseInt(linha.substring(0, 3));
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String disciplinaAula = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String tipoAula = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int grauPrioridadeCompromisso = Integer.parseInt(linha);
//
//
//
//
//                    }
//                    case "O": {
//                        System.out.println(linha);
//                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String dataCompromisso = linha.substring(0, 10);
//                        String horaCompromisso = linha.substring(11, 16);
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int duracaoCompromisso = Integer.parseInt(linha.substring(0, 3));
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        boolean adiavel = false;
//                        if (linha.equals("true")) {
//                            adiavel = true;
//                        }
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String nomeOrientado = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String disciplinaAula = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String assunto = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int grauPrioridade = Integer.parseInt(linha);
//
//
//                    }
//                    case "R": {
//                        System.out.println(linha);
//                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String dataCompromisso = linha.substring(0, 10);
//                        String horaCompromisso = linha.substring(11, 16);
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int duracaoCompromisso = Integer.parseInt(linha.substring(0, 3));
//                        boolean adiavel = false;
//                        if (linha.equals("true")) {
//                            adiavel = true;
//                        }
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String assunto = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int grauPrioridade = Integer.parseInt(linha);
//
//                    }
//                    case "E": {
//                        System.out.println(linha);
//                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String dataCompromisso = linha.substring(0, 10);
//                        String horaCompromisso = linha.substring(11, 16);
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int duracaoCompromisso = Integer.parseInt(linha.substring(0, 3));
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String local = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int grauPrioridade = Integer.parseInt(linha);
//
//
//                    }
//                    case "P": {
//                        System.out.println(linha);
//                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String dataCompromisso = linha.substring(0, 10);
//                        String horaCompromisso = linha.substring(11, 16);
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int duracaoCompromisso = Integer.parseInt(linha.substring(0, 3));
//                        boolean adiavel = false;
//                        if (linha.equals("true")) {
//                            adiavel = true;
//                        }
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        String local = linha;
//                        linha = lerArq.readLine();
//                        System.out.println(linha);
//                        int grauPrioridade = Integer.parseInt(linha);
//                    }
//
//                }
//            }
//            arq.close();
//        } catch (IOException e) {
//            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
//        }
//
//        System.out.println();
//    }
//*/
//}
////D:\git\TrabOO\compromissos\arquivosLeitura\agenda.txt
