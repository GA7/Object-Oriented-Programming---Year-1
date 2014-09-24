/*
 * FIrstYear.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @reference http://www.youtube.com/watch?v=CoDZTCCxwzg
 * 
 * @author Joanna Bautista, x12374571
 * 
 */
import java.io.Serializable;
/**
 *
 * @author Joanna Bautista
 */
public class FIrstYear implements Serializable {
    private String studentIDQ;
    private String courseQ;
    
    public FIrstYear (String studentIDQ, String courseQ){
        this.studentIDQ = studentIDQ;
        this.courseQ = courseQ;
        
    }
    
    public String getStudentIDQ() {
        return studentIDQ;
    }
    
    public void setStudentIDQ(String studentIDQ){
        this.studentIDQ = studentIDQ;
    }
    
    public String getCourseQ(){
        return courseQ;
    }
    public void setCourseQ(String courseQ){
        this.courseQ = courseQ;
    }
   
    
    public String getDetails(){
        return "Student ID:"+studentIDQ+"\nCourse:"+courseQ;
    }
    
}
