import java.util.*;

class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============== STUDENT GRADE CALCULATOR ==============");
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int subjectCount = scanner.nextInt();

        int totalMarks = 0;
        int[] marks = new int[subjectCount];

        // Input validation
        for(int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (0-100): ");
            marks[i] = scanner.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("❌ Invalid marks! Enter between (0-100).");
                System.out.print("Re-enter marks for Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            totalMarks += marks[i];
        }

        double percentage = (double) totalMarks / subjectCount;
        String grade;

        if (percentage >= 90) grade = "A+ (Excellent)";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F (Fail)";

        System.out.println("\n================= RESULT =================");
        System.out.println("Student Name     : " + name);
        System.out.println("Total Marks      : " + totalMarks + " / " + (subjectCount * 100));
        System.out.printf("Percentage       : %.2f%%\n", percentage);
        System.out.println("Grade Awarded    : " + grade);
        System.out.println("==========================================");

        scanner.close();
    }
}