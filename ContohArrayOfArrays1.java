package contoharrayofarrays;

/**
 *
 * @author 1337
 */
public class ContohArrayOfArrays {
    public static void main(String[] args) {
        String[][] cartoons = {
            {"Flint Tones", "Fred", "Wilma", "Pebles", "Dino"},
            {"Rubbles", "Barney", "Betty", "Bam Bam"},
            {"Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie"},
            {"Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred"}
        };
        
        for (int i=0; i<cartoons.length; i++) {
            System.out.print(cartoons[i][0] + ": ");
            
            for (int j=0; j<cartoons[i].length; j++) {
                System.out.print(cartoons[i][j] + " ");
            }
            System.out.println();
        }
    }
}
