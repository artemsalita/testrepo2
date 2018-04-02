package com.sevenbits;

import static com.sevenbits.DataGenerator.printTriangles;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- Valid right triangles ----");
        printTriangles(1,200, 1,200, 1,200, true);

        System.out.println("---- Valid but not right triangles ----");
        printTriangles(1,10, 1,20, 1,5, false);

        System.out.println("---- Invalid right triangles ----");
        printTriangles(-10,0, -10,0, -10,0, true);

        System.out.println("---- Invalid and not right triangles ----");
        printTriangles(-10,0, -10,0, -10,0, false);


    }
}
