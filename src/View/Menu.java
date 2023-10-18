package View;

import java.util.ArrayList;

import Common.Validation;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> choice;
    protected Validation v = new Validation();

    public Menu() {
        choice = new ArrayList<>();
    }

    public Menu(String title, String[] mchoice) {
        this.title = title;
        choice = new ArrayList<>();
        for (String s : mchoice) {
            choice.add((T) s);
        }
    }

    // -----------------------------------------------
    public void display() {
        System.out.println(title);
        System.out.println("------------------------------");
        for (int i = 0; i < choice.size(); i++) {
            System.out.println((i + 1) + ". " + choice.get(i));
        }
        System.out.println("------------------------------");
    }

    // ------------------------------------------------
    public int getChoice() {
        display();
        return Validation.getInt("Enter your choice: ", 1, choice.size());
    }

    // -------------------------------------------------
    public abstract void execute(int n);

    // -------------------------------------------------
    public void run() {
        while (true) {
            int n = getChoice();
            execute(n);
            if (n > choice.size()) {
                break;
            }
        }
    }
}
