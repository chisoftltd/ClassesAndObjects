/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 */
public class GradesApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grades grades = new Grades(75, 65, 50);
        
        System.out.println("Grades are : "+ grades.getGrade(66));
        
       grades.setMinimums(05, 56, 57);
        System.out.println("Minimums : " + grades.toString());
    }
    
}
