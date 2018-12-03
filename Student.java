
package attendencemanagmentsystem;

import java.util.ArrayList;

public class Student extends User{
    boolean paid[];
    int courses [] ;
    int lec [] ;
    // att
    
    // constructor
    
    boolean makeRequset(int courseId , int lectureId){
        return true ;
    }
    boolean markAttandenc(int courseId ,int lectureId ,boolean status){
        return true ;
    }
    ArrayList<Lectures> showLectures(){
       ArrayList<Lectures> l = new ArrayList<Lectures>() ;
       return l ;
    }
    boolean newStudent(){
        return true ;
    }
    boolean deleteStudent(){
        return true ;
    }
    
    // show attendance() ;
}
