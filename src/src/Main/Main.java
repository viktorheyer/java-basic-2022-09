package Main;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Please enter you full name");
        String fullName = sc.nextLine();
        String encoderFullName = Base64.getEncoder().encodeToString(fullName.getBytes());
        System.out.println("Program result: " +encoderFullName);

    }
}