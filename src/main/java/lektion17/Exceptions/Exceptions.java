package lektion17.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {
        try {
           werfeNumberFormat();
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException erfolgreich geworfen!");
        }
        try {
            werfeArrayOutBounds();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException erfolgreich geworfen!");
        }
        try {
            werfeNullPointerException();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException erfolgreich geworfen!");
        }
        try {
            werfeArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException erfolgreich geworfen!");
        }
        try {
            werfeFileNotFound();
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException erfolgreich geworfen!");
        }
        werfeOutOfMemory();
    }
    public static void werfeArithmeticException() {
        double zahl = 1/0;
    }
    public static void werfeFileNotFound() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("test.jpg");
    }

    public static void werfeOutOfMemory(){
        List<String> liste = new ArrayList<>();
        while (true) {
            liste.add("Daten"); // wächst unbegrenzt
        }
    }

    public static void werfeNullPointerException() {
        Object obj = null;
        obj.toString();
    }
    public static void werfeArrayOutBounds(){
        int[] intArray = new int[2];
        for (int i = 0; i <= 2; i++) {
            intArray[i] = 1;
        }
    }
    public static void werfeNumberFormat(){
        String str = "1234FEHLER";
        int zahl = Integer.parseInt(str);
    }
}
