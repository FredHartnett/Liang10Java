package chpt12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("junk_files/scores.txt");
        if(file.exists()) {
            System.out.println("file already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();

    }
}
