import java.util.Scanner;

public class Calci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();

        int add = a+b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        switch (operation) {
            case 1:System.out.println("add" +add);
            break;
            case 2:System.out.println("sub" +sub);
            break;
            case 3:System.out.println("multi" +multi);
            break;
            case 4:System.out.println("div" +div);
            break;
            case 5:System.out.println("mod" +mod);
            break;
            default:System.out.println("invalid");
                break;
        }

sc.close();
    }    
    
}
