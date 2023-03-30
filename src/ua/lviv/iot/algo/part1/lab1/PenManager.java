package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;

public class PenManager {
    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();
        pens.add(new SchoolPen("Bic", "Blue", "Plastic", 10.0, 2, 1, 1));
        pens.add(SchoolPen.getInstance());
        pens.add(new MarkerPen("Sharpie", "Black", "Plastic", 8.0, 3));
        pens.add(new MarkerPen("Crayola", "Red", "Plastic", 10.0, 5));

        for (Pen pen : pens) {
            System.out.println(pen.toString() + " Price: " + pen.calculatePrice());
        }
    }
}
