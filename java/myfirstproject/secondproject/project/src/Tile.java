package src;

public class Tile {
    public static char letter;
    public static int value;

    Tile(char newLetter, int newValue){
        letter = newLetter;
        value = newValue;
    }
    public static void printTile(){
        System.out.println("The tile " + letter + " is worth " + value + " points.");
    }
    public static void testTile(){
        System.out.println(letter);
        System.out.println(value);
        
    }


}
