package breakforstoplooping;

/**
 *
 * @author 1337
 */
public class BreakForStopLooping {
    public static void main(String[] args) {
        int i=0;
        do {
            System.out.println("I'm stuck!");
            i++;
            if (i>100) break;
        } while (true);
    }
}
