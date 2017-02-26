package W2.utils;

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

    public long getElaspedTime(){
        return (System.currentTimeMillis() - startTime);
    }



}
