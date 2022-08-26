package pl.zobaczymy;

public class Kostki
    /*
    Symulator rzutów kostkami z wykorzystaniem
    klasy Die
    */

{
    public static void main(String[] args) {
        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 5;

        Die die1 = new Die(DIE1_SIDES);
        Die die2 = new Die(DIE2_SIDES);

        System.out.println("Symulowanie rzutów kostkami o "
                + DIE1_SIDES + " i " + DIE2_SIDES + " ściankach.");
        System.out.println("Początkowa wartośc kostek:");
        System.out.println(die1.getValue() + " " + die2.getValue());

        System.out.println("Liczba rzutów kostkami: " +
                MAX_ROLLS + ".");
        for (int i = 0; i < MAX_ROLLS; i++)
        {
            die1.roll();
            die2.roll();
            System.out.println(die1.getValue() + " " + die2.getValue());
        }
    }
}
