/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tzc6
 */
public abstract class School1 {
    //public static ArrayList<Room> rooms = new ArrayList<>();       //All rooms in the entire school
    //public static ArrayList<Student> students = new ArrayList<>(); //All students in the entire school
    //public static ArrayList<Course> courses = new ArrayList<>();   //All courses in the entire school
    
    //-------------------------------------------------------Add Room----------------------------------------------------------------------------------------
    public static boolean addRoom(int number, ArrayList<Room> rooms) {
        if(rooms.isEmpty() == true) {
            rooms.add(new Room(number));
            return false;
            }
        
        else{
            for(Room a: rooms){
                if(number == a.getNumber()){
                    return true;
                    }
                }
            rooms.add(new Room(number));
            return false;
            }
        }
    
    //-------------------------------------------------------Add Student----------------------------------------------------------------------------------------
    public static boolean addStudent(long number, String first, String last, ArrayList<Student> students) {
        for(Student b: students){
            if(first.equalsIgnoreCase(b.getFirst()) && last.equalsIgnoreCase(b.getLast()) && number == b.getNumber()){
                return true;
                }
            }
        
        
        students.add(new Student(number, first, last));
        return false;
        }
    
    //-------------------------------------------------------Add Course----------------------------------------------------------------------------------------
    public static boolean addCourse(String name, int room, String time, ArrayList<Room> rooms, ArrayList<Course> courses) {
        if(rooms.isEmpty() == true){
            courses.add(new Course(name, time, room));
            return true;
            }
        
        for(Course b : courses){
            if(name.equalsIgnoreCase(b.getName())){
                return false;
                }
            }
        courses.add(new Course(name, time, room));
        for(Room a : rooms){
            if(a.getNumber() == room){
                a.addCourse(new Course(name, time, room));
                }
            }
        return true;
        }
}