import java.util.Scanner;
public class zarplata_periud {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("введите количество дней за которое хотите узнать зарплату");
        int N= scanner.nextInt();
        int d = 0;
        int[] day;
        day = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("введите число тренировок за "+(i+1)+" день");
            day[i] = get();
            d+=day[i];
        }
        if (d==0){
            System.out.println("вы не чего не заработали");
        }else{
            System.out.println("вы заработали "+d);
        }


    }
    public static int zarplata(int b) {
        int ff =0;
        if (b!=0) {
            for (int i0 = 1; i0 <= b; i0++) {
                System.out.println("введите число учеников на " + i0 + " тренировке ");
                int number;
                number = scanner.nextInt();
                int students = number;
                int zp = 0;
                if (students > 1) {
                    for (int i = 1; i <= 2; i++) {
                        zp = zp + 125;
                    }
                    if (students > 2) {
                        zp = zp + 150;
                    }
                    if (students > 3) {
                        zp = zp + 150;
                    }
                    if (students > 4) {
                        for (int i = 5; i <= students; i++) {
                            zp = zp + 200;
                        }
                    }
                } else {
                    zp = 200;
                }
                ff += zp;
            }
            return ff;
        }
        else {
            return 0;
        }

    }
    public  static int get(){
        int number1,s;
        number1 = scanner.nextInt();
        s = zarplata(number1);
       return  s;
    }
}

