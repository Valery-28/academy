package homework1;
public class Exercise4 {
    public static void main(String[] args) {
        double n = 2;
        double stepn=0;
        double sum;
        for (sum=0;sum<1_000_000;stepn++) {
            sum = Math.pow(n, stepn);
            System.out.println(sum);
        }
    }
}
