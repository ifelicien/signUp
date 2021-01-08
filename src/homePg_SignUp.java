import java.util.Scanner;

public class homePg_SignUp {

    public static void main(String[] args) {
        nameCapture();
        emailCapture();
    }



    public static void nameCapture(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your firstname and lastname");
        String firstName = input.next();
        String lastName = input.next();

        String wholeName = firstName + " " + lastName;

        System.out.println(wholeName);

    }

    public static void emailCapture(){
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your email");
        String emailAddress = input.nextLine();

        System.out.println(emailAddress);

    }
}
