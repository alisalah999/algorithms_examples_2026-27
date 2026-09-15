package Class_Work;

import java.util.Scanner;

public class security_Q {
    static void main() {
        Scanner input = new Scanner(System.in);

        String Seq_Q = "Whats your fav color?";

        System.out.println("Seq Question"+ Seq_Q);

        String Answer_Q = "Blue";

        //Answer validation
        if (Answer_Q.equals("Blue")) {
            System.out.println("Authorized");
        }else {
            System.out.println("Authorization Failed");
        }
}
