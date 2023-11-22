
// Write a java program to copy the content of 'input.txt' to 'output.txt' using
// Bufferd input string and buffered output stream
import java.io.*;

// public class Third {
// public static void main(String[] args) {
// String inputFileName = "input.txt";
// String outputFileName = "output.txt";

// try (
// BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
// BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
// String line;
// while ((line = reader.readLine()) != null) {
// writer.write(line);
// writer.newLine(); // Add a new line character to separate lines in the output
// file
// }
// System.out.println("File copied successfully!");
// } catch (IOException e) {
// System.err.println("An error occurred: " + e.getMessage());
// }
// }
// }
public class Third {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(("Original.txt"));
            BufferedInputStream bin = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream("copy.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            int i;

            while ((i = bin.read()) != -1) {
                // System.out.print((char) i);
                // String s = Integer.toString(char() i);
                String s = String.valueOf((char) i);
                System.out.print(s);
                byte b[] = s.getBytes();
                bout.write(b);
                bout.flush();
                // byte b[] = i;
            }
            bin.close();
            fin.close();
            bout.close();
            fout.close();
            System.out.println("\n success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
