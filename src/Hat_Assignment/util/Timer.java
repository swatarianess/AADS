package Hat_Assignment.util;

/**
 * Created by Stephen A.
 */
public class Timer {

    private double startTime;

    public Timer(){
        startTime = System.nanoTime();
    }

    public void start(){
        startTime = System.nanoTime();
    }

    public double getElapsedTime(){
        return (System.nanoTime() - startTime);
    }



}
