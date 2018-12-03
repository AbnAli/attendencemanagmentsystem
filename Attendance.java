
package attendencemanagmentsystem;


public class Attendance {
    int lectureId ;
    int status ;
    int week ;
    boolean Next ;
    Attendance next ;
    // Date date ;
    
    boolean addAttendance(){
        return true ;
    }
    int mark(int lectureId , int status){
        return 1 ;
    }
}
