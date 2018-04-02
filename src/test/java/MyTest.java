import sevenbits.Triangle;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import sevenbits.Triangle;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyTest {


    @DisplayName("Test should verify triangle is a right triangle")
    @ParameterizedTest(name = "Test number {index}. Test data:  a={0}, b={1}, c={2}")
    @CsvFileSource(resources = "ValidRightTriangle.cvs", numLinesToSkip = 1)
    public void testRightTriangle(int a, int b, int c) throws InvalidArgumentException {
        assertThat(new Triangle(a, b, c).isRightTriangle())
                .as(format("Triangle with sides a=%s b=%s c=%s should be right triangle", a, b, c))
                .isTrue();
    }

    @DisplayName("Test should verify triangle is not a right triangle")
    @ParameterizedTest(name = "Test number {index}. Test data:  a={0}, b={1}, c={2}")
    @CsvFileSource(resources = "ValidNotRightTriangle.cvs", numLinesToSkip = 1)
    public void testNotARightTriangle(int a, int b, int c) throws InvalidArgumentException {
        assertThat(!new Triangle(a, b, c).isRightTriangle())
                .as(format("Triangle with sides a=%s b=%s c=%s should not be right triangle", a, b, c))
                .isTrue();
    }

    @DisplayName("Test should verify triangle is not a valid triangle")
    @ParameterizedTest(name = "Test number {index}. Test data:  a={0}, b={1}, c={2}")
    @CsvFileSource(resources = "InvalidTriangle.cvs", numLinesToSkip = 1)
    public void testNonValidTriangle(int a, int b, int c) {
        assertThrows(InvalidArgumentException.class, () -> new Triangle(a,b,c));
    }

    @DisplayName("Test should verify constructor of copy")
    @ParameterizedTest(name = "Test number {index}. Test data:  a={0}, b={1}, c={2}")
    @CsvFileSource(resources = "ValidNotRightTriangle.cvs", numLinesToSkip = 1)
    public void positiveTestForCopyConstructor(int a, int b, int c) throws InvalidArgumentException {
        Triangle triangle = new Triangle(a, b, c);
        Triangle copyOfTriangle = new Triangle(triangle);
        assertThat(copyOfTriangle.getA() == a)
                .as(format("a side for triangle copy should be = %s ", a)).isTrue();
        assertThat(copyOfTriangle.getB() == b)
                .as(format("b side for triangle copy should be = %s ", b)).isTrue();
        assertThat(copyOfTriangle.getC() == c)
                .as(format("c side for triangle copy should be = %s ", c)).isTrue();
    }

}
