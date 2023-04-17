package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class MarkerPen extends Pen {
    public static final String HEADERS = "numMarkers";
    private static final int MARKER_PRICE = 3;
    private int numMarkers;

    public MarkerPen(String brand, String color, String material, double size, int numMarkers) {
        super(brand, color, material, size);
        this.numMarkers = numMarkers;
    }

    public int calculatePrice() {
        return numMarkers * MARKER_PRICE;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + ", " + getNumMarkers();
    }
}
