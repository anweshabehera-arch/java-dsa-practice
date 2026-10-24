import java.util.Scanner;

public class Average {
    public static double printAverage(int a, int b, int c){
        double avg = (a + b + c)/3;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double result = printAverage(a, b, c); 
        System.out.println(result);

        sc.close();
    }
}
