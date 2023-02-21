import java.util.Scanner;

public class AT2 {
    public static void Baskara(int a, int b,int c){
        int delta;
        double result, result1;
        delta = b*b - 4*a*c;
        result = -b + Math.sqrt(delta)/(2*a);
        result1 = -b - Math.sqrt(delta)/(2*a);
        System.out.println("The results of formula is: ");
        System.out.println("x1 = "+result+" x2 = "+ result1);
    }
    public static void main(String[] args) {
        int a, b, c;
        Scanner read = new Scanner(System.in);
        System.out.println("Lets calculate the function ax² - bx + c");
        System.out.print("Insert the a value ");
        a = read.nextInt();
        System.out.print("Insert the b value ");
        b = read.nextInt();
        System.out.print("Insert the c value ");
        c = read.nextInt();
        if((a * c * 4) > b * b){
            System.out.println("The value will be null, please try again");}
        else{
                Baskara(a,b,c);}

    }
}