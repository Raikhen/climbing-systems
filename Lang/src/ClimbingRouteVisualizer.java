/*
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ClimbingRouteVisualizer extends Application {
    // Static variable to hold the vectors
    private static double[][] vectors;

    // Static method to set vectors before launching the application
    public static void setVectors(double[][] inputVectors) {
        vectors = inputVectors;
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Canvas to draw on
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Starting point
        double x = 400; // center of the canvas
        double y = 300; // center of the canvas

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(2);

        // Draw the route
        if (vectors != null) {
            for (double[] vector : vectors) {
                double angle = vector[0];
                double length = vector[1] * 10; // Scale length for visibility
                int protectionType = (int) vector[2]; // Protection type identifier

                // Convert angle to radians
                double angleRad = Math.toRadians(angle);

                // Calculate the end point of the vector
                double newX = x + length * Math.cos(angleRad);
                double newY = y - length * Math.sin(angleRad);

                // Draw the line (vector)
                gc.strokeLine(x, y, newX, newY);

                // Draw the protection symbol at the end point
                drawProtectionSymbol(gc, newX, newY, protectionType);

                // Move to the new position
                x = newX;
                y = newY;
            }
        } else {
            // Handle the case where vectors are null (optional)
            gc.fillText("No vectors provided.", 400, 300);
        }

        // Setup the stage
        primaryStage.setTitle("Climbing Route Visualizer");
        primaryStage.setScene(new Scene(new javafx.scene.Group(canvas)));
        primaryStage.show();
    }

    private void drawProtectionSymbol(GraphicsContext gc, double x, double y, int protectionType) {
        switch (protectionType) {
            case 1: // Cam
                gc.setFill(Color.WHITE);
                gc.fillRect(x-5, y-6, 10, 12);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(x - 5, y - 6, x- 5, y+6); //Draw Red parallel lines
                gc.strokeLine(x + 5, y - 6, x + 5, y+6);
                double radius = 3;
                gc.setStroke(Color.RED);
                gc.setLineWidth(2);
                gc.strokeArc(x - radius, y - radius - 2,
                        2 * radius, 2 * radius,
                        0, 180,
                        ArcType.OPEN);
                gc.strokeLine(x - 2, y - 1, x - 2, y+7); //Draw Red parallel lines
                gc.strokeLine(x + 2, y - 1, x + 2, y+7);
                gc.setStroke(Color.BLUE);
                break;
            case 2: // Bolt
                gc.setFill(Color.WHITE);
                gc.fillRect(x-5, y-6, 10, 12);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(x - 5, y - 6, x + 5, y+6); //Draw Red parallel lines
                gc.strokeLine(x + 5, y - 6, x - 5, y+6);
                gc.setStroke(Color.BLUE);
                break;
            case 3: // Bolt with RapRing
                gc.setFill(Color.WHITE);
                gc.fillRect(x-5, y-6, 10, 12);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(x - 5, y - 6, x + 5, y+6); //Draw X
                gc.strokeLine(x + 5, y - 6, x - 5, y+6);
                gc.setStroke(Color.RED);
                gc.strokeOval(x-9, y, 18, 18); // Draw a red circle in the middle
                break;
            // Add more cases for other protection types
            default:
                gc.setFill(Color.BLACK);
                gc.fillText("?", x - 3, y + 3); // Draw a question mark for unknown types
                break;
        }
    }

    public static void main(String[] args) {
        // Example of dynamic input
        double[][] inputVectors = {
                {-40, 5, 1},  // Cam
                {-30, 3, 2}, // Bolt
                {0, 5, 3}    // Bolt with RapRing
        };

        // Set the vectors dynamically before launching the application
        ClimbingRouteVisualizer.setVectors(inputVectors);

        // Launch the JavaFX application
        Application.launch(ClimbingRouteVisualizer.class, args);
    }
}
 */