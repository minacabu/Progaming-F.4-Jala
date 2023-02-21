import java.util.Scanner;

public class AT1 {

    public static int Power(int x, int n) {
        int value;
        value = x;
        for (int i = 0; i <= n; i++) {
            value = x * value;
        }
        System.out.println("the power is: "+value);
        return value;
    }


    public static void main(String[] args) {
        int x, n;
       Scanner read = new Scanner(System.in);
        System.out.print("insert the value to base: ");
        x = read.nextInt();
        System.out.print("insert the value to exponent ");
        n = read.nextInt();
        Power(x,n);

        }
    }


