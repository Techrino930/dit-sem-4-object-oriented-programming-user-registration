import  java.util.*;
public class Main {
    public static void main(String[] args){
       String password;
       String password_confirmation;
       String superUserPassword;
       String superUserPasswordConfirmation;
        Scanner _scn = new Scanner(System.in);
        char choice;

//        NormalUser  user = new NormalUser();
        do {

            System.out.println("Please select the user role:");
        System.out.println("a) Normal User");
        System.out.println("b) Super User");
        System.out.println("c) Exit this program");
        System.out.print("Your Choice : ");
        choice = _scn.nextLine().charAt(0);

    switch (choice) {
        case 'a':
        case 'A':
            NormalUser user = new NormalUser();

            user.setBirthday("2017-08-07");
            System.out.println("User Registration Form");

            System.out.print("Firstname: ");
            user.setFirstName(_scn.nextLine());
            System.out.print("Surname: ");
            user.setSurName(_scn.nextLine());

            // Using do while loop validate the password and re-type password is the same
            do {
                System.out.print("Please Enter the passcode:");
                password = _scn.nextLine();
                System.out.print("Please retype the passcode:");
                password_confirmation = _scn.nextLine();
                if (!password.equals(password_confirmation)) {
                    System.out.println("Password not match try again.");
                }
            } while (!password.equals(password_confirmation));
            user.setPassword(password_confirmation);
            System.out.print("Mobile Number: ");
            user.setMobileNumber(_scn.nextLine());
            System.out.print("Email: ");
            user.setEmail(_scn.nextLine());
            System.out.print("Birthday (Example: 2017-08-07):");
            user.setBirthday(_scn.nextLine());
            System.out.print("Gender (Male M | Female F): ");
            //Scanner for char data type require charAt Method
            user.setGender(_scn.nextLine().charAt(0));

            System.out.println("User Information: ");
            System.out.println("Firstname: " + user.getFirstName());
            System.out.println("Surname: " + user.getsurName());

            System.out.println("Gender : " + user.getGender());

            System.out.println("Mobile Number: " + user.getMobileNumber());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Birthday: " + user.getBirthday());
            System.out.println("Reward Points: " + user.displayRewardPoints());
            break;

        case 'b':
        case 'B':

            SuperUser superUser = new SuperUser();

            superUser.setBirthday("2017-08-07");
            System.out.println("superUser Registration Form");

            System.out.print("Firstname: ");
            superUser.setFirstName(_scn.nextLine());
            System.out.print("Surname: ");
            superUser.setSurName(_scn.nextLine());

            // Using do while loop validate the password and re-type password is the same
            do {
                System.out.print("Please Enter the passcode:");
                superUserPassword = _scn.nextLine();
                System.out.print("Please retype the passcode:");
                superUserPasswordConfirmation = _scn.nextLine();
                if (!superUserPassword.equals(superUserPasswordConfirmation)) {
                    System.out.println("Password not match try again.");
                }
            } while (!superUserPassword.equals(superUserPasswordConfirmation));

            superUser.setPassword(superUserPassword);
            System.out.print("Mobile Number: ");
            superUser.setMobileNumber(_scn.nextLine());
            System.out.print("Email: ");
            superUser.setEmail(_scn.nextLine());
            System.out.print("Birthday (Example: 2017-08-07):");
            superUser.setBirthday(_scn.nextLine());
            System.out.print("Gender (Male M | Female F): ");
            //Scanner for char data type require charAt Method
            superUser.setGender(_scn.nextLine().charAt(0));

            System.out.println("Super User Information: ");
            System.out.println("Firstname: " + superUser.getFirstName());
            System.out.println("Surname: " + superUser.getsurName());

            System.out.println("Gender : " + superUser.getGender());

            System.out.println("Mobile Number: " + superUser.getMobileNumber());
            System.out.println("Email: " + superUser.getEmail());
            System.out.println("Birthday: " + superUser.getBirthday());
            System.out.println("Reward Points: " + superUser.displayRewardPoints());
            break;
        case 'c':
        case 'C':
            System.exit(0);
            break;
        default:
            System.out.println("Invalid Options");
    }

} while(choice !='c' || choice != 'C');

    }
}
