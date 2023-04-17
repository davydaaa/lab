package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public abstract class Pen {
    public static final String HEADERS = "brand,color,matherial,size";
    protected String brand;
    protected String color;
    protected String material;
    protected double size;

    public abstract int calculatePrice();
    public String getHeaders() {
        return HEADERS;
    }
    public String toCSV() {
        return getBrand() + ", " + getColor() + ", " + getMatherial() + ", " + getSize();
    }
}
