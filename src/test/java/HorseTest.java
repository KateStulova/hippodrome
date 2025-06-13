import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class HorseTest {
    @Test
    public void constructor_firstValueNull_throwsException() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse(null, 3, 3);
                }
        );
    }

    @Test
    public void constructor_firstValueNull_throwsExceptionWithMessage() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse(null, 3, 3);
                    throw new IllegalArgumentException("Name cannot be null.");
                }
        );
        Assertions.assertEquals("Name cannot be null.", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "'', 1, 1",
            "' ', 2, 2",
            "'\t', 3, 3",
            "'\n', 4, 4",
            "'\r\n', 5, 5"
    })
    public void constructor_firstValueEmptyOrTab_throwsException(String name, double speed, double distance) {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse(name, speed, distance);
                }
        );
    }

    @ParameterizedTest
    @CsvSource({
            "'', 1, 1",
            "' ', 2, 2",
            "'\t', 3, 3",
            "'\n', 4, 4",
            "'\r\n', 5, 5"
    })
    public void constructor_firstValueEmptyOrTab_throwsExceptionWithMessage(String name, double speed, double distance) {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse(name, speed, distance);
                    throw new IllegalArgumentException("Name cannot be blank.");
                }
        );
        Assertions.assertEquals("Name cannot be blank.", exception.getMessage());
    }

    @Test
    public void constructor_secondValueNegative_throwsException() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse("Ron", -3, 3);
                }
        );
    }

    @Test
    public void constructor_secondValueNegative_throwsExceptionWithMessage() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse("Ron", -3, 3);
                    throw new IllegalArgumentException("Speed cannot be negative.");
                }
        );
        Assertions.assertEquals("Speed cannot be negative.", exception.getMessage());
    }

    @Test
    public void constructor_thirdValueNegative_throwsException() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse("Ron", 3, -3);
                }
        );
    }

    @Test
    public void constructor_thirdValueNegative_throwsExceptionWithMessage() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Horse("Ron", 3, -3);
                    throw new IllegalArgumentException("Distance cannot be negative.");
                }
        );
        Assertions.assertEquals("Distance cannot be negative.", exception.getMessage());
    }

    @Test
    public void getName_validName_returnsName() {
        Horse horse = new Horse("Ferrari", 350, 400);
        String name = horse.getName();
        Assertions.assertEquals("Ferrari", name);
    }

//    @Test
//    public void getSpeed_validSpeed_returnsSpeed() {
//        Horse horse = new Horse("Aston Martin", 329, 400);
//        Double speed = horse.getSpeed();
//        Assertions
//    }
}