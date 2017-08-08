import  java.util.*;
public class Main {
    public static void main(String[] args){
        String password = "" ;
        String password_confirmation = "";
        Scanner _scn = new Scanner(System.in);
        Registration user = new Registration();

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
            if(!password.equals(password_confirmation)){
                System.out.println("Password not match try again.");
            }
        } while ( !password.equals(password_confirmation));
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
        System.out.println("Firstname: " +  user.getFirstName());
        System.out.println("Surname: " +  user.getsurName());

        System.out.println("Gender : " +  user.getGender());

        System.out.println("Mobile Number: " +  user.getMobileNumber());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Birthday: " + user.getBirthday());
        System.out.println("Reward Points: " +user.displayRewardPoints());
    }
}
