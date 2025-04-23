import java.util.ArrayList;

public class ListaNomes {
    private ArrayList<String> nomes = new ArrayList<>();

    public void adicionaNome(String parNome){
        nomes.add(parNome);
    }

    public void removerNome(String parNome){
        nomes.remove(parNome);
    }

    public void listarNomes(){
        for (String nome: nomes){
            System.out.println(nome);
        }
    // Tb pode ser colocado em uma lista simples continua
        //System.out.println(nomes);
    }
}
