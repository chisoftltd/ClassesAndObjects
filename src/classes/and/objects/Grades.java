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
public class Grades {

    int aMinimum;
    int bMinimum;
    int cMinimum;
    private char grade;

    public Grades(int aMinimum, int bMinimum, int cMinimum) {
        this.aMinimum = aMinimum;
        this.bMinimum = bMinimum;
        this.cMinimum = cMinimum;
    }

    @Override
    public String toString() {
        return "Grades{" + "aMinimum >= " + aMinimum + ", bMinimum >= " + bMinimum + ", cMinimum >= " + cMinimum + ", else D"+'}';
    }

    public void setMinimums(int a, int b, int c) {
        aMinimum = a;
        bMinimum = b;
        cMinimum = c;
    }

    public char getGrade(int mark) {
        if (mark < cMinimum) {
            grade = 'D';
        } else if (mark < bMinimum) {
            grade = 'C';
        } else if (mark < aMinimum) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        return grade;
    }
}
