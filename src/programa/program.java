package programa;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class program {

    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.print("Enter the number of shapes: ");
        int n = tc.nextInt();
        List<Shape> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            System.out.println("Shape #"+i+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = tc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(tc.next());
            
            if(ch=='r'){
                System.out.print("Width: ");
                double width = tc.nextDouble();
                System.out.print("Height: ");
                double height = tc.nextDouble();
                list.add(new Rectangle( width, height, color));
            }else{
                System.out.print("Radius: ");
                double radius = tc.nextDouble();
                list.add(new Circle(radius, color));
            } 
        }
        System.out.println("");
        System.out.println("SHAPE AREAS:");
        for(Shape shape: list){
            System.out.println(String.format("%.2f", shape.area()));
        }
    
        
        
        
    }
    
}
