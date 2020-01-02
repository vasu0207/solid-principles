package main.Single_Responsibility_Principle;

public class User {
    private String userName;
    private String  pwd;
    private String emailId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    // Functionality is not related to Registration of user , move it different class
    public void sendEmail(String emailId){
        System.out.println("User.sendEmail" + emailId);
    }
    // Functionality is not related to Registration of user , move it different class
    public void logError(String logError){
        System.out.println("User.logError" + logError);
    }
    public void regsterUSer(String userName, String pwd, String emailId){
        System.out.println("userName = [" + userName + "], pwd = [" + pwd + "], emailId = [" + emailId + "]");

    }

}
