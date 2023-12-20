package aplication;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Matriz length: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Type the numbers");
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        System.out.print("Negative numbers = " + count);
    }
}
