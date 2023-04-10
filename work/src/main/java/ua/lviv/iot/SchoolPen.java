package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class SchoolPen extends Pen {
    private static final int PEN_PRICE = 5;
    private static final int PENCIL_PRICE = 2;
    private static final int ERASER_PRICE = 1;
    private String id = "isn-101";
    private int numPencils;
    private int numPens;
    private int numErasers;

    public SchoolPen(String brand, String color, String material, double size, int numPencils, int numPens, int numErasers) {
        super(brand, color, material, size);
        this.numPencils = numPencils;
        this.numPens = numPens;
        this.numErasers = numErasers;
    }

    public static SchoolPen getInstance() {
        return new SchoolPen("Bic", "Blue", "Plastic", 10.0, 2, 1, 1);
    }

    public int calculatePrice() {
        return numPencils * PENCIL_PRICE + numPens * PEN_PRICE + numErasers * ERASER_PRICE;
    }

    public void addPencil() {
        numPencils++;
    }

    public void addPen() {
        numPens++;
    }

    public void removePencil() {
        if (numPencils == 0) {
            return;
        }
        numPencils--;
    }

    public void removePen() {
        if (numPens == 0) {
            return;
        }
        numPens--;
    }
}


