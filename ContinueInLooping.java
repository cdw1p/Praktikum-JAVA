package continueinlooping;

/**
 *
 * @author 1337
 */
public class ContinueInLooping {
    public static void main(String[] args) {
        String searchMe = "Peter piper picker a peck of pickles peppers";
        int max = searchMe.length();
        int numPs = 0;
        
        for (int i=0; i<max; i++) {
            if (searchMe.charAt(i) != 'p')
                continue;
            
            numPs++;
        }

        System.out.println("Ditemukan "+numPs+" p's pada string.");
    }
}
