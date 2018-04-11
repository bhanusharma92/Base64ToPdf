import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Base64ToPdf{
    public static void main(String[] args) {
        try {
            byte[] b = Base64.decodeBase64(FileUtils.readFileToString(new File("D:\\GrailsProjects\\Base64\\src\\myText.txt")));
            OutputStream stream = new FileOutputStream("D:\\GrailsProjects\\Base64\\src\\myDecodedFile.pdf");
            stream.write(b);
            stream.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}