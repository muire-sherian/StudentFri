/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_spring_22_fri;

/**
 *
 * @author TheMu
 */
public class StudentList {
    
    public static void main(String args[]){
        
        Student[] studentList = new Student[3];
        
        Student s1 = new Student(1, "Eric");
        Student s2 = new Student(2, "Nick");
        Student s3 = new Student(3, "Mitch");
        
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
        
    }
}
