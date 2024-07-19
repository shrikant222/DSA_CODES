package AA;

import java.io.*;
import java.util.*;

class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] arr = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            arr[i] = sc.nextInt();
        }

        int carry = 1;
        for (int i = array_size - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) break;
        }


        if (carry > 0) {
            int[] nDigit = new int[array_size + 1];
            nDigit[0] = carry;
            for (int i = 0; i < array_size; i++) {
                nDigit[i + 1] = arr[i];
            }
            arr = nDigit;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
