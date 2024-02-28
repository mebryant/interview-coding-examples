import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        System.out.println("Reverse: Loookie here");
        System.out.println(reverseString("Loookie here"));

        String palTrue = "racecar";
        String palFalse = "tricycle";
        System.out.printf("Is %s a Palendrone: %s%n", palTrue, isPalendrone(palTrue));
        System.out.printf("Is %s a Palendrone: %s%n", palFalse, isPalendrone(palFalse));

        int[] swapMe = new int[]{2, 3};
        int[] swapMe2 = new int[]{12, 23};
        swapNumbers(swapMe);
        swapNumbers(swapMe2);

        String vowelMe = "Test";
        String vowelMe2 = "thththththth";
        System.out.printf("Does %s have vowel: %s \n", vowelMe, checkIfVowel(vowelMe));
        System.out.printf("Does %s have vowel: %s \n", vowelMe2, checkIfVowel(vowelMe2));

        int prime = 17;
        int notPrime = 10;

        System.out.println(checkIfPrime(prime));
        System.out.println(checkIfPrime(notPrime));

        printFibSequence(10);
        System.out.println();
        printFibRecursion(10);
        System.out.println();

        int[] checkOdd = new int[]{10, 12, 15, 14, 44, 66, 88};
        int[] checkOdd2 = new int[]{10, 12, 14, 44, 66, 88};

        System.out.printf("Does %s contain odd number: %s \n", Arrays.toString(checkOdd), checkOddNumber(checkOdd));
        System.out.printf("Does %s contain odd number: %s \n", Arrays.toString(checkOdd2), checkOddNumber(checkOdd2));
    }

    private static boolean checkOddNumber(int[] numArray){
        for(int num: numArray){
            if(num % 2 != 0){
                return true;
            }
        }

        return false;
    }

    private static void printFibSequence(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 0; i < count; i++){
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    private static int printFib(int a){
        if(a < 2){
            return a;
        }
        return printFib(a-1) + printFib(a-2);
    }

    private static void printFibRecursion(int count){
        for (int i = 0; i < count; i++) {
            System.out.print(printFib(i) + " ");
        }
    }

    private static boolean checkIfPrime(int checkPrime){
        for(int i = 2; i < checkPrime / 2; i++){
            if(checkPrime % i == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfVowel(String checkString){
        return checkString.matches(".*[aeiou].*");

//        Drawn out way of solving
//
//        char[] charArray = checkString.toLowerCase().toCharArray();
//        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
//
//        for(char i : charArray){
//            for(char vowel : vowels){
//                if(vowel == i){
//                    return true;
//                }
//            }
//        }
//
//        return false;
    }

    private static void swapNumbers(int[] swapArray){
        int first = swapArray[0];
        int second = swapArray[1];

        System.out.printf("Before swap: %s, %s \n", first, second);
        first = second + first;
        second = first - second;
        first = first - second;
        System.out.printf("After swap: %s, %s \n", first, second);
    }

    private static boolean isPalendrone(String checkPal){
        char[] checkPalArray = checkPal.toCharArray();
        for(int i = 0; i < checkPalArray.length / 2; i++){
            if(checkPalArray[i] != checkPalArray[checkPalArray.length - (1+i)]){
                return false;
            }
        }
        return true;
    }

    private static String reverseString(String reverseMe){
        StringBuilder stringBuffer = new StringBuilder();
        char[] reverseMeArray = reverseMe.toCharArray();

        for(int i = reverseMeArray.length - 1; i >= 0; i--){
            stringBuffer.append(reverseMeArray[i]);
        }

        return stringBuffer.toString();
    }
}
