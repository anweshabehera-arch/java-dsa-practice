// Take your name as input and print "Hello, <name>".

import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("hello, " +name );
        sc.close();
    }
    
}
