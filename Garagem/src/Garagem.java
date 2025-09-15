import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private List<Vaga> vagas;

    public Garagem() {
        this.vagas = new ArrayList<Vaga>();
    }

    public void adicionarVaga(Vaga vaga){
        vagas.add(vaga);
    }

    public void ocuparVaga(Carro carro, int numero){
        for(Vaga vaga : vagas){
            if(vaga.getNumero() == numero){
                vaga.estacionar(carro);
            }
        }
    }

    public void liberarVaga(Carro carro, int numero){
        for(Vaga vaga : vagas){
            if(vaga.getNumero() == numero){
                vaga.liberar(carro);
            }
        }
    }

    public void mostrarVagas(){
        for(Vaga vaga : vagas){
            System.out.println("Numero da vaga: "+ vaga.getNumero());
            if(vaga.isOcupado()){
                System.out.println("Vaga ocupado pelo carro: "+ vaga.getCarroAtual().getModelo() + " Da placa: "+ vaga.getCarroAtual()
                        .getPlaca());
            }else{
                System.out.println("Vaga vazia");
            }
            System.out.println("");
        }
    }
}
