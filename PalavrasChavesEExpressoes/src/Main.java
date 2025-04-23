//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //posicaoJogador(("Jose",calcularMaiorPosicao(1500));

    posicaoJogador("João",calcularMaiorPosicao(1500));
    posicaoJogador("Maria",calcularMaiorPosicao(1000));
    posicaoJogador("Pedro",calcularMaiorPosicao(500));
    posicaoJogador("Jose",calcularMaiorPosicao(50));
    posicaoJogador("Arlindo",calcularMaiorPosicao(25));

    }
    public static void posicaoJogador(String nome, int pontuacao) {
        System.out.println(nome +" conseguiu alcançar a posição "+pontuacao +" da colocação!!");
    }

    public static int calcularMaiorPosicao(int pontuacao) {
        int resultado = 4;
        if (pontuacao >= 1000) resultado = 1;
        else if (pontuacao >= 500 && pontuacao < 1000) resultado = 2;
        else if (pontuacao >= 100 && pontuacao < 500)  resultado = 3;
        return resultado;
        }
    }