//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String[] students = {"Ahmad", "Max", "John"};
    private static double[] grades = {8.0, 7.0, 6.0};

    public static void main(String[] args) {
        //Assignment Part 1 (for loop)
        int n = 10;
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        //Assignment Part 2 (Array and method)
        getStudentGrades(2);
        getStudentGrades(1);

    }
    public static void getStudentGrades(int index) {
        if (index >= 0 && index < students.length && index < grades.length) {
            System.out.println("Student: " + students[index]);
            System.out.println("Grade: " + grades[index]);
        }
    }
}