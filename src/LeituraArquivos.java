package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraArquivos {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o endereco do arquivo de texto:\n");
        System.out.printf("Exemplo: D:\\git\\TrabOO\\compromissos\\arquivosLeitura\\agenda.txt \n");
        //String nome = ler.nextLine(); //essa linha faz a leitura do local do arquivo de entrada pelo teclado
        String nomeArq = "C:\\Users\\Marcos\\Desktop\\Trab\\compromissos\\arquivosLeitura\\agenda.txt"; //  <---- aqui ta de maneira fixa , altere para  o seu local para testes


        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(nomeArq);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();                   // lê a primeira linha
            String tipoCompromisso = linha.substring(0, 1);
            // salva o tipo do compromisso   (salva o "A" ou o R ,ou o E por ex)


            Relatorios relatorio = new Relatorios();

            while (!linha.equals("xxx")) {
                switch (tipoCompromisso) {
                    // verificacoes dos tipos de compromissos e tratamento de leitura dos tipos
                    case "A": {
                        int idCompromisso = Integer.parseInt(linha.substring(1, 7)); // VERIFICAR COM EDMAR SE TA OK
                        linha = lerArq.readLine();
                        String dataCompromisso = linha.substring(0, 10);
                        String horaCompromisso = linha.substring(11, 16);
                        linha = lerArq.readLine();
                        int duracaoCompromisso = Integer.parseInt(linha);
                        linha = lerArq.readLine();
                        boolean adiavel = false;
                        if (linha.equals("true")) {
                            adiavel = true;
                        }
                        String nome = linha;
                        linha = lerArq.readLine();
                        String tipoAula = linha;
                        linha = lerArq.readLine();
                        int grauPrioridadeCompromisso = Integer.parseInt(linha);
                        Aula a = new Aula(idCompromisso,tipoCompromisso,dataCompromisso,horaCompromisso,duracaoCompromisso,grauPrioridadeCompromisso,nome,tipoAula,adiavel);
                        relatorio.cadastraComp(a);


                        linha = lerArq.readLine();
                        linha = lerArq.readLine();
                        tipoCompromisso = linha.substring(0, 1);
                        break;

                    }
                    case "O": {
                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
                        linha = lerArq.readLine();
                        String dataCompromisso = linha.substring(0, 10);
                        String horaCompromisso = linha.substring(11, 16);
                        linha = lerArq.readLine();
                        int duracaoCompromisso = Integer.parseInt(linha);
                        linha = lerArq.readLine();
                        boolean adiavel = false;
                        if (linha.equals("true")) {
                            adiavel = true;
                        }
                        linha = lerArq.readLine();
                        String nomeOrientado = linha;
                        linha = lerArq.readLine();
                        String tipo = linha;
                        linha = lerArq.readLine();
                        String assunto = linha;
                        linha = lerArq.readLine();
                        int grauPrioridadeCompromisso = Integer.parseInt(linha);
                        Orientacao o = new Orientacao(idCompromisso,tipoCompromisso,dataCompromisso,horaCompromisso,duracaoCompromisso,adiavel,nomeOrientado,tipo,assunto,grauPrioridadeCompromisso);
                        relatorio.cadastraComp(o);


                        linha = lerArq.readLine();
                        linha = lerArq.readLine();
                        tipoCompromisso = linha.substring(0, 1);

                        break;


                    }
                    case "R": {
                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
                        linha = lerArq.readLine();
                        String dataCompromisso = linha.substring(0, 10);
                        String horaCompromisso = linha.substring(11, 16);
                        linha = lerArq.readLine();
                        int duracaoCompromisso = Integer.parseInt(linha);
                        linha = lerArq.readLine();
                        boolean adiavel = false;
                        if (linha.equals("true")) {
                            adiavel = true;
                        }
                        linha = lerArq.readLine();
                        String assunto = linha;
                        linha = lerArq.readLine();
                        int grauPrioridadeCompromisso = Integer.parseInt(linha);
                        Reuniao r = new Reuniao(idCompromisso,tipoCompromisso,dataCompromisso,horaCompromisso,duracaoCompromisso,adiavel,assunto,grauPrioridadeCompromisso);
                        relatorio.cadastraComp(r);



                        linha = lerArq.readLine();
                        linha = lerArq.readLine();
                        tipoCompromisso = linha.substring(0, 1);
                        break;

                    }
                    case "E": {
                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
                        linha = lerArq.readLine();
                        String dataCompromisso = linha.substring(0, 10);
                        String horaCompromisso = linha.substring(11, 16);
                        linha = lerArq.readLine();
                        int duracaoCompromisso = Integer.parseInt(linha);
                        linha = lerArq.readLine();
                        boolean adiavel = false;
                        if (linha.equals("true")) {
                            adiavel = true;
                        }


                        String nomeEvento = linha;
                        linha = lerArq.readLine();
                        String local = linha;
                        linha = lerArq.readLine();
                        int grauPrioridadeCompromisso = Integer.parseInt(linha);
                        Evento e = new Evento(idCompromisso,tipoCompromisso,dataCompromisso,horaCompromisso,duracaoCompromisso,nomeEvento,local,grauPrioridadeCompromisso,adiavel);
                        relatorio.cadastraComp(e);



                        linha = lerArq.readLine();
                        linha = lerArq.readLine();
                        tipoCompromisso = linha.substring(0, 1);
                        break;
                    }
                    case "P": {
                        int idCompromisso = Integer.parseInt(linha.substring(1, 7));
                        linha = lerArq.readLine();
                        String dataCompromisso = linha.substring(0, 10);
                        String horaCompromisso = linha.substring(11, 16);
                        linha = lerArq.readLine();
                        int duracaoCompromisso = Integer.parseInt(linha);
                        linha = lerArq.readLine();
                        boolean adiavel = false;
                        if (linha.equals("true")) {
                            adiavel = true;
                        }
                        linha = lerArq.readLine();
                        String motivo = linha;
                        linha = lerArq.readLine();
                        String local = linha;
                        linha = lerArq.readLine();
                        int grauPrioridadeCompromisso = Integer.parseInt(linha);
                        CompParticular cp = new CompParticular(idCompromisso,tipoCompromisso,dataCompromisso,horaCompromisso,duracaoCompromisso,adiavel,motivo,local,grauPrioridadeCompromisso);
                        relatorio.cadastraComp(cp);

                        relatorio.imprimeRelatorioInicial();
                        relatorio.compromissosConfirmados();
                        relatorio.relatorioAdiados();








                        linha = lerArq.readLine();
                        linha = lerArq.readLine();
                        tipoCompromisso = linha.substring(0, 1);
                        break;


                    }
                }

            }
            arq.close();

        } catch (
                IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }


        System.out.println();
    }

}

//void verificaFimArquivo(){
//String teste;
//    teste = lerArq.readLine();
//    teste = lerArq.readLine();
//    teste = lerArq.readLine();
//    if(teste.equals(""))
//        //acabou;
//}


