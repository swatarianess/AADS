package Hat_Assignment;

import Hat_Assignment.util.Timer;

import java.util.ArrayList;

/**
 * Created by Stephen A. on 16/02/2017.
 */
public class HatIml<T> implements Hat<T> {

    private ArrayList<T> storage = new ArrayList<>();
    private Timer timer = new Timer();

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public void give(T item) {
        timer.start();
        storage.add(item);
        System.out.println(timer.getElaspedTime());
    }

    @Override
    public T take() {
        int randomIndex = (int) (Math.random()*storage.size());
        return storage.remove(randomIndex);
        //TODO Checkout return. Complexity should
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
