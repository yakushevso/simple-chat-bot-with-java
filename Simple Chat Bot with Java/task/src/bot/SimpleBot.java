package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Hello! My name is Aid.");
                I was created in 2018.
                Please, remind me your name.""");

        String name = scanner.nextLine();

        System.out.printf("""
                What a great name you have, %s!
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.
                """, name);

        int age = (scanner.nextInt() * 70 + scanner.nextInt() * 21 + scanner.nextInt() * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming!", age);
    }
}
