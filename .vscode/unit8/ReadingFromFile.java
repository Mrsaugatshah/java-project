import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        try {
            in = new FileInputStream("D:\\output.txt");
            System.out.println(in.read());
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
