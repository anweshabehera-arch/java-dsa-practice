import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Equal");
        }
        else if(a > b){
            System.out.println("a greater");
        }
        else{
            System.out.println("a lesser");
        }
        sc.close();
    }
    
}
