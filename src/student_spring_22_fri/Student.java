/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_spring_22_fri;

// comments added from github
// more comments added for fetch test
public class Student {
    
    private int studentId;
    private String studentName;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    
    public int getStudentId(){
        return this.studentId;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    
    public String getStudentName(){
        return this.studentName;
    }
}
