
public class powerxn {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) {
                ans *= x;
            }
            x *= x;
            N /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        powerxn solution = new powerxn();

        double x1 = 2.0;
        int n1 = 10;
        System.out.println(x1 + " raised to the power of " + n1 + " is: " + solution.myPow(x1, n1));

        double x2 = 2.1;
        int n2 = 3;
        System.out.println(x2 + " raised to the power of " + n2 + " is: " + solution.myPow(x2, n2));

        double x3 = 2.0;
        int n3 = -2;
        System.out.println(x3 + " raised to the power of " + n3 + " is: " + solution.myPow(x3, n3));

    }
}
