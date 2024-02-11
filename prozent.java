import java.util.Scanner;
public class prozent {
    static Scanner scanner = new Scanner(System.in);// S= P*(1+i)^n
    public static void main (String[] args){
        System.out.println("введите срок инвестиций");
        double t = get();
        System.out.println("введите первоначальный взнос");
        double P = get();
        System.out.println("введите процент");
        double i = get();
        i = i/100;
        double n = t/12;
        double s = Math. pow((1+i),n);
        double poluchka = P*s;
        String poluchka1 = String.format("%.3f",poluchka);
        System.out.println("вы получите "+ poluchka1 +"₽");
        P = poluchka-P;
        String P1 = String.format("%.3f",P);
        System.out.println("чистая прибыль составит" + P1+"₽");
    }
    public static double get() {
        double srokget = scanner.nextDouble();
        return srokget;
    }
}
