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
public class Stopwatch {

    private long timeDiff;
    private long starttime;
    private long endtime;
    private boolean running;

    public Stopwatch(long starttime, long endtime, boolean running) {
        this.starttime = starttime;
        this.endtime = endtime;
        this.running = running;
    }

    public void start() {
        starttime = System.currentTimeMillis();
        running = true;
    }

    public void stop() {
        endtime = System.currentTimeMillis();
        running = false;
    }

    public void reset() {
        starttime = 0;
        endtime = 0;
        running = false;
    }

    public double getTimeInSec() {
        if (running == false) {
            timeDiff = endtime - starttime;
        } else {
            timeDiff = System.currentTimeMillis() - starttime;
        }
        return timeDiff;
    }
}
