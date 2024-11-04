import java.math.BigInteger;

public class DH{

    public static void main(String[] args) {
        if (args.length == 1) {
            // Scenario 1: Only private key is provided, print public key
            BigInteger privateKeyA = new BigInteger(args[0]);
            BigInteger base = new BigInteger("5");   // A primitive root modulo p
            BigInteger prime = new BigInteger("23"); // A prime number
            BigInteger publicKeyA = base.modPow(privateKeyA, prime);

            System.out.println("Public Key A: " + publicKeyA.toString());
        } else if (args.length == 2) {
            // Scenario 2: Both private and public keys are provided, calculate session key
            BigInteger privateKeyB = new BigInteger(args[0]); // Private key of party B
            BigInteger publicKeyA = new BigInteger(args[1]);  // Public key of party A
            BigInteger prime = new BigInteger("23");           // The prime number

            BigInteger sessionKeyB = publicKeyA.modPow(privateKeyB, prime);

            System.out.println("Session Key B: " + sessionKeyB.toString());
        } else {
            System.out.println("Please provide the valid number of arguments.");
        }
    }
}
