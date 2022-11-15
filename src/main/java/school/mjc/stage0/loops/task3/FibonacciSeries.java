package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int sum = 0;
        for (int i = 0; i <= lastFibonacci; ++i ){
            sum = ( i - 1 ) + ( i - 2);
        }
        System.out.println(sum);
    }
}
