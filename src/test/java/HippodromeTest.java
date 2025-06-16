import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HippodromeTest {
    @Test
    public void constructor_nullValue_throwsException() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Hippodrome(null);
                }
        );
    }

    @Test
    public void constructor_nullValue_throwsExceptionWithMessage() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Hippodrome(null);
                    throw new IllegalArgumentException("Horses cannot be null.");
                }
        );
        Assertions.assertEquals("Horses cannot be null.", exception.getMessage());
    }

    @Test
    public void constructor_emptyListValue_throwsException() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Hippodrome(new ArrayList<>());
                }
        );
    }

    @Test
    public void constructor_emptyListValue_throwsExceptionWithMessage() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Hippodrome(new ArrayList<>());
                    throw new IllegalArgumentException("Horses cannot be empty.");
                }
        );
        Assertions.assertEquals("Horses cannot be empty.", exception.getMessage());
    }

    @Test
    public void getHorses_validHorsesList_returnsSameHorsesList() {
        List<Horse> horses = List.of(
                new Horse("One", 20, 30),
                new Horse("Two", 20, 30),
                new Horse("Three", 20, 30),
                new Horse("Four", 20, 30),
                new Horse("Five", 20, 30),
                new Horse("Six", 20, 30),
                new Horse("Seven", 20, 30),
                new Horse("Eight", 20, 30),
                new Horse("Nine", 20, 30),
                new Horse("Ten", 20, 30),
                new Horse("Eleven", 20, 30),
                new Horse("Twelve", 20, 30),
                new Horse("Thirteen", 20, 30),
                new Horse("Fourteen", 20, 30),
                new Horse("Fifteen", 20, 30),
                new Horse("Sixteen", 20, 30),
                new Horse("Seventeen", 20, 30),
                new Horse("Eighteen", 20, 30),
                new Horse("Nineteen", 20, 30),
                new Horse("Twenty", 20, 30),
                new Horse("TwentyOne", 20, 30),
                new Horse("TwentyTwo", 20, 30),
                new Horse("TwentyThree", 20, 30),
                new Horse("TwentyFour", 20, 30),
                new Horse("TwentyFive", 20, 30),
                new Horse("TwentySix", 20, 30),
                new Horse("TwentySeven", 20, 30),
                new Horse("TwentyEight", 20, 30),
                new Horse("TwentyNine", 20, 30),
                new Horse("Thirty", 20, 30)
        );
        Hippodrome hippodrome = new Hippodrome(horses);
        List<Horse> res = hippodrome.getHorses();
        Assertions.assertIterableEquals(horses, res);
    }

//    @ParameterizedTest
//    @ValueSource(doubles = {0.2, 0.5, 0.9})
//    public void move_callGetRandomDouble_returnGetRandomDouble(double value) {
//        try (MockedStatic<Horse> horseMock = Mockito.mockStatic(Horse.class)) {
//            horseMock.when(() -> Horse.getRandomDouble(0.2, 0.9)).thenReturn(value);
//            Horse horse = new Horse("Alfa", 370, 285);
//            horse.move();
//            Assertions.assertEquals(285 + 370 * value, horse.getDistance());
//            horseMock.verify(() -> Horse.getRandomDouble(0.2, 0.9));
//        }
//    }
}