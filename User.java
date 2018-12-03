package attendencemanagmentsystem;


public class User {
    // final int id;
    protected int password;
    protected String name ;
    protected String phone ;
    protected String email ;
    
    
    boolean login(int id,int password ,String userType){
    return true ;
    }
    boolean updatePassword(int oldPassword , int newPassword){
       return true ; 
    }
    boolean checkPassword(int oldPassword){
        return true ;
    }
    
    boolean updateInfo(String name ,String phone ,String email){
        return true ;
    }
    
}
