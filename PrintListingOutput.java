package printlistingoutput;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author 1337
 */
public class PrintListingOutput {
    protected String[] dataArray = {"CAHYO DWI PUTRO", "1461900333"};

    public void printListing() {
        for (String arr:dataArray) {
            System.out.println(arr);  
        }
    }

    public void writeFile() {
	File file = new File("C:/outputFile.txt");
	String content = "NAMA : "+dataArray[0]+"\nNBI : "+dataArray[1];
        
        try (FileOutputStream fop = new FileOutputStream(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            
            byte[] contentInBytes = content.getBytes();
            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            System.out.println("\nWrite File Done!");
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
