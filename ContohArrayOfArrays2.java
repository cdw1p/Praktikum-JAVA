package contoharrayofarrays2;

/**
 *
 * @author 1337
 */
public class ContohArrayOfArrays2 {
    public static void main(String[] args) {
        int[][] aMatrix = new int[4][];
        
        for (int i=0; i<aMatrix.length; i++) {
            aMatrix[i] = new int[5];
            for (int j=0; j<aMatrix[i].length; j++) {
                aMatrix[i][j] = i + j;
            }
        }
        
        for (int i=0; i<aMatrix.length; i++) {
            for (int j=0; j<aMatrix[i].length; j++) {
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
