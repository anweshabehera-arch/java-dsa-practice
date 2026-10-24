import java.util.Scanner;

public class Calculater {
    public  static  void  main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int calci = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;


        switch ((calci)) {
        case 1: System.out.println("add" +add);
        break;
        case 2: System.out.println("sub" +sub);
        break;
        case 3:System.out.println("multi" +multi);
        break;
        case 4: System.out.println("div" +div);
        break;
        case 5: System.out.println("mod" +mod);
        break;
        
        default: System.out.println("Invalid");
        break;
        }
        sc.close();
    }
    
}
