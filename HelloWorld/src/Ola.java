public class Ola {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello, Raphael!");

    double variavel1 = 20d;
    double variavel2 = 80d;
    double totalVariavel = (variavel1+variavel2) * 100d;
    double varModulo = totalVariavel % 40d;
    boolean verificador = (varModulo == 0 ? true : false);

    System.out.println(verificador);

    if (!verificador) {
        System.out.println("Tem resto");
    }




    ;}
}
