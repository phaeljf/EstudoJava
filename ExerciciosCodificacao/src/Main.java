import java.io.Serializable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        printConversion(10.25);
//        printConversion(-5.6);
//        printConversion(75.114);
        printMegaBytesAndKiloBytes(20000);

    }
//    public static void checkNumber(int number){
//        System.out.println(number > 0 ? "positive" : (number < 0 ? "negative" : "zero"));
//    }
//
//    public static long toMilesPerHour(double kilometersPerHour) {
//        if (kilometersPerHour < 0) return -1;
//        return Math.round(kilometersPerHour / 1.609);
//    }
//
//    public static void printConversion(double kilometersPerHour){
//        if (kilometersPerHour < 0) System.out.println("Invalid Value");
//        System.out.println(kilometersPerHour+" km/h = " + toMilesPerHour(kilometersPerHour)+ " m/h");
//    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int remainingKilobytes = kiloBytes % 1024;
        int megabytes = kiloBytes / 1024;
        if (kiloBytes < 0) System.out.println("Invalid Value");
        else System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+remainingKilobytes+" KB");
    }


    public static boolean shouldWakeUp (boolean barking,  int hourOfDay){
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) return true;
        if (hourOfDay<0 || hourOfDay>23) return false;
        return false;
    }

    public static boolean hasTeen (int x, y, z){

    }
}
}