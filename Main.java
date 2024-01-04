package EmailApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstname = in.next();
        String lastName = in.next();
        Email em1 = new Email(firstname, lastName);
        System.out.println(em1.showInfo());
    }
}