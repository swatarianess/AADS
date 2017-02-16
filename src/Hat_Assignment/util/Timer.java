package Hat_Assignment.util;

/**
 * Created by Stephen A. on 07/02/2017.
 */
public class Timer {

    private long startTime;

    public Timer(){
        startTime = System.nanoTime();
    }

    public void start(){
        startTime = System.nanoTime();
    }

    public long getElaspedTime(){
        return (System.currentTimeMillis() - startTime);
    }



}
