package sevenbits;

import static org.assertj.core.api.Assertions.assertThat;

public class DataGenerator {

    public static void printTriangles(int aBound1, int aBound2,
                                      int bBound1, int bBound2,
                                      int cBound1, int cBound2,
                                      boolean rightTriangle) {

        assertThat(aBound2)
                .as(String.format("Right bound = %s should me greater or equal to left bound = %s", aBound1, aBound2))
                .isGreaterThanOrEqualTo(aBound1);
        assertThat(bBound2)
                .as(String.format("Right bound = %s should me greater or equal to left bound = %s", bBound1, bBound2))
                .isGreaterThanOrEqualTo(bBound1);
        assertThat(cBound2)
                .as(String.format("Right bound = %s should me greater or equal to left bound = %s", cBound1, cBound2))
                .isGreaterThanOrEqualTo(cBound1);
        for(int i = aBound1; i <= aBound2; i ++) {
            for (int j = bBound1; j <= bBound2; j++) {
                for(int c = cBound1; c <= cBound2; c++) {
                    if(rightTriangle) {
                        if ((i * i + j * j) == (c * c)) {
                            System.out.println(i + ", " + j + ", " + c);
                        }
                    }
                    else {
                        if ((i * i + j * j) != (c * c)) {
                            System.out.println(i + ", " + j + ", " + c);
                        }
                    }
                }
            }
        }
    }




}
