import java.util.Scanner;

public class Even {
    public static void isEven(int n){
        if (n % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isEven(n);

        sc.close();
    }
}
