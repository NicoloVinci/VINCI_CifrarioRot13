package org.example;

public class Rot13 {
    public Rot13() {}

    public String cifra(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) + 13 > 90) {
                    output += (char)((int)input.charAt(i) - 13);
                } else {
                    output += (char)((int)input.charAt(i) +  13);
                }
            } else if((int)input.charAt(i) >= 97 && (int)input.charAt(i) <= 122){
                if((int)input.charAt(i) + 13 > 122) {
                    output += (char)((int)input.charAt(i) - 13);
                } else {
                    output += (char)((int)input.charAt(i) +  13);
                }
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public String decifra(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) - 13 < 65) {
                    output += (char)((int)input.charAt(i) + 13);
                } else {
                    output += (char)((int)input.charAt(i) -  13);
                }
            } else if((int)input.charAt(i) >= 97 && (int)input.charAt(i) <= 122){
                if((int)input.charAt(i) - 13 < 97) {
                    output += (char)((int)input.charAt(i) + 13);
                } else {
                    output += (char)((int)input.charAt(i) - 13);
                }
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }
}
