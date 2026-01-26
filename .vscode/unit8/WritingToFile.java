import java.io.*;

public class WritingToFile {
    public static void main(String args[]) throws IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("D:\\output.txt");
            int a = 97;
            out.write(a);

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
