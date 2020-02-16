package enum_stuff;

public class ColorApp {
    public static void main(String[] args) {

        Color myColor = Color.BLUE;
        System.out.printf("myColor: %s%n", myColor);
        System.out.printf("myColor rgbValue: %s%n", myColor.rgbValue());

        for(Color c : Color.values()) {
            System.out.printf("%s ",c);
        }

        System.out.println();
    }
}
