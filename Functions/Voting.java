import java.util.Scanner;

public class Voting {
    public static void checkEligibility(int age){
        if(age >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        checkEligibility(age);

        sc.close();
    }
}
