
package entities;

import entities.enums.Color;


public class Circle extends AbstractShape{
    private Double radius;
  
    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle" + "radius= " + radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
 

    @Override
    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }
    
}
