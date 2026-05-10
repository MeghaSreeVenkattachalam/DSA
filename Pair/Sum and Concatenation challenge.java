import java.util.*;

/*
class Pair {
    int number;
    String text;

    public Pair(int number, String text) {
        this.number = number;
        this.text = text;
    }
}
*/

class Solution {
    static void operate(List<Pair> pairs) {
        int totalSum = 0;
        StringBuilder combinedString = new StringBuilder();

        for (Pair pair : pairs) {
            totalSum += pair.number;
            combinedString.append(pair.text);
        }

        System.out.println(totalSum);
        System.out.println(combinedString.toString());
        System.out.println(combinedString.length());
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            String text = scanner.next();
            pairs.add(new Pair(num, text));
        }

        Solution.operate(pairs);
        scanner.close();
    }
}
*/
