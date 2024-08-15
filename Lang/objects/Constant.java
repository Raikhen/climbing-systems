import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constant {
    public static enum RouteStyle {
        MIXED,
        TRAD,
        SPORT;

        private static final Map<String, RouteStyle> MAP = Stream.of(RouteStyle.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static RouteStyle fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum RopeRating {
        SINGLE,
        TAG_LINE,
        HALF,
        TWIN,
        DOUBLE;

        private static final Map<String, RopeRating> MAP = Stream.of(RopeRating.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static RopeRating fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum AnchorSystem {
        QUAD,
        SLIDING_X,
        W_ANCHOR;

        private static final Map<String, AnchorSystem> MAP = Stream.of(AnchorSystem.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static AnchorSystem fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum DrawType {
        ALPINE_DRAW,
        SPORT_DRAW;

        private static final Map<String, DrawType> MAP = Stream.of(DrawType.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static DrawType fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum CarabinerType {
        LOCKING,
        NON_LOCKING;

        private static final Map<String, CarabinerType> MAP = Stream.of(CarabinerType.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static CarabinerType fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum ProperKnot {
        BARREL,
        OVERHAND_ON_A_BIGHT,
        FIGURE_EIGHT_ON_A_BIGHT,
        FIGURE_EIGHT_FOLLOW_THROUGH,
        BUTTERFLY,
        MUNTER_MULE_OVERHAND;

        private static final Map<String, ProperKnot> MAP = Stream.of(ProperKnot.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static ProperKnot fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum Bend {
        DOUBLE_FISHERMAN,
        TRIPLE_FISHERMAN,
        FLAT_OVERHAND,
        FLEMISH;

        private static final Map<String, Bend> MAP = Stream.of(Bend.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static Bend fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum Hitch {
        CLOVE,
        PRUSIK,
        AUTOBLOCK,
        KLEMHEIST,
        MUNTER;

        private static final Map<String, Hitch> MAP = Stream.of(Hitch.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static Hitch fromName(String name) {
            return MAP.get(name);
        }
    }

    public static enum OtherKnot {
        TANGLE;

        private static final Map<String, OtherKnot> MAP = Stream.of(OtherKnot.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

        public static OtherKnot fromName(String name) {
            return MAP.get(name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi!");
    }
}
