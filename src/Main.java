import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static Scanner scan;
    public static void main(String[] args){
        scan = new Scanner(System.in);
        int amount = 0;
        int input = 0;
        String response = null;
        double area = 0;

        do {

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("\tWelcome to a Java simple exercises");
            System.out.println("These are the exercises I have done: ");
            System.out.println("~Exercise nº1: Calculate the average of an array of integers.");
            System.out.println("~Exercise nº2: Calculate if a number is even or not.");
            System.out.println("~Exercise nº3: Show the first 100 prime numbers");
            System.out.println("~Exercise nº4: Show the first n prime numbers.");
            System.out.println("~Exercise nº5: Enter a number or as many as the user wants and check if it is prime.");
            System.out.println("~Exercise nº6: Find the sum of the first 10 natural numbers.");
            System.out.println("~Exercise nº7: Add (in quantity, not accumulate) how many positive numbers a user enters.");
            System.out.println("~Exercise nº8: Check if a year is a leap year or not.");
            System.out.println("~Exercise nº9: Find the ASCII value of a character.");
            System.out.println("~Exercise nº10: Multiply two numbers.");
            System.out.println("~Exercise nº11: Calculate the area of a figure entered by the user.");
            System.out.println("~Exercise nº12: Read a name and display on screen: “Good morning name_entered”.");
            System.out.println("~Exercise nº13: Read an integer by keyboard and obtain and display double and triple that number on the screen.");
            System.out.println("~Exercise nº14: Program that reads a number of degrees Celsius and converts it to degrees Fahrenheit.");
            System.out.println("~Exercise nº15: Program that reads the value of the radius of a circle via keyboard and calculates and displays the length and area of the circle on the screen.");
            System.out.println("~Exercise nº16: Convert a speed in km/h to m/s. The speed is read by keyboard.");
            System.out.println("~Exercise nº17: Program read the length of the legs of a right triangle and calculate the length of the hypotenuse according to the Pythagorean theorem.");
            System.out.println("~Exercise nº18: Read 30 temperatures corresponding to one month and calculate the maximum, the minimum and the average.");
            System.out.println("~Exercise nº19: Enter 2 numbers per keyboard and generate 10 random numbers between those numbers");
            System.out.println("~Exercise nº20: Request a day of the week and check if it is a work day or not");
            System.out.println("~Exercise nº21: Enter a positive integer (controlling the entry) and display the number of digits it has. Control whether it has one or more digits, when displaying the message.");
            System.out.println("~Exercise nº22: Create an application called RPN (Reverse Polish Notation)");
            System.out.println("~Exercise nº23: Request name, age and salary and show salary. If you are under 16, you are not old enough to work. Between 19 and 50 years old the salary is 5% more. Between 51 and 60 years old the salary is 10% more. If you are over 60, the salary is 15% more.");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Enter here the number of the Exercise you want to execute: ");
            int exercise = scan.nextByte();
            switch (exercise) {
                case 1 -> {
                    //Exercise nº1:
                    int[] numbers = {1, 2, 3, 4, 5};
                    float average = numberAverage(numbers);
                    System.out.println("The average numbers is: " + average);
                }
                case 2 -> {
                    //Exercise nº2:
                    double randomNumber = (Math.random() * 100 + 1);
                    int number = (int) randomNumber;
                    if (isEven(number)) {
                        System.out.println("The number " + number + " is even");
                    } else {
                        System.out.println("The number " + number + " is odd");
                    }
                }
                case 3 -> {
                    //Exercise nº3:
                        System.out.println("The first 100 prime numbers are: " + primeNumbers());
                }
                case 4 -> {
                    //Exercise nº4:
                    System.out.println("Set the amount of prime numbers you want to see: ");
                    amount = scan.nextInt();
                    System.out.println("The first " + amount + " prime numbers are: " + primeNumbers(amount));
                }
                case 5 -> {
                    //Exercise nº5:
                    System.out.println("Calculate if a number is prime or not");
                    System.out.println("Put a number: ");
                    input = scan.nextInt();
                    if (primeNumber(input)) {
                        System.out.println("The number " + input + " is prime");
                    } else {
                        System.out.println("The number " + input + " is not prime");
                    }
                }
                case 6 ->{
                    //Exercise nº6:
                        System.out.println("The sum of the first 10 natural numbers are = " + sumFirst10NaturalNumbers());
                }
                case 7 -> {
                    //Exercise nº7:
                    ArrayList<Integer> listOfNumbers = new ArrayList<>();
                    do {
                        System.out.println("Put a number and we will count the amount of even number that you write");
                        input = scan.nextInt();
                        listOfNumbers.add(input);
                        System.out.println("Do you want to keep inserting numbers? (yes/no)");
                        response = scan.nextLine();
                        response = scan.nextLine();
                    } while (response.equalsIgnoreCase("yes"));
                    amount = amountOfEvenNumbers(listOfNumbers);
                    System.out.println("The amount of even numbers are = " + amount);
                }
                case 8 -> {
                    //Exercise nº8:
                    System.out.println("Enter a year and we will tell you if it is a leep year o not");
                    int year = scan.nextInt();
                    if (isLeapYear(year)) {
                        System.out.println(year + " is a Leep Year");
                    } else {
                        System.out.println(year + " is not a Leep Year");
                    }
                }
                case 9 -> {
                    //Exercise nº9:
                    System.out.println("Enter a character to find it's ASCII value");
                    response = scan.nextLine();
                    response = scan.nextLine();
                    char character = response.charAt(0);
                    System.out.println("The ASCII value of the character '" + character + "' is: " + asciiCharacterValue(character));
                }
                case 10 -> {
                    //Exercise nº10: Multiply two numbers.
                    System.out.println("Please enter the multiplicand: ");
                    int multiplicand = scan.nextInt();
                    System.out.println("Please enter the  multiplier: ");
                    int multiplier = scan.nextInt();
                    System.out.println("The multiplication of number " + multiplicand + " by the number " + multiplier + " is equal to " + multiplication(multiplicand, multiplier));
                }
                case 11 -> {
                    //Exercise nº11: Calculate the area of a figure entered by the user.
                    do{

                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("These are the figures available to calculate your area:");
                        System.out.println("1- Rectangle");
                        System.out.println("2- Triangle");
                        System.out.println("3- Square");
                        System.out.println("4- Circle");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Enter here your choose: ");
                        input = scan.nextInt();
                        switch (input){
                            case 1 -> {
                                System.out.println("Calculate the Area of a Rectangle:");
                                System.out.println("Please enter the Length: ");
                                float length = scan.nextFloat();
                                System.out.println("Now please enter the Width: ");
                                float width = scan.nextFloat();
                                area = calculateArea(length, width);
                                System.out.println("The area of the Rectangle is equal to: "+area);
                            }
                            case 2 -> {
                                System.out.println("Calculate the Area of a Triangle:");
                                System.out.println("Please enter the Base: ");
                                float base = scan.nextFloat();
                                System.out.println("Now please enter the Height: ");
                                float height = scan.nextFloat();
                                area = calculateArea(base, height, 0.5);
                                System.out.println("The area of the Triangle is equal to: "+area);
                            }
                            case 3 -> {
                                System.out.println("Calculate the Area of a Square:");
                                System.out.println("Please enter the Side: ");
                                float side = scan.nextFloat();
                                area = calculateArea(side);
                                System.out.println("The area of the Square is equal to: "+area);
                            }
                            case 4 -> {
                                System.out.println("Calculate the Area of a Circle:");
                                System.out.println("Please enter the Radius: ");
                                float radius = scan.nextFloat();
                                area = calculateArea(radius, Math.PI);
                                System.out.println("The area of the Circle is equal to: "+area);
                            }
                            default -> System.out.println("The choosen number do not exist.. try again :)");
                        }
                        System.out.println("Do you want to continue calculating the area of figures? (yes/no)");
                        response = scan.nextLine();
                        response = scan.nextLine();
                    }while (response.equalsIgnoreCase("yes"));
                }
                case 12 -> {
                    //Exercise nº12: Read a name and display on screen: “Good morning name_entered”:
                    System.out.println("Please enter your name: ");
                    response = scan.nextLine();
                    response = scan.nextLine();
                    if (response != null){
                        System.out.println(sayGM(response));
                    }
                }
                case 13 -> {
                    //Exercise nº13: Read an integer by keyboard and obtain and display double and triple that number on the screen.
                    System.out.println("Please enter a number: ");
                    input = scan.nextInt();
                    System.out.println("The double of the number "+input+" is: "+doubleNumber(input)+" and the triple is: "+tripleNumber(input));
                }
                case 14 -> {
                    //Exercise nº14: Program that reads a number of degrees Celsius and converts it to degrees Fahrenheit.
                    System.out.println("Let start with the convertion!!");
                    System.out.println("Please enter a number of degrees Celsius: ");
                    float celsius = scan.nextFloat();
                    System.out.println("The convertion is ready!! ...");
                    System.out.println(celsius+"°C --> "+convertCelsiusToFahrenheit(celsius)+"°F");
                }
                case 15 -> {
                    //Exercise nº15: Program that reads the value of the radius of a circle via keyboard and calculates and displays the length and area of the circle on the screen.
                    System.out.println("Please enter the radius of the Circle: ");
                    float radius = scan.nextFloat();
                    area = calculateArea(radius, Math.PI);
                    System.out.println("The area of the Circle is equal to: "+area);
                    System.out.println("The length of the Circle is equal to: "+circleLenght(radius));
                }
                case 16 -> {
                    //Exercise nº16: Convert a speed in km/h to m/s. The speed is read by keyboard.
                    System.out.println("Let start with the convertion!!");
                    System.out.println("Please enter the speed in km/h: ");
                    float speed = scan.nextFloat();
                    System.out.println("The convertion is ready!! ...");
                    System.out.println(speed+" km/h --> "+kmToMs(speed)+" m/s");
                }
                case 17 -> {
                    //Exercise nº17: Program read the length of the legs of a right triangle and calculate the length of the hypotenuse according to the Pythagorean theorem.
                    System.out.println("Please enter the Base: ");
                    float base = scan.nextFloat();
                    System.out.println("Please enter the Altitude: ");
                    float altitude = scan.nextFloat();
                    System.out.println("The lenght of the hypotenuse according to the Pythagorean theorem is equal to: "+ pythagoreanTheorem(base, altitude));
                }
                case 18 -> {
                    //Exercise nº18: Read 30 temperatures corresponding to one month and calculate the maximum, the minimum and the average.
                    ArrayList<Float> temperatures = new ArrayList<>();
                    System.out.println("List of temperatures of one random Month: \n");
                    for (int i =0; i<30; i++){
                        float temperature = (float) (Math.random() * 60 + (-5));
                        temperatures.add(temperature);
                        System.out.println(temperature+"°");
                    }
                    System.out.println("The MAXIMUS temperature is: "+ maximumTemp(temperatures)+"\n And the MINIMUS temperature is: "+minimumTemp(temperatures));
                    System.out.println("The AVERAGE temperature is: "+averageTemp(temperatures));
                }
                case 19 -> {
                    //Exercise nº19: Enter 2 numbers per keyboard and generate 10 random numbers between those numbers
                    System.out.println("Please enter one number:");
                    float number1 = scan.nextFloat();
                    System.out.println("Please enter another number: ");
                    float number2 = scan.nextFloat();
                    System.out.println("10 Random numbers between numbers: "+number1+" and "+number2+": ");
                    for (float number: randomNumbersBetween(number1,number2)) {
                        System.out.println(number);
                    }
                }
                case 20 -> {
                    //Exercise nº20: Request a day of the week and check if it is a work day or not
                    System.out.println("Please enter one day of the week: ");
                    response = scan.nextLine();
                    response = scan.nextLine();

                    try {
                        if(isWorkDay(response)){
                            System.out.println("The day: "+response+" is a Work Day");
                        } else {
                            System.out.println("The day: "+response+" is not a Work Day");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 21 -> {
                    //Exercise nº21: Enter a positive integer (controlling the entry) and display the number of digits it has. Control whether it has one or more digits, when displaying the message.
                    System.out.println("Please enter a positive Integer: ");
                    input = scan.nextInt();
                    System.out.println("The amount of digits of the number: "+input+" is "+numberDigits(input));
                }
                case 22 -> {
                    //Exercise nº22: Create an application called RPN (Reverse Polish Notation)
                    System.out.println("Please enter one number: ");
                    float number1 = scan.nextFloat();
                    System.out.println("Please enter another number: ");
                    float number2 = scan.nextFloat();
                    System.out.println("The mathematical signs available are:");
                    System.out.println("Addition (+)");
                    System.out.println("Subtraction (-)");
                    System.out.println("Multiplication (*) or (.)");
                    System.out.println("Division (/)");
                    System.out.println("Power (^)");
                    System.out.println("Remainder (%)");
                    System.out.println("Now, enter the Math Simbol: ");
                    response = scan.nextLine();
                    response = scan.nextLine();
                    char symbol = response.charAt(0);
                    try {
                        System.out.println(number1+" "+symbol+" "+number2+" = "+ reversePolishNotation(number1,number2,symbol));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 23 -> {
                    //Exercise nº23: Request name, age and salary and show salary. If you are under 16, you are not old enough to work. Between 19 and 50 years old the salary is 5% more. Between 51 and 60 years old the salary is 10% more. If you are over 60, the salary is 15% more.
                    System.out.println("To calculate your final salary first we need your age");
                    input = scan.nextInt();
                    if(input<16){
                        System.out.println("You are not fit to work because you are a minor");
                    } else {
                        System.out.println("Now, we need your current salary: ");
                        float salary = scan.nextFloat();
                        System.out.println("Your salary is equal to: $"+calculateSalary(input,salary));
                    }
                }
                default -> System.out.println("Sorry, I did not do that exercise... Try another one!");
            }
            System.out.println("You want to keep executing exercises? (yes/no)");
            response = scan.nextLine();
            response = scan.nextLine();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Thanks for your time :) Bye bye!! ");
    }


    //Exercise nº1: Calculate the average of an array of integers.
    public static float numberAverage(int[] numbers){
        int sum =0;
        int length = numbers.length;
        for (int number: numbers) {
            sum += number;
        }
        return (float) sum / length;
    }


    //Exercise nº2: Calculate if a number is even or not.
    public static boolean isEven (int number){
        return number % 2 == 0;
    }


    //Exercise nº3: Show the first 100 prime numbers
    public static ArrayList<Integer> primeNumbers () {
        ArrayList<Integer> numbers = new ArrayList<>();

        //Start from number 2:
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            //Looking for divisor
            for (int i = 2; i <= Math.sqrt(num); i++) {
                //If it isn't prime it breaks the for bucle
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            //If the number is prime, it add it to the 'numbers' arrayList
            if (isPrime) {
                numbers.add(num);
            }
        }
        return numbers;
    }


   //Exercise nº4: Show the first n prime numbers.
    public static ArrayList<Integer> primeNumbers (int amount) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //Start from number 2:
        for (int num = 2; num <= 100 && numbers.size() < amount; num++) {
            boolean isPrime = true;

            //Looking for divisor
            for (int i = 2; i <= Math.sqrt(num); i++) {
                //If it isn't prime it breaks the for bucle
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            //If the number is prime, it add it to the 'numbers' arrayList
            if (isPrime) {
                numbers.add(num);
            }
        }
        return numbers;
    }


    //Exercise nº5: Enter a number or as many as the user wants and check if it is prime.
    public static boolean primeNumber (int number) {
        boolean isPrime = true;

        //Looking for divisor
        for (int i = 2; i <= Math.sqrt(number); i++) {
            //If it isn't prime it breaks the for bucle
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }


    //Exercise nº6: Find the sum of the first 10 natural numbers.
    public static int sumFirst10NaturalNumbers (){
        int sum = 0;
        for (int i=0; i<=10; i++){
            sum += i;
        }
        return sum;
    }


    //Exercise nº7: Add (in quantity, not accumulate) how many positive numbers a user enters
    public static int amountOfEvenNumbers (ArrayList<Integer> numbers){
        int amountOfEven = 0;
        for (int number: numbers) {
            if(number%2 == 0){
                amountOfEven ++;
            }
        }
        return amountOfEven;
    }


    //Exercise nº8:Check if a year is a leap year or not
    public static boolean isLeapYear (int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    //Exercise nº9:Find the ASCII value of a character.
    public static int asciiCharacterValue (char character){
        return character;
    }


    //Exercise nº10: Multiply two numbers.
    public static int multiplication (int multiplicand, int multiplier){
        return Math.multiplyExact(multiplicand, multiplier);
    }


    //Exercise nº11: Calculate the area of a figure entered by the user.
    //Case of a Rectangle:
    public static double calculateArea (float lenght, float width){
        return lenght*width;
    }
    //Case of a Square:
    public static double calculateArea (float side){
        return Math.pow(side,2);
    }
    //Case of a Triangle:
    public static double calculateArea (float base, float height, double product){
        return product*base*height;
    }
    //Case of a Circle:
    public static double calculateArea (float radius, double pi){
        return pi * Math.pow(radius,2);
    }


    //Exercise nº12: Read a name and display on screen: “Good morning name_entered”
    public static String sayGM (String name){
        return "Good morning, "+name;
    }


    //Exercise nº13: Read an integer by keyboard and obtain and display double and triple that number on the screen.
    public static int doubleNumber (int number){
        return number*number;
    }
    public static int tripleNumber (int number){
        return number*number*number;
    }


    //Exercise nº14: Program that reads a number of degrees Celsius and converts it to degrees Fahrenheit.
    public static float convertCelsiusToFahrenheit (float celsius){
        return 32 + (9*celsius/5);
    }


    //Exercise nº15: Program that reads the value of the radius of a circle via keyboard and calculates and displays the length and area of the circle on the screen.
    public static double circleLenght (float radius){
        return 2*radius*Math.PI;
    }


    //Exercise nº16: Convert a speed in km/h to m/s. The speed is read by keyboard.
    public static float kmToMs (float km){
        return km*((float) 5 /18);
    }


    //Exercise nº17: Program read the length of the legs of a right triangle and calculate the length of the hypotenuse according to the Pythagorean theorem.
    public static double pythagoreanTheorem (float base, float altitude){
        return Math.sqrt((Math.pow(base,2)+Math.pow(altitude,2)));
    }


    //Exercise nº18: Read 30 temperatures corresponding to one month and calculate the maximum, the minimum and the average.
    public static float maximumTemp (ArrayList<Float> temperatures){
        return Collections.max(temperatures);
    }
    public static float minimumTemp (ArrayList<Float> temperatures) {
        return Collections.min(temperatures);
    }
    public static float averageTemp (ArrayList<Float> temperatures) {
        float sum = (float) temperatures.stream().mapToDouble(Float::floatValue).sum();

        return (float) sum /temperatures.size();
    }


    //Exercise nº19: Enter 2 numbers per keyboard and generate 10 random numbers between those numbers
    public static ArrayList<Float> randomNumbersBetween (float num1, float num2){
        ArrayList<Float> randomNumbers = new ArrayList<>();
        float number = 0;
        for (int i =0; i<10; i++){
            if(num1 >= num2){
                number = (float) (Math.random() * num1-1 + (num2));
            }else {
                number = (float) (Math.random() * num2-1 + (num1));
                
            }
            randomNumbers.add(number);
        }
        return randomNumbers;
    }


    //Exercise nº20: Request a day of the week and check if it is a work day or not
    public static boolean isWorkDay (String day) throws Exception {
        boolean workDay = false;
        switch (day){
           case "monday", "Monday", "tuesday", "Tuesday", "wednesday", "Wednesday", "Thursday", "thursday", "friday", "Friday" -> {
                workDay= true;
           }
           case "saturday", "Saturday", "sunday", "Sunday" -> {
           }
            default -> {
               throw new Exception("Invalid Input");
            }
        }
        return workDay;
    }


    //Exercise nº21: Enter a positive integer (controlling the entry) and display the number of digits it has. Control whether it has one or more digits, when displaying the message.
    public static int numberDigits (int number){
        int digits = 0;
        while (number!= 0){
            number = number/10;
            digits++;
        }
        return digits;
    }


    //Exercise nº22: Create an application called RPN (Reverse Polish Notation)
    public static float reversePolishNotation (float number1, float number2, char sign) throws Exception {
        switch (sign){
            case '+' -> {
                return number1+number2;
            }
            case '-' -> {
                return number1-number2;
            }
            case '*','.' -> {
                return number1*number2;
            }
            case '/' -> {
                return number1/number2;
            }
            case '^' -> {
                return (float) Math.pow(number1,number2);
            }
            case '%' -> {
                return number1%number2;
            }
            default -> {
                throw new Exception("Invalid Math Symbol");
            }
        }
    }


    //Exercise nº23: Request name, age and salary and show salary.
    //If you are under 16, you are not old enough to work. Between 19 and 50 years old the salary is 5% more. Between 51 and 60 years old the salary is 10% more. If you are over 60, the salary is 15% more.
    public static float calculateSalary (int age, float salary){
        if(age >= 19 && age <=50){
            salary += salary*0.5;
        } else if(age >= 51 && age <= 60){
            salary += salary*0.10;
        } else if(age >60){
            salary += salary*0.15;
        }
        return salary;
    }

}