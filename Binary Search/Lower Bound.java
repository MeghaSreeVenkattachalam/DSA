Lower Bound

Problem Statement:

Given a sorted array, arr, and a number, x, the task is to return the index of the lower bound of x in the array arr.
If all elements in the array are smaller than x, the lower bound is considered to be n, where n represents the size of the array

Note:
Lower bound of 'x' is denoted as the smallest index 'i' in the array, where the value 'arr[i]' >= 'x'
  
Constraints:
1 <= ‘n’ <= 10^5
0 <= ‘arr[i]’ <= 10^5
1 <= ‘x’ <= 10^5

EXPLANATION:

For x = 2

Initialize ans to the array size (10), low to 0, and high to 9

Iteration 1: low = 0, high = 9, mid = (0 + 9) / 2 = 4

arr[4] = 6 (6 >= 2)

Update ans = 4 (mid)

Set high = mid - 1 = 3

Iteration 2: low = 0, high = 3, mid = (0 + 3) / 2 = 1

arr[1] = 3 (3 >= 2)

Update ans = 1 (mid)

Set high = mid - 1 = 0

Iteration 3: low = 0, high = 0, mid = (0 + 0) / 2 = 0

arr[0] = 2 (2 >= 2)

Update ans = 0 (mid)

Set high = mid - 1 = -1

The lower bound for x = 2 is at index 0

For x = 8

Initialize ans to the array size (10), low to 0, and high to 9

Iteration 1: low = 0, high = 9, mid = (0 + 9) / 2 = 4

arr[4] = 6 (6 < 8)

Set low = mid + 1 = 5

Iteration 2: low = 5, high = 9, mid = (5 + 9) / 2 = 7

arr[7] = 7 (7 < 8)

Set low = mid + 1 = 8

Iteration 3: low = 8, high = 9, mid = (8 + 9) / 2 = 8

arr[8] = 10 (10 >= 8)

Update ans = 8 (mid)

Set high = mid - 1 = 7

high < low -> loop ends

SOLUTION CODE:

import java.util.*;
public class Main {
    public static int lowerBound(int[] arr, int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
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
        System.out.println(lowerBound(arr, x, n));
    }
}

