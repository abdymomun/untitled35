import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                ArrayList<Integer> oddNumbers = new ArrayList<>();
                ArrayList<Integer> evenNumbers = new ArrayList<>();
                Random random = new Random();
        Scanner scanner = new Scanner(System.in);


                for (int i = 0; i < 50; i++) {
                    int number = random.nextInt(100) + 1;
                    numbers.add(number);
                }


                for (int number : numbers) {
                    if (number % 2 == 0) {
                        evenNumbers.add(number);
                    } else {
                        oddNumbers.add(number);
                    }
                }


                System.out.println("Список всех чисел:");
                System.out.println(numbers);
                System.out.println("Список нечетных чисел:");
                System.out.println(oddNumbers);
                System.out.println("Список четных чисел:");
                System.out.println(evenNumbers);
            }
        }
