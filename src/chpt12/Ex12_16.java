package chpt12;

import java.io.*;
import java.util.*;

//Ex 12.16 p. 490

public class Ex12_16 {
  public static void main(String[] args) throws Exception {
    String[] strings = {
            "original.txt",
            "newOriginal.txt",
            "t3st",
            "test"
    };

    //prints out the absolute path to the src directory
    //System.out.println(new File("").getAbsolutePath());

    String path = "/Users/fredhartnett/IdeaProjects/Liang10Java/resources/";

    // Check if source file exists
    File sourceFile = new File(path + strings[0]);
    if (!sourceFile.exists()) {
      System.out.println("Source file " + strings[0] + " does not exist");
      System.exit(2);
    }

    // Check if target file exists
    File targetFile = new File(path + strings[1]);
    if (targetFile.exists()) {
      System.out.println("Target file " + strings[1] + " already exists");
      System.exit(3);
    }

    try (
      // Create input and output files
      Scanner input = new Scanner(sourceFile);
      PrintWriter output = new PrintWriter(targetFile);
    ) {        
      while (input.hasNext()) {
        String s1 = input.nextLine();
        String s2 = s1.replaceAll(strings[2], strings[3]);
        output.println(s2);
      }
    }
  }
}
