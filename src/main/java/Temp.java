import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Temp {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<arr.size(); i++) {

        }

        Lock lock = new ReentrantLock();

        Condition full = lock.newCondition();

    }
}
