import java.util.*;

class Solution {
    public static void insertElement(ArrayList<Integer> arr, int x) {
        arr.add(x);
    }

    public static void deleteElement(ArrayList<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                arr.remove(i);
                break;
            }
        }
    }

    public static void reverseArray(ArrayList<Integer> arr) {
        Collections.reverse(arr);
    }

    public static void sizeOfArray(ArrayList<Integer> arr) {
        System.out.println(arr.size());
    }

    public static void displayArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr.get(i));
        }
        System.out.println();
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        while (n-- > 0) {
            String operation = scanner.next();

            if (operation.equals("insert")) {
                int x = scanner.nextInt();
                Solution.insertElement(arr, x);
            } else if (operation.equals("delete")) {
                int x = scanner.nextInt();
                Solution.deleteElement(arr, x);
            } else if (operation.equals("reverse")) {
                Solution.reverseArray(arr);
            } else if (operation.equals("size")) {
                Solution.sizeOfArray(arr);
            } else if (operation.equals("print")) {
                Solution.displayArray(arr);
            }
        }

        scanner.close();
    }
}
*/
