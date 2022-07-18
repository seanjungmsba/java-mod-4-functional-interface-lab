public class Main {
    public static void main(String[] args) {
        ConcatStringFunction func = str -> String.join("", str).toUpperCase();
        String res = func.apply("banana", "grape", "smoothie");
        System.out.println(res); // BANANAGRAPESMOOTHIE

        String res2 = func.apply("apple", "orange", "pineapple", "smoothie");
        System.out.println(res2); // APPLEORANGEPINEAPPLESMOOTHIE
    }
}

@FunctionalInterface
interface ConcatStringFunction {
    String apply(String... args);
}

class MyConcatString implements ConcatStringFunction {
    @Override
    public String apply(String... args) {
        for (String arg : args) {
            return arg;
        }
        return null;
    }
}