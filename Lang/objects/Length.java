public class Length {
    private double length; // In meters

    public double getLengthInMeters() {
        return length;
    }

    public Length(String input) {
        double num = Float.parseFloat(input.replaceAll("[^\\d]", ""));
        String type = input.replaceAll("[0-9]|\n| |\t", "");

        switch (type) {
            case "m":
                length = num;
                break;
            case "ft":
                length = num * 0.3048;
                break;
            case "cm":
                length = num * 0.01;
                break;
            case "in":
                length = num * 0.0254;
                break;
        }
    }

    public Length multiplyBy(double x) {
        length *= x;
        return this;
    }

    public static void main(String[] args) {
        Length test = new Length("4 ft");
    }
}
