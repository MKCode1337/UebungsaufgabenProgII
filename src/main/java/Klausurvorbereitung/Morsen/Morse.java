package Klausurvorbereitung.Morsen;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    public String zeichenketteToMorse(String string){
        String ausgabe = "";
        for (Character c : string.toCharArray()){
            String morse = charToMorseCode(c);
            ausgabe += morse+" ";
        }
        return ausgabe;
    }

    public Map<Character,String> getMorseCodeMap(){
        Map<Character,String> morseMap = new HashMap<>();
        for(int i = 65; i<=90;i++){
            char c = (char) i ;
            morseMap.put(c, charToMorseCode(c));
        }
        return morseMap;
    }

    public static String charToMorseCode(char c) {
        String morseCode = switch (c) {
            case 'A' -> ".-";
            case 'B' -> "−...";
            case 'C' -> "−.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "_._";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            default ->
                    throw new RuntimeException("Unexpected value: "+c);
        };
        return morseCode;
    }
}