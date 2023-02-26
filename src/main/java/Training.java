public class Training {
    public static void main(String[] args) {
        //Arithmetic operators
        int a = 8;
        int b = 9;
        int sum = a + b;
        System.out.println("Addition result: " + sum);
        int sub = sum - b;
        System.out.println("Subtraction result: " + sub);
        int div = b / a;
        System.out.println("Division result: " + div);
        int mult = sum * b;
        System.out.println("Multiplication result: " + mult);
        int remainderOfDivision = 22 % 4;
        System.out.println("Remainder result of division: " + remainderOfDivision);
        int increment = ++a;
        System.out.println("Prefix increment result : " + increment);
        int decrement = a--;
        System.out.println("Postfix decrement result: " + decrement);

        //Logical operators
        boolean e = true;
        boolean d = false;
        boolean logAnd = e & d;
        System.out.println("Logical AND: " + logAnd);
        boolean logOr = e | d;
        System.out.println("Logical OR: " + logOr);
        boolean logXOR = e ^ d;
        System.out.println("Logical XOR: " + logXOR);
        boolean conditionalAND = d && e;
        System.out.println("Shorthand logical AND: " + conditionalAND);
        boolean conditionalOR = d || e;
        System.out.println("Shorthand logical OR: " + conditionalOR);
        boolean not = !d;
        System.out.println("Logical NOT: " + not);
        System.out.println(!(5 < 10));

        //Overflow on calculation
        byte aByte = 127;
        aByte = (byte) (aByte + 1);
        System.out.println("Overflow: " + aByte);

        int aInteger = Integer.MAX_VALUE;
        int aMaxInteger = aInteger + 1;
        System.out.println("Overflow: " + aMaxInteger);

        //Calculating combinations of data types (int and double)
        double kDouble = 2.88;
        int jInt = 5000;
        System.out.println("Result different types of data:" + (kDouble + jInt));
    }
}
