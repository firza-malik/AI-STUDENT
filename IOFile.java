import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args) {
        
        try {
            String[]A={"firza","Nabeeha","jawaria","bushra","Ayesha"};

            BufferedWriter writer=new BufferedWriter(new FileWriter( "E:\\practice\\Iofile.txt" ));
            writer.write("writing to a file..");
            for (String a : A) {
                writer.write("\n"+a);
            }
            
            writer.close();
            
        } catch (IOException e) {
            System.out.println("error:file is not found");
        }
        try {
            String line;
            BufferedReader Reader=new BufferedReader(new FileReader("E:\\practice\\Iofile.txt"));
            while ((line=Reader.readLine())!=null) 
            System.out.println(line);
            
        
        Reader.close();
            
        } catch (IOException e) {
            System.out.println("Erorr: file doesn't exist.");
        }
        
    }
    
}
