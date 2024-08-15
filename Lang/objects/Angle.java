public class Angle {
    int angle;

    public Angle(String input) {
        String asString = input.replaceAll("[^0-9]", "");
        angle = Integer.parseInt(asString);
    }

    public int getAngle() {
        return angle;
    }
}
