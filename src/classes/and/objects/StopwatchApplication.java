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
public class StopwatchApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stopwatch stopwatch = new Stopwatch(0, 0, false);
        stopwatch.start();

        for (int i = 0; i < 100000; i++) {
            System.out.println("[" + i + "]" + i);
        }
        System.out.println("stopwatch.getTimeInSec():" + stopwatch.getTimeInSec());;
            stopwatch.reset();
        for (int i = 0; i < 50000; i++) {
            System.out.println("[" + i + "]" + i);
        }
        stopwatch.stop();
        System.out.println("stopwatch.getTimeInSec():" + stopwatch.getTimeInSec());;
        stopwatch.reset();
        for (int i = 0; i < 90000; i++) {
            System.out.println("[" + i + "]" + i);
        }
        System.out.println("stopwatch.getTimeInSec():" + stopwatch.getTimeInSec());;
    }

}
