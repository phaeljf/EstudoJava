import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaNomes lista = new ListaNomes();

        lista.adicionaNome("João");
        lista.adicionaNome("Carlo");
        lista.adicionaNome("Raphael");

        lista.listarNomes();

        System.out.println("******************************");
        lista.removerNome("Carlo");

        lista.listarNomes();

        System.out.println("******************************");
        Queue<String> fila = new LinkedList<>();
        fila.add("Pedido 1");
        fila.add("Pedido 2");
        fila.add("Pedido 3");

        System.out.println(fila);

        System.out.println("******************************");
        fila.remove("Pedido 2");

        System.out.println(fila);

        System.out.println("******************************");
        boolean imprimir = true;
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/phael/Downloads/Teste.txt"))){
            String linha;

            while((linha = br.readLine()) != null){
                if (linha.startsWith("=")){
                    imprimir  = false;
                } else if (linha.startsWith("*")){
                    imprimir  = true;
                }
                if(imprimir){
                    System.out.println(linha);
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("************** Agora vai editar arquivo ****************");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/phael/Downloads/Teste.txt", true))) {
            bw.newLine();
            bw.newLine();
            bw.write("Agora a ultima linha é essa!!");

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}