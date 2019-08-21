package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[M];

        dfs(arr, 0, N);
    }

    public static void dfs(int[] arr, int i, int N) {
        if (i == arr.length) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        } else {
            for(int j = 1; j <= N; j++) {
                if(!contain(arr, j, i)) {
                    arr[i] = j;
                    dfs(arr, i+1, N);
                }
            }
        }
    }

    public static boolean contain(int[] arr, int find, int k) {
        for (int i = 0; i < k; i++) {
            if(arr[i] == find) return true;
        }
        return false;
    }
}
