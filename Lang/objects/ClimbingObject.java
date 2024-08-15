import java.util.*;

public class ClimbingObject {
    String type;
    Map<String, Object> attributes;

    public ClimbingObject(String type, Map<String, Object> attributes) {
        this.type = type;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return type;
        // return super.toString();
    }
}