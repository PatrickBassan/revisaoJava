public class CalculoPi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        float p;
        double num = 1.0;
        double f = 0;

        for (int x = 1; x < n; x+=2) {
            f += num / x;
            num *= -1.0;
        }
        System.out.println(Math.PI);
        System.out.print((float)4*f);
        System.out.println();
        System.out.print(1-((float)4*f)/Math.PI);
    }
}