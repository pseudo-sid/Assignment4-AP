import java.util.*;
import java.lang.*;
public class trial extends Thread{
    int result,n;
    trial(int n) {
        this.n = n;
        result = 0;
    }
    int fib(int n){
        if(n < 2)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
    @Override
    public void run() {
        result = fib(n);
    }

    public int getResult() { return result; }

    public static void main(String[] args) throws InterruptedException {
        trial t1 = new trial(39);
        trial t2 = new trial(38);
        t1.start(); t2.start();
        t1.join();  t2.join();
        int result = t1.getResult() + t2.getResult();

        System.out.println(result);
    }
}
