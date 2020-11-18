package src;

public class Reuniao extends Compromissos{

    public Reuniao(String data, String hora, int duracao, int indentificador, char tipoIdentificador, int multiplicador, boolean adiavel) {
        super(data, hora, duracao, indentificador, tipoIdentificador, multiplicador, adiavel);
        this.setMultiplicador(4);
        this.setAdiavel(true);

    }
}
