package pl.zobaczymy;

import javax.swing.*;

public class RoomAreas {

    public static void main(String[] args)
    {
        /* Program obliczający powierzchnię mieszkania
        z wykorzystaniem klasy Rectangle
        */

        double number, totalArea;
        String input;

        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        input = JOptionPane.showInputDialog("Podaj długośc kuchni");
        number = Double.parseDouble(input);
        kitchen.setLength(number);

        input = JOptionPane.showInputDialog("Podaj szerokość kuchni");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);

        input = JOptionPane.showInputDialog("Podaj długość sypialni");
        number = Double.parseDouble(input);
        bedroom.setLength(number);

        input = JOptionPane.showInputDialog("Podaj szerokość sypialni");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        input = JOptionPane.showInputDialog("Podaj długość salonu");
        number = Double.parseDouble(input);
        den.setLength(number);

        input = JOptionPane.showInputDialog("Podaj szerokość salonu");
        number = Double.parseDouble(input);
        den.setWidth(number);

        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

        JOptionPane.showMessageDialog(null, "Lączna" +
                " powierzchnia wynosi " + totalArea);

        System.exit(0);

    }
}
