import java.util.Scanner;

public class PasswordChanging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.println("please enter your username: ");
        username = input.nextLine();

        System.out.println("please enter your password: ");
        password = input.nextLine();

        if (username.equals("ali") && password.equals("123")) {
            System.out.println("Accesed your account");

        }
        else {
            System.out.println("Please change your password: ");
            password = input.nextLine();
            if (password.equals("123")){
                System.out.println("Password can not be same with last 3 password");
            }
            System.out.println("PLease enter valid password");
            password = input.nextLine();
            System.out.println("Accessed your account");




    }

}
}
