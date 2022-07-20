import java.util.Scanner;

public class GuestList {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Party party = new Party();

        while(true) {
            System.out.println("Choose option: ");
            System.out.println("[1] Add guest");
            System.out.println("[2] Display guests");
            System.out.println("[3] Display meals");
            System.out.println("[4] Find by phone no");
            System.out.println("[5] Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: party.addGuest();
                break;
                case 2: party.displayGuests();
                break;
                case 3: party.displayMeals();
                break;
                case 4: party.displayGuestByPhoneNumber();
                break;
                case 5: System.exit(0);
            }
        }
    }
}
