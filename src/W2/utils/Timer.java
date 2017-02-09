package W2.utils;

import static java.lang.System.currentTimeMillis;

/**
 * Created by Stephen A. on 07/02/2017.
 */
public class Timer {

    private long startTime;

    public Timer(){
        startTime = currentTimeMillis();
    }

    public void start(){
        startTime = currentTimeMillis();
    }

    public long getElaspedTime(){
        return (currentTimeMillis() - startTime);
    }



}
