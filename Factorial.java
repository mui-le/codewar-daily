
package codewars.com;

public class Factorial {

    public int factorial(int n) {
        if (n > 12 || n < 0) {
            throw new IllegalArgumentException();
        }
        int i = 1;
        while (i <= n) {
            n = n * i;
            i++;
        }
        return n;
    }

}
