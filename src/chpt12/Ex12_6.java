package chpt12;
//Intro to Java Programming 10th ed. Y. Daniel Liang
//Ex 12.6

public class Ex12_6 {

    public static int hexToDecimal(String hex) {

        if(!isHexadecimal(hex))
            throw new NumberFormatException("invalid hex string");

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }

    private static boolean isHexadecimal(String hex) {

        for(int x = 0; x < hex.length(); x++) {
            char c = hex.charAt(x);
            if(!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}