package leczner.jon.SumOrProduct;

import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/10/16.
 */
public class SumOrProduct {
    public static void main(String[] args) {
        SumOrProduct sumOrProduct = new SumOrProduct();
        sumOrProduct.promptUser("Enter a number:");
        int n = sumOrProduct.getInput();
        sumOrProduct.promptUser("Sum (1) or Product (2)?");
        int choice = sumOrProduct.getInput();
        int total = sumOrProduct.compute(n, choice);

        System.out.println("The total is: " + total);
    }

//    public enum Functions {
//        SUM(1), PRODUCT(2);
//        private int selector;
//        private Functions(int selector) {
//            this.selector = selector;
//        }
//    }

    public void promptUser(String prompt) {
        System.out.println(prompt);
    }

    public int getInput() {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        return number;
    }

    public int compute(int n, int function) {
        int total = 0;

        if (function == 2 && n != 0) // no multiplying by zero
            total = 1;

        for (int i = 1; i <= n; i++) {
            switch (function) {
                case 1: // sum
                    total += i;
                    break;
                case 2: // product
                    total *= i;
                    break;
                default:
                    System.out.println("Not a valid function type");
                    break;
            }
        }
        return total;
    }


}
