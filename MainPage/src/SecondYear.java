/*
 * SecondYear.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @reference  http://www.youtube.com/watch?v=CoDZTCCxwzg
 * 
 *@author Joanna Bautista, x12374571
 */
import java.io.Serializable;
/**
 *
 * @author Joanna Bautista, x12374571
 */
public class SecondYear  extends FIrstYear implements Serializable {
    
    public SecondYear (String studentIDQ,String courseQ){
    super(studentIDQ, courseQ);
    }
    @Override
    public String getDetails(){
        return super.getDetails();
    }
}

