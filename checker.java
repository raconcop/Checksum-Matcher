import java.util.Scanner;


public class checker {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the checksum provided:");
        String checksum = in.nextLine();
        System.out.println("The checksum from the computer you entered is :" + checksum);
        

        System.out.println("Enter the checksum from the cmd:");
        String userInput = in.nextLine();
        System.out.println("The checksum you provided is :" + userInput);
        

        if(checksum.equals(userInput)){
            System.out.println("\n Your download seems clean! Checksum:" + checksum);
        }else {
            System.out.println("\n Do not trust your download");
            displayDifferences(checksum, userInput);
        }
    }

    private static void displayDifferences(String str1, String str2){
        int maxLength = Math.max(str1.length(), str2.length());

        StringBuilder diffBuilder = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            if (i >= str1.length() || i >= str2.length() || str1.charAt(i) != str2.charAt(i)) {
                diffBuilder.append(" ^ ");
            } else {
                diffBuilder.append(str1.charAt(i));
            }
        }

        // Display the strings with differences marked
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Differences:");
        System.out.println(diffBuilder.toString());
    }



}
