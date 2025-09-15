import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private int sala;
    private String horario;
    private int capacidade;
    private List<Poltrona> poltronas;
    private Filme filmeatual;

    public Sessao(int sala, int capacidade, String horario) {
        this.sala = sala;
        this.capacidade = capacidade;
        this.horario = horario;
        this.poltronas = new ArrayList<Poltrona>();
    }

    public int getSala() {
        return sala;
    }

    public void poltronasDisponiveis(){
        for(Poltrona poltrona : poltronas){
            if(poltrona.isOcupado() == false){
                System.out.println("Poltrona "+ poltrona.getCódigo() + " está disponivel");
            }
        }
    }

    public void adicionarPoltrona(Poltrona poltrona){
        poltronas.add(poltrona);
    }

    public void ocuparPoltrona(Cliente cliente, String código){
        for(Poltrona poltrona : poltronas){
            if(poltrona.getCódigo().equals(código)) {
                poltrona.ocupar(cliente);
            }
        }
    }

    public void desocuparPoltrona(Cliente cliente, String código){
        for(Poltrona poltrona : poltronas){
            if(poltrona.getCódigo().equals(código)) {
                poltrona.desocupar(cliente);
            }
        }
    }

}
