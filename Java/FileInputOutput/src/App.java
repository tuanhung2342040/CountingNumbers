import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/hungnguyen/Downloads/ResearchEssayDraft.docx");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while(scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("/Users/hungnguyen/Downloads/newile.txt");
        writer.write(fileContent);
        writer.close();
    }
}
