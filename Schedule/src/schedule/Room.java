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
public class Room implements Serializable {
    
    private final int number;
    public ArrayList<Course> theseCourses = new ArrayList<>();
    
    public Room(int number) {
        this.number = number;
        }
    
    public int getNumber() {
        return number;
        }
    
    public boolean checkCourse(Course check){ //checks if specific course is in this room
        for(Course a: theseCourses){
            if(check.getName().equalsIgnoreCase(a.getName()) == true && check.getTime().equalsIgnoreCase(a.getTime()) == true && check.getRoom() == a.getRoom()){
                return true;
                }
            }
        return false;
        }
    
    public void addCourse(Course obj){
        theseCourses.add(new Course(obj.getName(), obj.getTime(), obj.getRoom()));
        }
    
    public void removeCourse(Course obj){ //removes course from this room
        for(Course a: theseCourses){
            if(obj.getName().equalsIgnoreCase(a.getName()) == true && obj.getTime().equalsIgnoreCase(a.getTime()) == true && obj.getRoom() == a.getRoom()){
                theseCourses.remove(a);
                break;
                }
            }
        }
}
