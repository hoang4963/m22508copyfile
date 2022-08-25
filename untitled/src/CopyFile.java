import java.io.*;

public class CopyFile  {
    public static void copyFileText(String sourceFile,String targetFile) {

        try (InputStream inStream = new FileInputStream(sourceFile); OutputStream outStream = new FileOutputStream(targetFile)) {

            int length;
            byte[] buffer = new byte[1024];
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyFileText("C:\\Users\\Acer\\Desktop\\codegym\\Module2APJ\\250822\\exercise\\docghifile\\sourcefile.txt","C:\\Users\\Acer\\Desktop\\codegym\\Module2APJ\\250822\\exercise\\docghifile\\targetfile.txt");
    }
}
