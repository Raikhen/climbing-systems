import javafx.application.Application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Route extends ClimbingObject {

    public Route(HashMap<String, Object> route) {
        super("Route", route);
    }

    public String getDanger() {
        // Assuming 'protection' is a List of Objects, where each Object represents a protection point
        List<Object> pro = (List<Object>) this.attributes.get("protection");

        double current_height = 0;
        for (Object protectionData : pro) {
            // Cast the protectionData to a Map
            Map<String, Object> protectionMap = (Map<String, Object>) protectionData;

            // Access the length attribute
            double length = new Length((String) protectionMap.get("length")).getLengthInMeters();

            // Check danger levels
            if (current_height >= 49 && (2 * length - current_height) > 0) {
                return "X";
            } else if (current_height > 35 && (2 * length - current_height) > 0) {
                return "R";
            } else if (current_height > 15 && (2 * length - current_height) > 0) {
                return "PG13";
            }

            current_height += length;
        }

        return "pg"; // Default danger level if none of the conditions are met
    }

    public void visualizeRoute() {
        // Assuming 'protection' is a List of Objects, where each Object represents a protection point
        List<Object> pro = (List<Object>) this.attributes.get("protection");

        // Initialize the array with the correct size
        double[][] inputVectors = new double[pro.size()][3];

        for (int i = 0; i < pro.size(); i++) {
            // Assuming pro.get(i) returns an Object array, where index 0 is the type and index 1 contains attributes
            Object[] protectionData = (Object[]) pro.get(i);

            // Access the length attribute
            String lengthString = (String) ((Map<String, Object>) protectionData[1]).get("length");
            Length length = new Length(lengthString);

            // Determine the type
            String protectionType = (String) ((Map<String, Object>) protectionData[0]).get("type");
            double type = 0;
            if ("Bolt".equals(protectionType)) {
                type = 2;
            } else if ("Cam".equals(protectionType)) {
                type = 1;
            } else {
                type = 3; // Default to 3 for other types
            }

            // Access the angle and store values in the inputVectors array
            double angle = (double) ((Map<String, Object>) protectionData[1]).get("angle");
            inputVectors[i][0] = angle;
            inputVectors[i][1] = length.getLengthInMeters();
            inputVectors[i][2] = type;
        }

        // Set vectors and launch the application
        ClimbingRouteVisualizer.setVectors(inputVectors);
        Application.launch(ClimbingRouteVisualizer.class); // Launch JavaFX
    }

}