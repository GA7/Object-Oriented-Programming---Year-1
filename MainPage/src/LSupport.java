/*
 * Lsupport.java
 * 
 * Rev 1
 * 
 * 20/04/2013
 * 
 * @reference Giovanni Antipala
 * 
 * @author Joanna Bautista, x12374571
 */

/**
 *
 * @author Joanna Bautista, x12374571
 */
public class LSupport {
    protected String message;
    protected String to;
    protected String from;
    
    public LSupport(){
        message = new String();
        to = new String();
        from = new String();
    }
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getTo() {
        return to;
     }
    public void setTo(String to) {
        this.to = to;
    }
    
    public String getFrom() {
        return from;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
}

