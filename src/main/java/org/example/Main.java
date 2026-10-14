import org.example.Rot13;

import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {
    Rot13 cifrario =  new Rot13();
    String input = readln("Inserisci la frase: ");
    String scelta = readln("Vuoi cifrare o decifrare la frase che inserirai (C/D)? ").toUpperCase();
    String output;
    if(scelta.equals("C")) {
        output = cifrario.cifra(input);
        println("Ecco qui la frase cifrata: " + output);
    } else if(scelta.equals("D")) {
        output = cifrario.decifra(input);
        println("Ecco qui la frase decifrata: " + output);
    } else {
        println("Scelta non valida, termino il programma...");
    }
}