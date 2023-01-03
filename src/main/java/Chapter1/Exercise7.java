package Chapter1;

public class Exercise7 {

    public static void main(String[] args) {
        double sum = 0.0;
        double sumTwo = 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0);

        for (int i = 0; i < 1_000_000; i++) {
            sum += Math.pow(-1, i) * (1.0/(2.0*i + 1.0));

        }

        System.out.println(4 * sum);
        System.out.println(sumTwo);
    }

}
