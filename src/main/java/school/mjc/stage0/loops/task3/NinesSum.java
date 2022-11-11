package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int s = 0;

        for (int i = 9; i <= lengthOfLastNumber;i++){

            s += i;
        }
        System.out.println(s);
    }
}
