package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int swap = 0;
        if (first < second){
            swap = first;
            first = second;
            second = swap;
        }
        for (int i = 0 ; first % second != 0; i++){
            first = first % second;
            swap = first;
            first = second;
            second = swap;
        }
    }
}
