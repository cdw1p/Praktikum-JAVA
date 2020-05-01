package printlistingoutput;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author 1337
 */
public class PrintListingOutput {
    public void printListing() {
        for(int i=0; i<5; i++) {
            System.out.println("Halo Dunia");
        }
    }

    public void writeFile() {
	File file = new File("C:/outputFile.txt");
	String content = "NAMA : CAHYO DWI PUTRO\nNBI : 1461900333";
        
        try (FileOutputStream fop = new FileOutputStream(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            
            byte[] contentInBytes = content.getBytes();
            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
	}
    }
    
    public static void main(String[] args) {
        PrintListingOutput classProgram = new PrintListingOutput();
        classProgram.printListing();
        classProgram.writeFile();
    }
}
