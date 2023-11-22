// import java.util.ArrayList;
// import java.util.Scanner;

// public class Termwork4 {
//     private ArrayList<Integer> integerList;
//     private ArrayList<Float> floatList;

//     public Termwork4() {
//         integerList = new ArrayList<>();
//         // Create an ArrayList object of type float
//     }

//     // Method to add elements to the integer ArrayList
//     public void addElement(int element) {
//         integerList.add(element);
//     }

//     // Method to add elements to the float ArrayList
//     public void addElement(float element) {
//         floatList.add(element);
//     }

//     // Method to remove elements from the integer ArrayList
//     public void removeElement(int index) {
//         if (index >= 0 && index < integerList.size()) {
//             integerList.remove(index);
//         } else {
//             System.out.println("Invalid index for integer ArrayList!");
//         }
//     }

//     // Method to remove elements from the float ArrayList
//     public void removeElement(float element) {
//         // Remove element
//         floatList.remove(element);
//     }

//     // Method to perform linear search on the integer ArrayList
//     public boolean linearSearch(int key) {
//         return integerList.contains(key);
//     }

//     // Method to perform linear search on the float ArrayList
//     public boolean linearSearch(float key) {
//         return false;
//     }

//     public static void Termwork4(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Termwork4 operations = new Termwork4();

//         while (true) {
//             System.out.println("Menu:");
//             System.out.println("1. Add an integer element");
//             System.out.println("2. Add a float element");
//             System.out.println("3. Remove an integer element");
//             System.out.println("4. Remove a float element");
//             System.out.println("5. Search in integer ArrayList");
//             System.out.println("6. Search in float ArrayList");
//             System.out.println("7. Exit");

//             System.out.print("Enter your choice: ");
//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     // read an integer and add element to integer list
//                     System.out.println("Enter Integer Element : ");
//                     int ele = scanner.nextInt();
//                     operations.addElement(ele);

//                     break;
//                 case 2:
//                     // read a float and add element to float list
//                     System.out.println("Enter Float Element : ");
//                     Float eleFloat = scanner.nextFloat();
//                     operations.addElement(eleFloat);
//                     break;
//                 case 3:
//                     // read index of element and remove from integer list
//                     System.out.println("Enter Integer Element to remove from arrayList : ");
//                     int eleI = scanner.nextInt();
//                     operations.removeElement(eleI);
//                     break;
//                 case 4:
//                     // read element and remove from floatlist
//                     System.out.println("Enter Float Element to remove from arrayList : ");
//                     int eleIs = scanner.nextInt();
//                     operations.removeElement(eleIs);
//                     break;
//                 case 5:
//                     System.out.print("Enter the integer to search in the list: ");
//                     int intSearchKey = scanner.nextInt();
//                     // read int element to be seached and perform a linear Search(return boolean
//                     // value)
//                     System.out.println("Integer found: " + intFound);
//                     break;
//                 case 6:
//                     // read float element to be seached and perform a linear Search(return boolean
//                     // value)
//                     System.out.println("Float found: " + floatFound);
//                     break;
//                 case 7:
//                     System.out.println("Exiting program...");
//                     System.exit(0);
//                     break;
//                 default:
//                     System.out.println("Invalid choice! Please enter a valid option.");
//             }
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

public class Termwork4 {
    private ArrayList<Integer> integerList;
    private ArrayList<Float> floatList;

    public Termwork4() {
        integerList = new ArrayList<>();
        floatList = new ArrayList<>(); // Create an ArrayList object of type float
    }

    // Method to add elements to the integer ArrayList
    public void addElement(int element) {
        integerList.add(element);
    }

    // Method to add elements to the float ArrayList
    public void addElement(float element) {
        floatList.add(element);
    }

    // Method to remove elements from the integer ArrayList
    public void removeElement(int index) {
        if (index >= 0 && index < integerList.size()) {
            integerList.remove(index);
        } else {
            System.out.println("Invalid index for integer ArrayList!");
        }
    }

    // Method to remove elements from the float ArrayList
    public void removeElement(float element) {
        // Remove element
        floatList.remove(element);
    }

    // Method to perform linear search on the integer ArrayList
    public boolean linearSearch(int key) {
        return integerList.contains(key);
    }

    // Method to perform linear search on the float ArrayList
    public boolean linearSearch(float key) {
        return floatList.contains(key);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Termwork4 operations = new Termwork4();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add an integer element");
            System.out.println("2. Add a float element");
            System.out.println("3. Remove an integer element");
            System.out.println("4. Remove a float element");
            System.out.println("5. Search in integer ArrayList");
            System.out.println("6. Search in float ArrayList");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // read an integer and add element to integer list
                    System.out.println("Enter Integer Element : ");
                    int ele = scanner.nextInt();
                    operations.addElement(ele);
                    break;
                case 2:
                    // read a float and add element to float list
                    System.out.println("Enter Float Element : ");
                    float floatEle = scanner.nextFloat();
                    operations.addElement(floatEle);
                    break;
                case 3:
                    // read index of element and remove from integer list
                    System.out.println("Enter index of the element to remove from the integer list: ");
                    int indexToRemove = scanner.nextInt();
                    operations.removeElement(indexToRemove);
                    break;
                case 4:
                    // read element and remove from float list
                    System.out.println("Enter element to remove from the float list: ");
                    float elementToRemove = scanner.nextFloat();
                    operations.removeElement(elementToRemove);
                    break;
                case 5:
                    System.out.print("Enter the integer to search in the list: ");
                    int intSearchKey = scanner.nextInt();
                    // read int element to be searched and perform a linear Search (return boolean
                    // value)
                    boolean intFound = operations.linearSearch(intSearchKey);
                    System.out.println("Integer found: " + intFound);
                    break;
                case 6:
                    // read float element to be searched and perform a linear Search (return boolean
                    // value)
                    System.out.print("Enter the float to search in the list: ");
                    float floatSearchKey = scanner.nextFloat();
                    boolean floatFound = operations.linearSearch(floatSearchKey);
                    System.out.println("Float found: " + floatFound);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
