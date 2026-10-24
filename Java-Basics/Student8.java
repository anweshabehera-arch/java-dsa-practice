// Take student details as input: name, age, and CGPA, then print all three.

import java.util.Scanner;

public class Student8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age =  sc.nextInt();
        double cgpa = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);

        sc.close();
    }
    
}
