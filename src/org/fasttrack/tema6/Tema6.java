package org.fasttrack.tema6;

import java.util.Random;

public class Tema6 {
    static int[] numbers = new int[]{1, 2, 4, 5, 79, 3};

    public static void main(String[] args) {
        int sumOfNumbers = sumOfArray(numbers);
        System.out.println(sumOfNumbers);
        int oddNumbers  = oddNumbers(numbers);
        System.out.println(oddNumbers);
        int[] numberHigherThan = numberHigherThan(numbers, 3);
        printArray(numberHigherThan);
        donatii(2000);
        System.out.println();
        donatiiLimitate(2000, 10);
        splitSentence("Ana are mere. Multe. Doar mere. A. B. C. D");
    }

    public static int sumOfArray(int[] numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static int oddNumbers(int[] numbers) {
        int oddNumbers = 0;
        for (int number: numbers) {
            if (number % 2 != 0) {
                oddNumbers++;
            }
        }
        return oddNumbers;
    }

    public static int[] numberHigherThan(int[] numbers, int numberToCompare) {
        //solutia 1
//        int[] numberHigherThan = new int[numbers.length];
//        int index = 0;
//        for (int currentNumber: numbers) {
//            if (currentNumber > numberToCompare) {
//                numberHigherThan[index] = currentNumber;
//                index++;
//            }
//        }
//        return numberHigherThan;
        int counter = 0;
        for (int currentNumber: numbers) {
            if (currentNumber > numberToCompare) {
                counter++;
            }
        }
        int[] numberHigherThan = new int[counter];
        int index = 0;
        for (int currentNumber: numbers) {
            if (currentNumber > numberToCompare) {
                numberHigherThan[index] = currentNumber;
                index++;
            }
        }
        return numberHigherThan;
    }

    public static void printArray(int[] numbers) {
        for(int nr: numbers) {
            System.out.print(nr + " ");
        }
    }

    public static void donatii(int target) {
        Random random = new Random();
        int sumaStransa = 0;
        while (target > sumaStransa) {
            sumaStransa = sumaStransa + random.nextInt(500) + 1;
        }
        System.out.println("Am strans suma: " + sumaStransa);
    }

    public static void donatiiLimitate(int target, int nrDonatii) {
        Random random = new Random();
        int sumaStransa = 0;
        int counter = 0;
        while ( (target > sumaStransa) && (counter < nrDonatii)) {
//            if (counter == nrDonatii) {
//                break;
//            }
            sumaStransa = sumaStransa + random.nextInt(50) + 1;
            counter++;
        }
        System.out.println("Am strans " + sumaStransa + " in " + counter + " donatii.");
    }

    public static void splitSentence(String toSplit) {
        String[] sentences = toSplit.split("\\.");
        for (String currentSentence: sentences) {
            System.out.println(currentSentence.trim());
        }
    }
}
