import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Sessao> sessoes;

    Cinema(){
        this.sessoes = new ArrayList<Sessao>();
    }

    public void adicionarSessao(Sessao sessao){
        sessoes.add(sessao);
    }

    public void confirmarOcupacaoPoltrona(int sala, Cliente cliente, String código){
        for (Sessao sessao : sessoes){
            if(sessao.getSala() == sala){
                sessao.ocuparPoltrona(cliente, código);
            }
        }
    }

    public void confirmarDesocupacaoPoltrona(int sala, Cliente cliente, String código){
        for (Sessao sessao : sessoes){
            if(sessao.getSala() == sala){
                sessao.desocuparPoltrona(cliente, código);
            }
        }
    }

    public void lugaresDisponiveis(int sala){
        int index = 0;
        for (Sessao sessao : sessoes){
            if(sessao.getSala() == sala){
                System.out.println("sala "+ (index+1));
                sessao.poltronasDisponiveis();
            }
            index++;
        }
        System.out.println("-------------");
    }
}
