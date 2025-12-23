
public enum Action {
    DISPLAY_STUDENT("Display Student"),
    DISPLAY_ALL_STUDENTS("Display All Students"),
    ADD_MORE_STUDENTS("Add More Students"),
    EXIT("Exit");

    private final String identifier;

    Action(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public static void displayMenu() {
        for (int i = 0; i < Action.values().length; i++) {
            System.out.println(i + 1 + ". " + Action.values()[i].getIdentifier());
        }
    }

    @Override
    public String toString() {
        return "action: " + identifier;
    }

}
