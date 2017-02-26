package Hat_Assignment.util;

/**
 * Created by Stephen A.
 */
public class Timer {

    private long startTime;

    public Timer(){
        startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return (System.currentTimeMillis() - startTime) / 1000.0;
    }



}
