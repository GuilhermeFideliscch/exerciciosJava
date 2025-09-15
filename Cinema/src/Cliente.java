public class Cliente {
    private String nome;
    private String cadeira;

    public Cliente(String nome, String cadeira) {
        this.nome = nome;
        this.cadeira = cadeira;
    }

    public String getNome() {
        return nome;
    }

    public String getCadeira() {
        return cadeira;
    }
}
