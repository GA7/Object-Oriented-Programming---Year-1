/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Feedback.java
 * 20/4/2013
 * @author Giovanni Antpala x12527037
 */
public class Feedback {

    private String rcvr;
    private String sender;
    private String message;

    public Feedback() {
        rcvr = new String();
        sender = new String();
        message = new String();
    }

    public String getRcvr() {
        return rcvr;
    }

    public void setRcvr(String rcvr) {
        this.rcvr = rcvr;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
