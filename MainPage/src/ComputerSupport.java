/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ComputerSupport.java
 * 20/4/2013
 * @author Giovanni Antipala x12527037
 */
public class ComputerSupport {
    protected String to;
    protected String from;
    protected String msg;
    
    public ComputerSupport(){
        to = new String();
        from = new String();
        msg = new String();
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    

         
    
}
