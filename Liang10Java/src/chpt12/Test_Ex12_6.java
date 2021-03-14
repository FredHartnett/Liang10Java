package chpt12;
//Intro to Java Programming 10th ed. Y. Daniel Liang
//Ex 12.6

public class Test_Ex12_6 {

    public static void main(String[] args) {

        String hex = "";

        try {
//            hex = "AB458";
            hex = "AB4P8";

            System.out.println("The decimal value for hex number "
                    + hex + " is " + Ex12_6.hexToDecimal(hex.toUpperCase()));

        } catch(NumberFormatException e) {
            System.out.println("******************************************");
            System.out.println(e.getMessage());
            System.out.println("******************************************");

        }
    }
}