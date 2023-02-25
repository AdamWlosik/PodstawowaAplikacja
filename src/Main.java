import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);
        Party party = new Party();

        while(shouldContinue){
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po numerze telegonu");
            System.out.println("5. Wyjscie");
            int useChoice = scanner.nextInt();

            switch (useChoice) {
                case 1 -> party.displayGuest();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;

            }
        }
    }
}
