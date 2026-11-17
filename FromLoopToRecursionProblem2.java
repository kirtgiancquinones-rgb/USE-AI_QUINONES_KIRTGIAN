/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package from.loop.to.recursion;

import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class FromLoopToRecursion {

    /**
     * @param args the command line arguments
     */
    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index >= grades.length) {
            return 0;
        }

        int currentPass = (grades[index] >= passingMark) ? 1 : 0;
        return currentPass + countPassingRecursive(grades, passingMark, index + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("pila ka grades would you like to enter? :3 ");
        int size = input.nextInt();
        int[] userGrades = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("hatag grade bi #" + (i + 1) + ": ");
            userGrades[i] = input.nextInt();
        }

        System.out.print("ang passing kay.: ");
        int userMark = input.nextInt();

        int userLoop = countPassing(userGrades, userMark);
        int userRec = countPassingRecursive(userGrades, userMark, 0);
        System.out.println("para sa Loop: " + userLoop + " | Recursive: " + userRec + " | Match? " + (userLoop == userRec));

        input.close();
    }
}
