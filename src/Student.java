public class Student {
    private static int id_count = 0;

    private String firstName, lastName;
    private int gradeLevel, studentId;
    private double studentGpa;

    public Student() {
        id_count++;
        firstName = "None";
        lastName = "None";
        gradeLevel = 0;
        studentGpa = 0;

        studentId = id_count;
    }

    public Student(String first, String last, int grade, double gpa) {
        id_count++;

        firstName = first;
        lastName = last;

        if (grade >= 0 && grade <= 12) {
            gradeLevel = grade;
        }
        else {
            gradeLevel = 0;
        }

        if (gpa >= 0 && gpa <= 4.5) {
            studentGpa = gpa;
        }
        else {
            studentGpa = 0;
        }

        studentId = id_count;
    }

    public String toString() {
        return String.format("%s, %s%nGPA: %.1f%nGrade level: %d%nID: %d%n", lastName, firstName, studentGpa,
                gradeLevel, studentId);
    }
}
