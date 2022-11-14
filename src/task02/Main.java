package task02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Stworz interfece Shape oraz wszystkie potrzebne mu metody
        // abys w mainei mogl stworzyc liste/tablice Shapeow a w nim nastepnie:
        // Figura.stworzKwadrat(15));
        //
        // for(Figura f : figury) {
        //   System.out.println(f);
        // }
        //System.out powinien wypisac:
        //Kwadrat o boku 10.
        //Koło o promienu 10.
        //Prostokat o bokach 10x20.
        //Kwadrat o boku 15.

        List<IShape> shapesList = new ArrayList<>();
        IShape square = IShape.createSquare(10);
        shapesList.add(square);
        IShape circle = IShape.createCircle(15);
        shapesList.add(circle);
        IShape rectangle = IShape.createRectangle(40, 20);
        shapesList.add(rectangle);

        for (IShape s : shapesList) {
            System.out.println(s);
        }
        System.out.println();

        // - znajdź figurę z największym obwodem
        System.out.println("Largest perimetr shape: " + IShape.largestPerimetr());
        System.out.println();
        //- znajdź figurę z największym polem
        System.out.println("Largest area shape: " + IShape.largestArea());


    }

}
