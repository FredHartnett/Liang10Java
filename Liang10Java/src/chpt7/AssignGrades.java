package chpt7;
import java.util.Scanner;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class AssignGrades {
    public static void main(String[] args) {
        //get input from user
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of students: ");

        int numStudents = myObj.nextInt();

        int[] grades = new int[numStudents];

        System.out.print("Enter " + grades.length + " scores: ");

        int bestGrade = -1;
        for(int i = 0; i < grades.length; i++) {
            grades[i] = myObj.nextInt();

            if(bestGrade < grades[i]) {
                bestGrade = grades[i];
            }
        }

        char grade;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] >= bestGrade-10)
                grade='A';
            else if(grades[i] >= bestGrade-20)
                grade='B';
            else if(grades[i] >= bestGrade-30)
                grade='C';
            else if(grades[i] >= bestGrade-40)
                grade='D';
            else
                grade='F';

            System.out.println("Student " + i + " score is " + grades[i] + " and the grade is " + grade);
        }
    }
}
