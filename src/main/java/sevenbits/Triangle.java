package sevenbits;


import com.sun.javaws.exceptions.InvalidArgumentException;

public class Triangle extends Throwable{

    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c) throws InvalidArgumentException {

        if(a <= 0 || b <= 0 || c <= 0) {
            throw new InvalidArgumentException(new String[]{"a", "b", "c"});
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Triangle triangle) throws InvalidArgumentException {
       this(triangle.getA(), triangle.getB(), triangle.getC());
    }

    public boolean isRightTriangle() {
        return ((a * a + b * b) == c * c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
