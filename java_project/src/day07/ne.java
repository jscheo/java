package day07;
import java.util.Scanner;

public class ne {
    int x = 5;
    String message;

    public void setMessage(String input) {
        message = input;
    }

    public static void main(String[] args) {
        ne myObj = new ne();
        System.out.println(myObj.x);

        Scanner scanner = new Scanner(System.in);
        System.out.print("메시지를 입력하세요: ");
        String input = scanner.nextLine();

        myObj.setMessage(input);

        System.out.println("입력된 메시지: " + myObj.message);
    }
}