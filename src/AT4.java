import java.util.Scanner;

public class AT4 {
    public static int Fibonachi(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonachi(n-1) + Fibonachi(n-2);
        }
    }
    public static void main(String[] args) {
        int value;
        Scanner read = new Scanner(System.in);
        System.out.print("Insert the value to sequence ");
        value = Fibonachi(read.nextInt());
        System.out.println(value);
    }
}
