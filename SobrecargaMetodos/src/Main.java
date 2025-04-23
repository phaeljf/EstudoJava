//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        convertToCentimeters(140);
        convertToCentimeters(10,20);

    }

    public static double convertToCentimeters(int x){
        System.out.println("O Valor em cm de "+ x + " inches é: "+ (x * 2.54));
        return 0;
    }

    public static double convertToCentimeters(int x, int y){
        return convertToCentimeters((x * 12) + y);
    }

}