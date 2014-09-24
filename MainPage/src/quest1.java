/*
 * quest1.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @author Joanna Bautista, x12374571
 * 
 */

/**
 *
 * @author Joanna Bautista, x12374571
 */
public class quest1 {
    protected String date;
    protected String name;
    protected String school;
    protected String course;
    protected String studentnum;
    protected String email;
    
    public quest1(){
        date = new String();
        name = new String();
        school = new String();
        course = new String();
        studentnum = new String();
        email = new String();
    }
    
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
            this.date = date;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
        
    }
    
        public String getSchool() {
        return school;
    }
    
    public void setSchool(String school) {
        this.school = school;
        
    }
        public String getCourse() {
        return course;
    }
    
    public void setCourses(String course) {
        this.course = course;        
    }
    
        public String getStudentnum() {
        return studentnum;
    }
    
    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum;
        
    }
    
        public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
               
    }
    
}
