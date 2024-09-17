import java.math.BigInteger;

public class Ackermann03 {

    private static BigInteger ipow(BigInteger base, BigInteger exp) {
        BigInteger result = BigInteger.ONE;
        while (!exp.equals(BigInteger.ZERO)) {
            if (exp.testBit(0)) {
                result = result.multiply(base);
            }
            exp = exp.shiftRight(1);
            base = base.multiply(base);
        }
        return result;
    }

    private static BigInteger ackermann(int m, BigInteger n) {
        if (m == 0) {
            return n.add(BigInteger.ONE);
        } else if (m == 1) {
            return n.add(BigInteger.valueOf(2));
        } else if (m == 2) {
            return BigInteger.valueOf(3).add(BigInteger.valueOf(2).multiply(n));
        } else if (m == 3) {
            return BigInteger.valueOf(5).add(BigInteger.valueOf(8)
                    .multiply(ipow(BigInteger.valueOf(2), n).subtract(BigInteger.ONE)));
        } else {
            return n.equals(BigInteger.ZERO)
                    ? ackermann(m - 1, BigInteger.ONE)
                    : ackermann(m - 1, ackermann(m, n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        for (int m = 0; m < 4; ++m) {
            for (int n = 0; n < 10; ++n) {
                System.out.println("A(" + m + ", " + n + ") = " + ackermann(m, BigInteger.valueOf(n)));
            }
        }

        System.out.println("A(4, 1) = " + ackermann(4, BigInteger.ONE));

        BigInteger result = ackermann(4, BigInteger.valueOf(2));
        String text = result.toString();
        System.out.println("A(4, 2) = (" + text.length() + " digits)\n"
                + text.substring(0, Math.min(80, text.length())) + "\n...\n"
                + text.substring(Math.max(0, text.length() - 80)));
    }
}

