import java.math.BigInteger;

public class AckermannFunction {

    public static BigInteger ack(BigInteger m, BigInteger n) {
        return m.equals(BigInteger.ZERO)
                ? n.add(BigInteger.ONE)
                : ack(m.subtract(BigInteger.ONE),
                n.equals(BigInteger.ZERO) ? BigInteger.ONE : ack(m, n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        // Example usage:
        BigInteger result = ack(BigInteger.valueOf(2), BigInteger.valueOf(2));
        System.out.println("Ackermann(2, 2) = " + result);
    }
}

