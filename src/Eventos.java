public class Eventos extends Compromissos
{
    private String nome;
    private String local;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
//Unico compromisso que pode iniciar em um dia e terminar no outro
}
