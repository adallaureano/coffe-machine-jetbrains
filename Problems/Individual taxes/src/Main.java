import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
/*
        Scanner scanner = new Scanner(System.in);
        String[] strNumb = scanner.nextLine().split(" ");
        int count = scanner.nextInt();

        int[] numbers = new int[strNumb.length];

        for (int i = 0; i < strNumb.length; i++) {
            numbers[i] = Integer.parseInt(strNumb[i]);
        }

        int length = scanner.nextInt();
        int[] a = new int[length];
 */


        int nCompanies = scanner.nextInt();
        String[] companies = scanner.nextLine().split(" ");
        int[] companiesNumbers = new int[nCompanies];
        //int[] incomingCompanies = new int[nCompanies];
        //int[] taxCompanies = new int[nCompanies];

        for (int i = 1; i <= companies.length; i++) {
            companiesNumbers[i] = Integer.parseInt(companies[i]);
            if (companiesNumbers[i] > 0) {

            }
        }
    }
}
