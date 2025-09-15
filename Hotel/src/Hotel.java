import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<Quarto>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public void adicionarQuartos(Quarto quarto){
        quartos.add(quarto);
    }

    public void hospedar(Hospede hospede, int numeroQuarto){
        for(Quarto quarto : quartos){
            if(quarto.getNumero() == numeroQuarto){
                quarto.ocupar(hospede);
            }
        }
    }

    public void realizarCheckout(int numeroQuarto){
        for(Quarto quarto : quartos){
            if(quarto.getNumero() == numeroQuarto){
                quarto.liberar();
            }
        }
    }

    public void exibirRelatorioOcupacao(){
        for(Quarto quarto: quartos){
            System.out.println("Numero: "+ quarto.getNumero());
            System.out.println("Status: "+ quarto.isOcupado());
            System.out.println("Tipo: "+ quarto.getTipo());
            System.out.println("Preco por noite: "+ quarto.getPrecoPorNoite());
            if(quarto.isOcupado()){
                System.out.println("Hospedes: "+ quarto.getHospedeAtual().getNome());
            }else{
                System.out.println("Nenhum hospede neste quarto");
            }
            System.out.println("");
        }
    }


}
