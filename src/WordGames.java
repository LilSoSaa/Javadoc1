import java.util.Scanner;
/**
 * Creiamo WordGames con metodo addHelloWord per creare saluto con parola random
 * * Succwesivamente facciamo metodo getFullName per avere nime e cognome
 * @author Giovanni Topor
 */
public class WordGames {

    /**
     * Methodo che aggiunge  "Hello" alla  word
     *
     * @param word parola da concatenare ad: "Hello"
     * @return risultato: "Hello" con parola scelta da noi
     */

    public String addHelloWord(String word) {
        return "Hello " + word;

    }

    /**
     * Method that concatenates two strings (name and surname)
     *
     * @param name prima stringa da concatenare
     * @param surname seconda stringa da concatenare
     * @return risultato: concatenazione di name e surname
     */

    public String name;
    public String surnname;


    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}



