package delacasa_sms;
import java.io.*;
import java.util.*;
import java.io.Serializable;
/**
 * @author Angelica DC
 */
public class Student implements Serializable {
    private String id;
    private String name;
    private String email;
    private String mobile;
    private Date birthdate;
    private String gender;
    private String branch;
    private String program;
    private String status;

    public Student(String id, String name, String email, String mobile, Date birthdate, String gender, String branch, String program, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.birthdate = birthdate;
        this.gender = gender;
        this.branch = branch;
        this.program = program;
        this.status = status;
    }

    //Getters
    public String getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getMobile() {return mobile;}
    public Date getBirthdate() {return birthdate;}
    public String getGender() {return gender;}
    public String getBranch() {return branch;}
    public String getProgram() {return program;}
    public String getStatus() {return status;}
    
    //setters
    public void setId(String id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setMobile(String mobile) {this.mobile = mobile;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}
    public void setGender(String gender) {this.gender = gender;}
    public void setBranch(String branch) {this.branch = branch;}
    public void setProgram(String program) {this.program = program;}
    public void setStatus(String status) {this.status = status;}
}
