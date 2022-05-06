package exercises;

import java.util.Map;

public class CheckTheScores {

    public static void main(String[] args) {

        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpTest = TestResults.getMakeUpGrades();

        for (var student: makeUpTest.entrySet()) {
            Integer firstTest = gradeBook.get(student.getKey());
            Integer secondTest = makeUpTest.get(student.getKey());

            if (secondTest > firstTest) {
                gradeBook.put(student.getKey(), secondTest);
                System.out.println("Student: " + student.getKey() + ", Grade: "
                        + gradeBook.get(student.getKey()));
            }
        }
        gradeBook.forEach(
                (k,v)-> System.out.println("Student: " + k + ", Grade: " + v)
        );
    }
}
