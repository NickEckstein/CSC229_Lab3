/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author nicke
 */
public class Lab3 {

    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0; // 1, O(1)
        int iterate2 = 0; // 2, O(1)
        int largest = 0; // 3, O(1)
        while (iterate1 < sz - 1) { // 4, O(n)
            iterate2++; // 5, O(1)
            if (iterate2 == sz) { // 6, O(n)
                iterate2 = iterate1; // 7, O(1)
                continue;
            }
            int product = arr[iterate1] * arr[iterate2]; // 8, O(n^2)
            if(product > largest) // 9, O(1)
                largest = product; // 10, O(1)

        }
        return largest; // 11
    } // The time complexity for this algorithm is O(n^2)
}
