import java.util.Scanner;
public class zarplata {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int students = get();
        int zp = 0;
        if (students > 1){
            for (int i = 1; i <= 2; i++){
                zp = zp + 125;
            }
            if (students > 2){
                zp = zp + 150;
            }
            if ( students > 3){
                zp = zp +150;
            }
            if (students > 4){
                for (int i = 5; i <= students; i++){
                    zp = zp + 200;
                }
            }
        }
        else {
            zp = 200;
        }
        System.out.println("зарплата за тренировку "+ zp);
    }
    public  static int get(){
        System.out.println("введите число учеников");
        int number;
        number = scanner.nextInt();
        return number;
    }
}
