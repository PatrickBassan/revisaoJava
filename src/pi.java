import java.lang.Math.*;
public class pi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        float p;
        int y;
        float f = 0;
        float r;

        for (int x = 1; x <= n; x+=4) {
            y = x + 2;
            p = (float)1/x - (float)-1/y;
            f += p;
            System.out.println("+1/"+x);
            System.out.println("-1/"+y);
        }
        System.out.println(Math.PI);
        System.out.print((float)4*f);
        System.out.println();
        System.out.print(((float)4*f)/Math.PI);
    }
}