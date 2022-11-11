package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String l = t + "";
        for (int i = 0; i <= l.length();i++ ){
            if (Character.isDigit(l.charAt(i))){
                sum = sum + l.length();
            }
        }
        System.out.println(sum);
    }
}
