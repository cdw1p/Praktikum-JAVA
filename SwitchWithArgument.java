package switchwithargument;

/**
 *
 * @author 1337
 */
public class SwitchWithArgument {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage : java SwitchWithArgument <char>");
            System.exit(1);
        }
        
        char c = args[0].charAt(0);
        switch(c) {
            case 'a': case 'A':
            case 'i': case 'I':
            case 'u': case 'U':
            case 'e': case 'E':
            case 'o': case 'O':
                System.out.println(c + " adalah huruf vokal.");
            case 'y': case 'Y':
            case 'w': case 'W':
                System.out.println(c + " terkadang adalah huruf vokal.");
            default:
                System.out.println(c + " bukan huruf vokal.");
        }
    }
}
