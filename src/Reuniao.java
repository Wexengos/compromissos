package src;

public class Reuniao extends Compromissos{

    public Reuniao(String data, String hora, int duracao, int indentificador, String tipoIdentificador, int multiplicador, boolean adiavel, int grauPrioridade, String nomeOrientado, String assunto) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel, grauPrioridade, nomeOrientado, assunto);
        this.setMultiplicador(4);
    }
}
