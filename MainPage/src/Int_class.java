/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x11380471
 */
public class Int_class {

    protected String name;
    protected String course;
    protected String msg;
    
        public Int_class(){
        name = new String();
        course = new String();
        msg = new String();
    }
        
         public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}
