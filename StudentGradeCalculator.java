import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int total = 0;

        for (int i = 0; i < numSubjects; i++) {
            int mark;
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + " (0–100): ");
                mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    break;
                } else {
                    System.out.println("marks are out of range!");
                }
            }
            marks[i] = mark;
            total += mark;
        }

        
        double avg = (double) total / numSubjects;

        String grade;
        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }
        System.out.println("Result Summary:");
        System.out.println("Total Marks: " + total + " out of " + (numSubjects * 100));
        System.out.printf("average Percentage: %.2f%%\n", avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
