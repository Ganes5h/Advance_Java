// // import java.io.*;

// // public class Fifth {  
// //   public static void main(String[] args) throws IOException {  
// //     byte[] buf = { 35, 36, 37, 38 };   
// //     ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
// //     int k = 0;  

// //     while ((k = byt.read()) != -1) {   
// //       char ch = (char) k;  
// //       System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
// //     }  
// //   }  
// // }

// import java.io.*;

// public class Fifth {
//     public static void main(String args[]) throws Exception {
//         FileOutputStream fout1 = new FileOutputStream("f1.txt");
//         FileOutputStream fout2 = new FileOutputStream("f2.txt");

//         ByteArrayOutputStream bout = new ByteArrayOutputStream();
//         bout.write(65);
//         bout.writeTo(fout1);
//         bout.writeTo(fout2);

//         bout.flush();
//         bout.close();
//         System.out.println("Success...");
//     }
// }

import java.io.*;

public class Fifth {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data_output.dat"))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String stringValue = dis.readUTF();

            System.out.println("Read int: " + intValue);
            System.out.println("Read double: " + doubleValue);
            System.out.println("Read string: " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// import java.io.*;

// public class DataOutputStreamExample {
// public static void main(String[] args) {
// try (DataOutputStream dos = new DataOutputStream(new
// FileOutputStream("data_output.dat"))) {
// dos.writeInt(42);
// dos.writeDouble(3.14159);
// dos.writeUTF("Hello, DataOutputStream!");
// System.out.println("Data has been written to the file.");
// } catch (IOException e) {
// e.printStackTrace();
// }
// }
// }