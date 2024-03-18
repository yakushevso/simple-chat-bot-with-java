package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Hello! My name is Aid.");
                I was created in 2018
                Please, remind me your name.""");

        System.out.printf("What a great name you have, %s!", scanner.next());
    }
}
