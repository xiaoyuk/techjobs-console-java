import java.util.HashMap;

public class CharCounter {
    public static void main (String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> counts = new HashMap<>();
        char[] charactersInString = text.toCharArray();
        for (char c : charactersInString) {
            if (counts.containsKey(c)) {
                int x = counts.get(c);
                counts.put(c, x+1);
            } else {
                counts.put(c, 1);
            }
        }

        for (char k : counts.keySet()) {
            System.out.println(k + ": " + counts.get (k));
        }

    }
}



//enter the text
//parse the text into characters
//count the number of characters
//put pair of letters and numbers in a hashmap