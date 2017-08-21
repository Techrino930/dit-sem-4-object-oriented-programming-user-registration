public class SuperUser extends Registration {

    private String superUserPassword;

    public String getSuperUserPassword(){
        return this.superUserPassword;
    }

    public void setPassword(String newSuperUserPassword){
        this.superUserPassword = newSuperUserPassword;

    }

}
