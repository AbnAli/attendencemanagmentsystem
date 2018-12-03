
package attendencemanagmentsystem;


public class Course {
    final int courseId ;
    final String courseName ;
    private int numOfLectures ;
    int lecturesId [] ;
    
    public Course(){
        courseId = 0 ;
        courseName = "k" ;
    }
    
    boolean addLecture(){
        return true ;
    }
    boolean deleteLecture(){
        return true ;
    }
    boolean addCourse(){
        return true ;
    }
    boolean deleteCourse(){
        return true ;
    }
    int getNumberOfLectures(){
        return 0 ;
    }
}
