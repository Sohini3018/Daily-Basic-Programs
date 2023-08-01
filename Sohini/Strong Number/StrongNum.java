import java.util.*;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (n != 0) {
            int dig = n % 10;
            sum = sum + fact(dig);
            n = n / 10;
        }
        if (sum == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
        sc.close();
    }

    // static int fact(int dig) {
    // int fact = 1;
    // for (int i = dig; i > 1; i--) {
    // fact = fact * i;
    // }
    // return fact;
    // }

    static int fact(int dig) {
        if (dig == 0)
            return 1;
        return dig * fact(dig - 1);
    }
}
