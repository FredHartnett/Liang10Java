package chpt12;
//Intro to Java Programming 10th ed. Y. Daniel Liang
//Ex 12.1 part b

public class Ex12_1b {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        if (!isAnInt(args[0])) {
            System.out.println("the first arg is not an integer");
            System.exit(0);
        }

        if (!isAnInt(args[2])) {
            System.out.println("the third arg is not an integer");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;

            // Determine the operator
            switch (args[1].charAt(0)) {
                case '+': result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                    break;
                case '-': result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                    break;
                case '.': result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                    break;
                case '/': result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
            }
        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

    private static boolean isAnInt(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }

        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                return true;
            }
        }

        return false;
    }
}