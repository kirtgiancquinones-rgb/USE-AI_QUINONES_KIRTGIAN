/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debugaiproblem3;

import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class DebugAIProblem3 {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a non-negative whole number: ");
        int userNumber = input.nextInt();

        System.out.println("factorial(" + userNumber + ") result: " + factorial(userNumber));

        input.close();
    }
}
