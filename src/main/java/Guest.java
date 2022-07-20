public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean eatsMeat;

    public Guest(String name, String meal, int phoneNumber, boolean eatsMeat) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.eatsMeat = eatsMeat;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isEatsMeat() {
        return eatsMeat;
    }

    public void displayGuestInfo() {
        System.out.println("Name: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("Phone number: " + phoneNumber);
        String eatsMeatString = eatsMeat ? "Yes" : "No";
        System.out.println("Eats meat: " + eatsMeatString);
        System.out.println();
    }

}
