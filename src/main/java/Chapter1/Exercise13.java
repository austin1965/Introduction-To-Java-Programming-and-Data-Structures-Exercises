package Chapter1;

public class Exercise13 {
    /*
    Cramer's rule - to compute x and y values from expression of form
        ax + by = e
        cx + dy = f

        Apply formulae
            x = (ed - bf) / (ad - bc)
            y = (af - ec) / (ad - bc)

    Equations:
        3.4x + 50.2y = 44.5
        2.1x + 0.55y = 5.9
 */
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = 0.55;
        double f = 5.9;

        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        System.out.printf("(%f, %f)%n", x, y);
    }
}
