package src;

public interface Comparador <Compromissos>{

    int comparadorConfirmados(Compromissos c1, Compromissos c2);
    int comparadorAdiados(Compromissos c1, Compromissos c2);
    int comparadorCancelados(Compromissos c1, Compromissos c2);


}
