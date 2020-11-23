package src;

public class Reuniao extends Compromissos{

    public Reuniao(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, int grauPrioridade) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel, grauPrioridade);
        this.setMultiplicador(4);
        this.setAdiavel(true);

    }
}
