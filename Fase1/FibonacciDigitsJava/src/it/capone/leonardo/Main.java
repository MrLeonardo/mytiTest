package it.capone.leonardo;

public class Main {

    public static void main(String[] args) {
        try {
            int numberOfDigit = Integer.valueOf(args[0]).intValue();
            long fib1 = 0;
            long fib2 = 1;
            long c = 0;
            int i = 0;

            while (!(String.valueOf(c).length() == numberOfDigit)) {
                i++;
                c = fib(i, fib2, fib1);
                fib2 = fib1;
                fib1 = c;
            }

            System.out.println("Il " + i + "° numero è il primo della sequenza ad essere di " + numberOfDigit + " cifre");
        }
        catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Inserire il paramentro numero di cifre");
        }
    }

    private static long fib(long n, long fib1, long fib2) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        else
            return fib1 + fib2;
    }
}
