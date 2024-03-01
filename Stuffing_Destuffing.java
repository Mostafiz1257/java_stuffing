import java.util.Scanner;

public class Stuffing_Destuffing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Input stuffing starting word: ");
        String startWord = scanner.nextLine();
        System.out.print("Input stuffing finishing word: ");
        String endWord = scanner.nextLine();
        System.out.print("Input matching string: ");
        String matchingString = scanner.nextLine();

        System.out.println("The main string is: " + mainString);

        if (!mainString.contains(matchingString)) {
            System.out.println("No string is matching");
        } else {

            String stuffedString = startWord + " "
                    + mainString.replaceAll(matchingString, matchingString + matchingString) + " " + endWord;
            System.out.println("After stuffing: " + stuffedString);
            String destuffedString = stuffedString.replaceAll(matchingString + matchingString, matchingString);
            System.out.println("After de-stuffing: " + destuffedString);
        }

        scanner.close();
    }
}
