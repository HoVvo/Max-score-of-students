/*
 Hovhannes Margaryan
 CS/IS 112 - 1251
 11.24.2019
*/
import java.util.Scanner;
public class Lab10
{
    public static void main (String[] args)
    {
        final int numberOfStudents;
        final int numberOfScores = 2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of students:");
        numberOfStudents = keyboard.nextInt();
        double [][] students = new double[numberOfStudents][numberOfScores];

        System.out.println(students.length);

        for (int i = 0; i < students.length; i++)
        {
            System.out.printf("Please enter %d student scores: %n",(i+1));
            for (int j = 0; j < students[i].length; j++)
            {
                students[i][j] = keyboard.nextDouble();
            }
        }
        getMaxScore(students);
    }

    private static void getMaxScore(double[][] m) {
        double MaxScore = 0;
        int MaxStudentNumber = 0;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if(MaxScore < m[i][j])
                {
                    MaxScore = m[i][j];
                    MaxStudentNumber = (i+1);
                }
            }
        }
        System.out.printf("Student %d has a highest score %.1f",MaxStudentNumber,MaxScore);
    }
}
