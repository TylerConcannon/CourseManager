/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;
import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author tzc6
 */
public class Course implements Serializable {
    String name;
    String time;
    int room;
    public ArrayList<Student> theseStudents = new ArrayList<>();
    
    public Course(String name) {
        this(name, null, 0);
        }
    
    public Course(String name, String time) {
        this(name, time, 0);
        }
    
    public Course(String name, String time, int room) {
        this.name = name;
        this.time = time;
        this.room = room;
        }
    
    public String getName() {
        return name;
        }
    
    public String getTime() {
        return time;
        }
    
    public int getRoom(){
        return room;
        }
    
    public void addStudent(Student obj){
        theseStudents.add(new Student(obj.getNumber(), obj.getFirst(), obj.getLast()));
        }
    
    public boolean checkStudent(Student check){ //checks if a student is inn this course
        for(Student a: theseStudents){
            if(check.getFirst().equalsIgnoreCase(a.getFirst()) == true && check.getLast().equalsIgnoreCase(a.getLast()) == true && check.getNumber() == a.getNumber()){
                return true;
                }
            }
        return false;
        }
    
    public void removeStudent(Student check){ //removes student from course
        for(Student a: theseStudents){
            if(check.getFirst().equalsIgnoreCase(a.getFirst()) == true && check.getLast().equalsIgnoreCase(a.getLast()) == true && check.getNumber() == a.getNumber()){
                theseStudents.remove(a);
                break;
                }
            }
        }
}
