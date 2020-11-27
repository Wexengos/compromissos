package src;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Compromissos {


    protected int indentificador;
    protected String tipoIdentificador;
    protected int multiplicador;
    protected String data;
    protected String hora;
    protected int duracao;
    protected int grauPrioridade;
    protected long inicioCompromisso;
    protected long finalCompromisso;
    protected boolean conflito;



    public Compromissos(int indentificador, String tipoIdentificador, String data, String hora, int duracao, int grauPrioridade) {
        this.indentificador = indentificador;
        this.tipoIdentificador = tipoIdentificador;
        this.multiplicador = 2;
        this.data = data;
        this.hora = hora;
        this.duracao = duracao;
        this.grauPrioridade = grauPrioridade;
        this.conflito = false;
        chamaIniciaCalculoTempo();

        //this.horafinal=horafinal;


    }
    public void chamaIniciaCalculoTempo(){
        try {
            calculaTempo();
        }catch (Exception e){
        System.out.println("deuruim");
    }
    }


    public abstract void imprimiDado();

    public abstract void converteDuracaoHora();

    public boolean getConflito() {
        return conflito;
    }

    public void setConflito(boolean conflito) {
        this.conflito = conflito;
    }

    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public String getTipoIdentificador() {
        return tipoIdentificador;
    }

    public void setTipoIdentificador(String tipoIdentificador) {
        this.tipoIdentificador = tipoIdentificador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(int grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }

    public long getInicioCompromisso() {
        return inicioCompromisso;
    }

    public long getFinalCompromisso() {
        return finalCompromisso;
    }

    @Override
    public String toString() {
        return "Compromissos{" +
                "indentificador=" + indentificador +
                ", tipoIdentificador='" + tipoIdentificador + '\'' +
                ", multiplicador=" + multiplicador +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", duracao=" + duracao +
                ", grauPrioridade=" + grauPrioridade +
                '}';
    }

    public void calculaTempo() throws ParseException {
        try{
            //long epoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(this.getData()).getTime();
            SimpleDateFormat teste1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String data1 = this.data;
            String hora1 = this.hora;
            String dataHoraJunto1 = data1.concat(" ".concat(hora1));
            int duracao1 = this.duracao;
            Date date1  = teste1.parse(dataHoraJunto1);
            this.inicioCompromisso= (date1.getTime()/1000)/60;
            this.finalCompromisso = ((date1.getTime()/1000)/60)+duracao1;
        }
        catch (Exception e){
            System.out.println("mingau");
        }
    }
//
//            SimpleDateFormat teste2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//            String data2 = "01/04/2009";
//            String hora2 = "12:30";
//            String dataHoraJunto2 = data2.concat(" ".concat(hora2));
//            int duracao2 = 500;
//            Date date2  = teste2.parse(dataHoraJunto2);
//            long inicioComp2 = (date2.getTime()/1000)/60;
//            long finalComp2 = ((date2.getTime()/1000)/60)+duracao2;
//            System.out.println(inicioComp2);
//            System.out.println(finalComp2);
            //System.out.println((inicioComp2-dataSemDuracao2));

//            if(inicioComp2<finalComp1){
//                System.out.println("deu conflito pois o compromisso 1 ainda nao terminou");
//
//            }
//            else{
//                adiciona esse compromisso a lista de confirmados
//            }



//            String data2 = "01/04/2009";
//            String hora2 = "12:30";
//            int duracao2 = 60;
//            Date date2  = teste.parse(data2);

//            long duracao = this.getDuracao() * 60000;
//            System.out.println(duracao);
//            epoch += duracao;
//            System.out.println(epoch);
//            Date date = new Date(epoch);
//            System.out.println(date.getTime());
//            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//            String s = dateFormat.format(date);
//            System.out.println(s);

}