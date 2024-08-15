import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum CamSize {
    P1,
    P2,
    P3,
    P4,
    P5,
    P75,
    N1,
    N2,
    N3,
    N4,
    N5,
    N6,
    N7,
    N8;

    private static final Map<String, CamSize> MAP = Stream.of(CamSize.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

    public static CamSize fromName(String name) {
        String parsed = name.replace(".", "P");
        parsed = parsed.replace("#", "N");
        return MAP.get(parsed);
    }
}
