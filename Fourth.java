
import java.io.*;

public class Fourth {
    public static void main(String[] args) throws IOException {
        byte[] buf = { 35, 36, 37, 38 };
        // Create the new byte array input stream
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            System.out.println((char) k);
        }
        // In a loop use the read() and assign the byte to k
        // Continue doing this until value is -1
        // Convert the byte k to characterand print

    }
}
