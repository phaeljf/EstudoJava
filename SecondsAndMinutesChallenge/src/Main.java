//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    String Result = getDurationString(4000);
    System.out.println(Result);

    String Result2 = getDurationString(100, 35);
    System.out.println(Result2);

    System.out.println(getDurationString(100, 100));
    }


//    public static String getDurationString(int seconds) {
//        if (seconds >= 0) {
//            int minutes = seconds / 60;
//            int hours = minutes / 60;
//            int restMinutes = minutes % 60;
//            int restSeconds = seconds % 60;
//
//            return hours+"h "+restMinutes+"m "+restSeconds+"s";
//        } else {
//            return "Valor tem que ser maior que zero";
//        }
//    }
//    public static String getDurationString(int minutes, int seconds) {
//        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
//            int newSeconds = minutes * 60 + seconds;
//            return getDurationString(newSeconds);
//        } else {
//            return "Valor de minutos tem que ser maior que zero e o valor de segundos tem que ser maior que zero ou menor que sessenta";
//        }
//    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Valor de Segundos "+seconds+" tem que ser maior que zero";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Valor de Minutos "+minutes+" tem que ser maior que zero";
        }
        if (seconds < 0 || seconds > 59) {
            return "Valor de Segundos "+seconds+" tem que ser maior que zero";
        }
        int hours = minutes / 60;
        int restMinutes = minutes % 60;
        int restSeconds = seconds % 60;
        return hours+"h "+restMinutes+"m "+restSeconds+"s";
    }
}