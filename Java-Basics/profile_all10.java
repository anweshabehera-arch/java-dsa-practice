// Take a student's name, age, and marks as input and print a neat student profile.

import java.util.Scanner;

public class profile_all10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        double marks = sc.nextDouble();

        System.out.println("name: " +name);
        System.out.println("age: " +age);
        System.out.println("marks: " +marks);

        sc.close();
    }
}
