import java.util.HashMap;
import java.util.Map;

/** Class to represent climbing grades for routes. These can be in EITHER the
 * French or YDS grading scale.
 *
 * Grading based on the International Climbing Grade Comparison Chart as per
 * the Mountain Project Website Summer 2024.
 * Link: https://www.mountainproject.com/international-climbing-grades */

public class Grade {
    /** static bidirectional map to store mapping from yds -> french and vice versa */
    private static final Map<String, String> yosemiteToFrenchMap = new HashMap<>();
    private static final Map<String, String> frenchToYosemiteMap = new HashMap<>();
    static {
        /** Initialize Yosemite to French grade mappings */
        // 3rd and 4th grade both map to the same french grade of 1
        yosemiteToFrenchMap.put("3rd", "1");
        yosemiteToFrenchMap.put("4th", "1");
        // 5.0 and 5.1 both map to the same french grade of 2
        yosemiteToFrenchMap.put("5.0", "2");
        yosemiteToFrenchMap.put("5.1", "2");
        // 5.2 and 5.3 both map to the same french grade of 3
        yosemiteToFrenchMap.put("5.2", "3");
        yosemiteToFrenchMap.put("5.3", "3");
        yosemiteToFrenchMap.put("5.4", "4a");
        yosemiteToFrenchMap.put("5.5", "4b");
        yosemiteToFrenchMap.put("5.6", "4c");
        yosemiteToFrenchMap.put("5.7", "5a");
        yosemiteToFrenchMap.put("5.8", "5b");
        yosemiteToFrenchMap.put("5.9", "5c");
        yosemiteToFrenchMap.put("5.10a", "6a");
        yosemiteToFrenchMap.put("5.10b", "6a+");
        yosemiteToFrenchMap.put("5.10c", "6b");
        yosemiteToFrenchMap.put("5.10d", "6b+");
        // 5.11a and 5.11b both map to the same french grade of 6c
        yosemiteToFrenchMap.put("5.11a", "6c");
        yosemiteToFrenchMap.put("5.11b", "6c");
        yosemiteToFrenchMap.put("5.11c", "6c+");
        yosemiteToFrenchMap.put("5.11d", "7a");
        yosemiteToFrenchMap.put("5.12a", "7a+");
        yosemiteToFrenchMap.put("5.12b", "7b");
        yosemiteToFrenchMap.put("5.12c", "7b+");
        yosemiteToFrenchMap.put("5.12d", "7c");
        yosemiteToFrenchMap.put("5.13a", "7c+");
        yosemiteToFrenchMap.put("5.13b", "8a");
        yosemiteToFrenchMap.put("5.13c", "8a+");
        yosemiteToFrenchMap.put("5.13d", "8b");
        yosemiteToFrenchMap.put("5.14a", "8b+");
        yosemiteToFrenchMap.put("5.14b", "8c");
        yosemiteToFrenchMap.put("5.14c", "8c+");
        yosemiteToFrenchMap.put("5.14d", "9a");
        yosemiteToFrenchMap.put("5.15a", "9a+");
        yosemiteToFrenchMap.put("5.15b", "9b");
        yosemiteToFrenchMap.put("5.15c", "9b+");
        yosemiteToFrenchMap.put("5.15d", "9c");

        // Initialize French to Yosemite grade mappings
        for (Map.Entry<String, String> entry : yosemiteToFrenchMap.entrySet()) {
            frenchToYosemiteMap.put(entry.getValue(), entry.getKey());
        }
    }

    /** Methods */
    // Convert Yosemite grade to French grade
    public String getFrenchGrade(String yosemiteGrade) {
        return yosemiteToFrenchMap.getOrDefault(yosemiteGrade, "Unknown grade");
    }

    // Convert French grade to Yosemite grade
    public String getYosemiteGrade(String frenchGrade) {
        return frenchToYosemiteMap.getOrDefault(frenchGrade, "Unknown grade");
    }

    private String grade;

    public Grade(String input) {
        grade = input;
    }

    public String getGrade() {
        return grade;
    }
}