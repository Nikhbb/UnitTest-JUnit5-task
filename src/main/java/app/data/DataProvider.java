package app.data;

import java.util.Scanner;

public class DataProvider {

    public int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature from -10 to +35 include: ");
        return scanner.nextInt();
    }
}
