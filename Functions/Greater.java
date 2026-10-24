import java.util.Scanner;

public class Greater {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } 
        else if (b > a) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = max(a,b);

        System.out.println(result);

        sc.close();
    }
}
