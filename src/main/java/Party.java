import java.util.*;

public class Party {
    //class fields should be declared as private
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals= new HashSet<>();
    private Map<Integer, Guest> phoneBook = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    //methods should be public so they can be called from other classes
    public void addGuest() {
        System.out.println("Enter guest name: ");
        String name = scanner.nextLine();

        System.out.println("Enter preffered meal: ");
        String meal = scanner.nextLine();

        System.out.println("Enter phone number: ");
        int phoneNumber = 0;
        try {
            phoneNumber = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Podano niepoprawny typ danych.");
        }

        System.out.println("Does the guest eats meat? [Y/N]");
        String eatsMeatString = scanner.nextLine();
        boolean eatsMeat;
        if(eatsMeatString.equals("Y") || eatsMeatString.equals("y")) eatsMeat = true;
        else eatsMeat = false;

        Guest guest = new Guest(name, meal, phoneNumber, eatsMeat);

        meals.add(meal);
        phoneBook.put(phoneNumber,guest);
        guests.add(guest);

    }

    public void displayMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber() {
        System.out.println("Enter person's phone number: ");
        try {
            Integer phoneNumber = Integer.parseInt(scanner.nextLine());
            Guest guest = phoneBook.get(phoneNumber);
            guest.displayGuestInfo();
        }
        catch (Exception e) {
            System.out.println("There's nobody on the list with this phone number");
        }
    }

    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestInfo();
        }
    }
}
