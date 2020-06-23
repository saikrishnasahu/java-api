package newFeatures.java8;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Declaring repeatable annotation type
@Repeatable(Games.class)
@interface Game {
    String name();

    String day();
}

// Declaring container for repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Games {
    Game[] value();
}

// Repeating annotation
@Game(name = "Cricket", day = "Sunday")
@Game(name = "Hockey", day = "Friday")
@Game(name = "Football", day = "Saturday")


public class TypeAndRepeatingAnnotations {
    public static void main(String[] args) {
//        if you want to avoid NullPointerException in your code, you can declare a string variable like this:
//        @NonNull String str;

//        Following are the examples of type annotations:
//        @NonNull List<String>
//        List<@NonNull String> str
//        Arrays<@NonNegative Integer> sort
//        @Encrypted File file
//        @Open Connection connection
//        void divideInteger(int a, int b) throws @ZeroDivisor ArithmeticException

        // Getting annotation by type into an array
        Game[] game = TypeAndRepeatingAnnotations.class.getAnnotationsByType(Game.class);
        for (Game game2 : game) {    // Iterating values
            System.out.println(game2.name() + " on " + game2.day());
        }
    }
}