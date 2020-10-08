/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;
import java.io.Serializable;
/**
 *
 * @author tzc6
 */
public class Student implements Serializable {
    private final long number;
    private final String first;
    private final String last;
    
    public Student(long number){
        this(number, null, null);
        }
    
    public Student(long number, String first){
        this(number, first, null);
        }
    
    public Student(long number, String first, String last){
        this.number = number;
        this.first = first;
        this.last = last;
        }
    
    public String getFirst() {
        return first;
        }
    
    public String getLast() {
        return last;
        }
    
    public long getNumber() {
        return number;
        }
}
