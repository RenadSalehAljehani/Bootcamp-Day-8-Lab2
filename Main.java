import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //-------------------------------1---------------------------------------
        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Create an array list object to hold the dictionary elements
        ArrayList<String> dictionary = new ArrayList<String>();

        // 2. Insert elements
        dictionary.add("cat");
        dictionary.add("dog");
        dictionary.add("red");
        dictionary.add("is");
        dictionary.add("am");

        // 3. New array list to store the longest words
        ArrayList<String> longestWords = findLongestWords(dictionary);

        // 4. Print the original array list
        System.out.println("The dictionary: " + dictionary);

        // 5. Print the longest words array list
        System.out.println("The longest words: " + String.join(", ", longestWords));

        //-------------------------------2---------------------------------------
        // Q2. Write a program that displays the number of occurrences of an element in the array.

        // Header
        System.out.println("-------------------Q2-------------------");

        // 1. Create an array object to hold numbers
        int [] arrOfNumbers = {1,1,1,3,3,5};

        // 2. Create a Scanner object to take the user input (it will be used for all questions)
        Scanner userInput = new Scanner(System.in);

        // 3. Prompt the user to enter a number to search for
        System.out.print("Enter a number to search for: ");
        int number = userInput.nextInt();

        // 4. Var to hold the number of occurrences of an element in the array
        int occurrences = 0;

        // 5. Loop through the array
        for(int num : arrOfNumbers){
            if(num == number){
                 occurrences = occurrences + 1;
            }
        }

        // 6. Print the array for the user to see if the result is correct
        System.out.println("The array: " + Arrays.toString(arrOfNumbers));

        // 7. Print the result
        if(occurrences > 0) System.out.println(number + " occurs " + occurrences + " times");
        else if (occurrences == 0) System.out.println(number + " occurs " + occurrences + " time");

        //-------------------------------3---------------------------------------
        /* Q3. Write a program to find the k largest elements in a given array.
        Elements in the array can be in any order. */

        // Header
        System.out.println("-------------------Q3-------------------");
        
        // 2. Prompt teh user to enter a number
        System.out.print("Enter a number: ");
        int kNumber = userInput.nextInt();

        // 3. Create an array list object to hold numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // 4. Insert elements
        numbers.add(1);
        numbers.add(4);
        numbers.add(17);
        numbers.add(7);
        numbers.add(25);
        numbers.add(3);
        numbers.add(100);

        // 5. Sort the array list in descending order
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    // Swap elements
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        // 6. New array list to store the k largest elements from the original array list
        ArrayList<Integer> maxNumbers = new ArrayList<Integer>();

        // 7. Loop through the original array list to collect the k largest elements
        for (int i = 0; i < kNumber && i < numbers.size(); i++) {
            maxNumbers.add(numbers.get(i));
        }

        // 8. Print the array list
        System.out.println("The array: " + numbers);

        // 9. Print the largest elements
        System.out.println(kNumber + " largest elements of the said array are: " + maxNumbers);

        //-------------------------------4---------------------------------------
        // Header
        System.out.println("-------------------Q4-------------------");

        // 1. Create an array list object to hold numbers
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // 2. Insert elements
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        // 3. Print the original array list
        System.out.println("The original array: " + nums);

        // 4. Call the method and print the reversed array list
        System.out.println("Reversed Array: " + arrayNumReverse(nums));

        //-------------------------------5---------------------------------------
        /* Q5. Write a menu driven Java program with following option.
        1. Accept elements of an array
        2. Display elements of an array
        3. Search the element within array
        4. Sort the array
        5. To Stop.(The size of the array should be entered by the user.)  */

        // Header
        System.out.println("-------------------Q5-------------------");

        // Vars
        int choice = 0;
        int size = 0;
        int element = 0;

        // 1. Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        size = userInput.nextInt();

        // 2. Create a new array object with the user entered size
        int[] userArray = new int[size];

        // 3. Run the program till the user choose to exit it
        do {
            // 4. Display the menu to the user
            System.out.println("\n*************Arrays Menu*************"
                    + "\n1. Insert elements into the array."
                    + "\n2. Display elements of the array."
                    + "\n3. Search the element within array."
                    + "\n4. Sort the array."
                    + "\n5. Exit program.");

            // 5. Prompt the user to enter a choice
            System.out.print("\nEnter a number: ");
            choice = userInput.nextInt();

            // 6. Check all the cases
            switch (choice) {
                case 1:
                    // Insert into the array
                    for (int i = 0; i < userArray.length; i++) {
                        System.out.print("Enter the " + (i + 1) + " element: ");
                        userArray[i] = userInput.nextInt();
                    }
                    System.out.println("The insertion for " + size +" elements has been completed!");
                    break;
                case 2:
                    // Display the elements of the array
                    System.out.println("The array elements are: " + Arrays.toString(userArray));
                    break;
                case 3:
                    // Search for an element in the array
                    System.out.print("Enter the element you want to search for: ");
                    element = userInput.nextInt();
                    boolean isAvailable = false;
                    for (int i = 0; i < userArray.length; i++) {
                        if (userArray[i] == element) {
                            isAvailable = true;
                            System.out.println("The element " + element + " is available in the array at index " + i);
                            break;
                        }
                    }
                    if (!isAvailable) System.out.println("The element " + element + " is not available in the array");
                    break;
                case 4:
                    // Sort the array (Ascending or descending)
                    System.out.print("Ascending or descending?(enter 1 for asc and -1 for desc) ");
                    element = userInput.nextInt();

                    // Print the original array before sorting
                    System.out.println("The original array: " + Arrays.toString(userArray));

                    if(element == 1){// Ascending order
                        for (int i = 0; i < userArray.length - 1; i++) {
                            for (int j = i + 1; j < userArray.length; j++) {
                                if (userArray[i] > userArray[j]) {
                                    // Swap elements
                                    int temp = userArray[i];
                                    userArray[i] = userArray[j];
                                    userArray[j] = temp;
                                }
                            }
                        }
                    }
                    else if (element == -1) { // Descending order
                        for (int i = 0; i < userArray.length - 1; i++) {
                            for (int j = i + 1; j < userArray.length; j++) {
                                if (userArray[i] < userArray[j]) {
                                    // Swap elements
                                    int temp = userArray[i];
                                    userArray[i] = userArray[j];
                                    userArray[j] = temp;
                                }
                            }
                        }
                    }
                    // Print the array after sorting it
                    System.out.println("The sorted array: " + Arrays.toString(userArray));
                    break;
                case 5:
                    System.out.println("You exited the program!");
                    break;
                default:
                    System.out.println("Please enter a number between 1-5!");
                    break;
            }
        } while (choice != 5);

        //-------------------------------6---------------------------------------
        // Header
        System.out.println("-------------------Q6-------------------");

        // 1. Prompt the user to enter the min and max value
        System.out.print("Enter the minimum value of the range: ");
        int minValue = userInput.nextInt();

        System.out.print("Enter the maximum value of the range: ");
        int maxValue = userInput.nextInt();

        // 2. Prompt the user to enter the number of random numbers to generate
        System.out.print("Enter the number of random numbers to generate: ");
        int numCounter = userInput.nextInt();

        userInput.nextLine();

        // 3. Call the method
        randomNumbers(minValue,maxValue,numCounter);

        //-------------------------------7---------------------------------------
        // Header
        System.out.println("-------------------Q7-------------------");

        // 1. Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = userInput.nextLine();

        // 2. Call the method to evaluate user password
        evaluatePassword(password);

        //-------------------------------8---------------------------------------
        // Header
        System.out.println("-------------------Q8-------------------");

        // 1. Prompt the user to enter a password
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int fibonacciNum = userInput.nextInt();

        // 2. Call the method to generates the Fibonacci sequence
        fibonacciSequence(fibonacciNum);

        //-----------------------------------------------------------------------
        // Close the Scanner
        userInput.close();
    }

    // Q1. Write a program to find all of the longest word in a given dictionary.
    private static ArrayList<String> findLongestWords(ArrayList<String> dictionary) {
        ArrayList<String> longestWords = new ArrayList<String>();

        int maxLength = 0;

        // 1. Find the length of the longest word(s)
        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // 2. Loop through the array list to check for the longest words
        for(String word : dictionary){
            if(word.length() == maxLength)
                longestWords.add(word); // If they have the same length, store the word in the longestWords array list
        }
        return longestWords;
    }

    /* Q4. Create a method to reverse an array of integers.
        Implement the method without creating a new array. */
    public static ArrayList<Integer> arrayNumReverse(ArrayList<Integer> array) {

        for (int i = 0; i < array.size() / 2; i++) {
            int temp = array.get(i);
            array.set(i, array.get(array.size() - 1 - i));
            array.set(array.size() - 1 - i, temp);
        }
        return array;
    }

    /* Q6. Create a method that generates a random number within a given range.
        Allow the user to specify the range and call the method to display random numbers. */
    public static void randomNumbers (int minValue, int maxValue, int numCounter){
        // 1. Create an object from Random class
        Random random = new Random();

        // 2. Var to store the random numbers a string to print it
        StringBuilder randomNumbersAsString = new StringBuilder();

        // 3. Loop
        for(int i = 0; i < numCounter ; i++){
            // 4. Generate random numbers within the range
            int randomNumbers = random.nextInt(maxValue-minValue + 1) + minValue;

            // 5. Add the random generated numbers to the StringBuilder var
            randomNumbersAsString.append(randomNumbers);

            // 6. Add a (-) between every number
            if(i< numCounter -1){
                randomNumbersAsString.append("-");
            }
        }

        // 7. Print the result
        System.out.println("Random numbers within the specified range: " + randomNumbersAsString.toString());
    }

    /* Q7. Write a program that checks the strength of a password. Create a method that evaluates a
    password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters. */
    public static void evaluatePassword(String password){

        // Call the method to check the password length
        int lengthScore = checkLength(password);

        // Call the method to check if the password includes special characters
        int specialCharactersScore = checkSpecialCharacters(password);

        // Call the method to check if the password includes uppercase/lowercase letters
        int upperCaseLowerCaseScore = checkUpperCaseLowerCase(password);

        // Var to calculate the total score
        int totalScore = lengthScore + specialCharactersScore + upperCaseLowerCaseScore;

        // Evaluate the password and print the result
        if(8 <= totalScore )System.out.println("Password is strong.");
        else if (5 <= totalScore) System.out.println("Password is moderately strong.");
        else System.out.println("Password is weak.");
    }

    public static int checkLength(String password){
        int lengthScore = 0;

        if( 0 <= password.length() && password.length() <= 5){
            lengthScore = 0;
        } else if (6 <= password.length() && password.length() <= 7) {
            lengthScore = 2;
        } else if (8 <= password.length()) {
            lengthScore = 3;
        }

        return lengthScore;
    }

    public static int checkSpecialCharacters(String password){
        int specialCharactersScore = 0;

        if(password.matches(".*[^a-zA-Z0-9].*")) specialCharactersScore = 2;
        else specialCharactersScore = 0;

        return specialCharactersScore;
    }

    public static int checkUpperCaseLowerCase(String password){
        int upperCaseLowerCaseScore = 0;

        if( password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")  ) upperCaseLowerCaseScore = 3;
        else upperCaseLowerCaseScore = 0;

        return upperCaseLowerCaseScore;
    }

    /* Q8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
    Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
    and each subsequent number in the sequence is the sum of the two preceding ones. */
    public static void fibonacciSequence(int number){

        String fibonacciString = "";
        int a = 0; // First Fibonacci number
        int b = 1; // Second Fibonacci number
        fibonacciString = fibonacciString + a + " "; // Add the first Fibonacci num

        // Check if number is greater than 1 to include the second number
        if (number > 1) {
            fibonacciString = fibonacciString + b + " "; // Add the second Fibonacci num
        }

        // Start the loop from 2 because we already added the first two numbers
        for (int i = 2; i < number; i++) {
            int fibonacciCalculate = a + b; // Calculate the next Fibonacci number
            fibonacciString = fibonacciString + fibonacciCalculate + " "; // Append it to the string

            // Next two preceding numbers
            a = b;
            b = fibonacciCalculate;
        }
        // Print the result
        System.out.println("Fibonacci sequence with " + number + " terms: " + fibonacciString);
    }
}