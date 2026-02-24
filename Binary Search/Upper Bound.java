Upper Bound
Problem Statement
Provided with a non-decreasingly sorted array, arr, and a specified number, x, the objective is to retrieve and return the index of the upper bound of x

If no such greater value exists, the result is n, where n denotes the size of the array

Note
Upper bound of 'x' is denoted as the smallest index 'i' in the array, where the value 'arr[i]' > 'x'
Approach

Initialize variables for the low and high indices and set an initial answer variable (ans) to the size of the array.

Update the answer when the mid-element is greater than target value.

Example
12

Explanation:

If the Array = [1, 4, 6, 10, 13]Find Upper bound for x = 5, 6, 13
For x = 5

Initialize ans to the array size (5), low to 0, and high to 4

Iteration 1: low = 0, high = 4, mid = (0 + 4) / 2 = 2 (arr[2] = 6)

Since arr[2] > 5, update ans to 2 and set high to mid - 1 = 1
Iteration 2: low = 0, high = 1, mid = (0 + 1) / 2 = 0 (arr[0] = 1)

Since arr[0] < 5, set low to mid + 1 = 1
Iteration 3: low = 1, high = 1, mid = (1 + 1) / 2 = 1 (arr[1] = 4)

Since arr[1] < 5, set low to mid + 1 = 2
low > high -> loop ends

The final ans is 2

For x = 6

Initialize ans to the array size (5), low to 0, and high to 4

Iteration 1 (low=0, high=4)

Calculate mid: mid = (0+4)/2 = 2

Check if arr[mid] > x (arr[2] > 6): No

Update low and repeat: low = mid + 1 = 3

Iteration 2 (low=3, high=4)

Calculate mid: mid = (3+4)/2 = 3

Check if arr[mid] > x (arr[3] > 6): Yes

Update ans = 3 and high = mid - 1 = 2

Iteration 3 (low=3, high=2)

low > high -> loop ends

The final ans is 3

For x = 13

Initialize ans to the array size (5), low to 0, and high to 4

Iteration 1: low = 0, high = 4, mid = (0 + 4) / 2 = 2 (arr[2] = 6)

Since arr[2] < 13, set low to mid + 1 = 3
Iteration 2: low = 3, high = 4, mid = (3 + 4) / 2 = 3 (arr[3] = 10)

Since arr[3] < 13, set low to mid + 1 = 4
Iteration 3: low = 4, high = 4, mid = (4 + 4) / 2 = 4 (arr[4] = 13)

Since arr[4] is not greater than 13, set low to mid + 1 = 5
low > high -> loop ends

The final ans is 5

SOLUTION CODE:

import java.util.*;
public class Main {
    public static int upperBound(int[] arr, int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(upperBound(arr, x, n));
    }
}
