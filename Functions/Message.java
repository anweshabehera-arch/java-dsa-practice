public class Message {
    public static void printMessage(String Message){
        System.out.println(Message);

        for(int i = 1; i<=5; i++){
            System.out.println(Message);
        }
    }

    public static void main(String[] args){
        printMessage("Hello java");
    }
}
