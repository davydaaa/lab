package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public abstract class Pen {
    protected String brand;
    protected String color;
    protected String material;
    protected double size;

    public abstract int calculatePrice();
}
