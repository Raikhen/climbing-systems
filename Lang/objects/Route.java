/*import java.util.*;

public final class Route extends ClimbingObject {

    public Route(HashMap<String, Object> route) {
        super("Route", route);
    }

    public String getDanger() {
        Object[] pro = (Object[])this.attributes.get("protection");

        double current_height = 0;
        for (int i=0; i < pro.length; i++) {

            if (current_height >= (double)49 && ((double)2 * pro[i][1].attributes.get("length") - current_height) > (double)0) {return "X";}
            else if (current_height > (double)35 && ((double)2 * pro[i][1].attributes.get("length") - current_height) > (double)0) {return "R";}
            else if (current_height > (double)15 && ((double)2 * pro[i][1].attributes.get("length") - current_height) > (double)0) {return "PG13";}
            else {return "pg";}

            current_height = current_height + pro[i][1].attributes.get("length");
        }
    }

    public void visualizeRoute() {
        Object[] pro = (Object[])this.attributes.get("protection");
        double[][] inputVectors = {};

        for (int i=0; i < pro.length; i++) {

            Length length = new Length((String)pro[i][1].attributes.get("length"));

            double type = 0;

            if (pro[i][0].attributes.get("type") == "Bolt") {type = 1;}
            else if (pro[i][0].attributes.get("type") == "Cam") {type = 2;}
            else {type = 3;}

            inputVectors[i] = [(double)pro[i][1].attributes.get("angle"), (double)length.getLengthInMeters(), (double)type];
        }

        ClimbingRouteVisualizer visualizer = new ClimbingRouteVisualizer(inputVectors);
    }
}

 */