package POJOS;
// Generated Jan 26, 2018 9:57:26 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Duration generated by hbm2java
 */
public class Duration  implements java.io.Serializable {


     private Integer iddura;
     private Integer noOfMonths;
     private Set students = new HashSet(0);

    public Duration() {
    }

    public Duration(Integer noOfMonths, Set students) {
       this.noOfMonths = noOfMonths;
       this.students = students;
    }
   
    public Integer getIddura() {
        return this.iddura;
    }
    
    public void setIddura(Integer iddura) {
        this.iddura = iddura;
    }
    public Integer getNoOfMonths() {
        return this.noOfMonths;
    }
    
    public void setNoOfMonths(Integer noOfMonths) {
        this.noOfMonths = noOfMonths;
    }
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }




}

