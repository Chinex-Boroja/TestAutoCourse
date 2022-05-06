package exercises;

import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map<String, Integer> getOriginalGrades() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Angie", 34);
        grades.put("Ramsey", 54);
        grades.put("Caleb", 84);
        grades.put("Nancy", 94);
        grades.put("Manuel", 24);
        grades.put("James", 86);
        grades.put("John", 23);
        grades.put("Angela", 44);
        grades.put("Lilian", 14);
        grades.put("Hottie", 94);
        grades.put("Park", 37);

        return grades;
    }

    public static Map<String, Integer> getMakeUpGrades() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Angie", 98);
        grades.put("Ramsey", 44);
        grades.put("Caleb", 94);
        grades.put("Nancy", 54);
        grades.put("Manuel", 64);
        grades.put("James", 76);
        grades.put("John", 73);
        grades.put("Angela", 54);
        grades.put("Lilian", 64);
        grades.put("Hottie", 84);
        grades.put("Park", 57);

        return grades;
    }

}
