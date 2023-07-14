import java.util.Scanner;

public class CountSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int num = sc.nextInt();
        // int count = 0;
        switch (day) {
            case "mon": {
                num = num - 6;
                break;
            }
            case "tue": {
                num = num - 5;
                break;
            }
            case "wed": {
                num = num - 4;
                break;
            }
            case "thu": {
                num = num - 3;
                break;
            }
            case "fri": {
                num = num - 2;
                break;
            }
            case "sat": {
                num = num - 1;
                break;
            }

        }

        if (num < 0) {
            System.out.println(0);
        } else {
            System.out.println(num / 7 + 1);
        }
        sc.close();

    }
}
