/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x12331271
 */
public class IntClass {
    
    private String Name;
    private String StudentNumber;
    private String Message;
    
        public IntClass() {
            Name = new String();
            StudentNumber = new String();
            Message = new String();
            
        }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }
        
}      