import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Registration {

//    Attribute
    private String firstName, surName, password, email, mobileNumber;
    private Date birthday;
    private char gender;


//    Constructor

    public Registration(String firstName, String surName, String password, String email, String mobileNumber, Date birthday, char gender) throws ParseException {
        this.firstName = firstName;
        this.surName = surName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.birthday = birthday;
        this.gender = gender;

    }
//    Default Constructor

    public Registration() {

    }

//Getter
    public char getGender(){
        return gender;
    }

    // Setter
    public void setGender(char gender){
        this.gender = gender;
    }
    public Date getBirthday(){
        return birthday;
    }

    //Passed by value should be String , and used SimpleDateFormat Class method convert it into Date data Type
    public void setBirthday(String dateInString){
    //Create an object called formatter which use the SimpleDateFormat Class, SimpleDateFormat
        // Constructor must passed in the date format after convert it from string
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //Using try and catch to ensure the string is the right format to be passed in
            Date date = formatter.parse(dateInString);
            this.birthday = date;

        } catch (ParseException e) {
            // If the string isn't fulfill the date format requirement throw the exception
            e.printStackTrace();
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getsurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


}
