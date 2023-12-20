package aplication;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Type the numbers: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = 0;
        System.out.println("Digite o numero para pesquisar: ");
        x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position: " + mat[i][j]);
                    System.out.println("Left: " + mat[i][j - 1]);
                    if (j < mat[i].length - 1) {
                        System.out.println("Rigth: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }


    }
}
