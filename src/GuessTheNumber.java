import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(11); // генератор случайных чилен, от 0 до 10
        int attemptsLeft = 3;

        System.out.println("Добро пожаловать в игру по угадыванию числу!");
        System.out.println("У вас есть " + attemptsLeft + " попытки угадать число от 0 до 10.");

        while (attemptsLeft > 0) {
            System.out.print("Введите свое число: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Поздравляем! Вы правильно угадали число.");
                return;
            } else {
                attemptsLeft--;
                System.out.println("Неверное число. У вас осталось " + attemptsLeft + " попытки.");
            }
        }

        System.out.println("Простите, вы не угадали число. Число было " + numberToGuess);
    }
}