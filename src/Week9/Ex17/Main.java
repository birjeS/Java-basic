// Main.java
package Week9.Ex17;

import Week9.Ex17.mooc.ui.TextUserInterface;
import Week9.Ex17.mooc.logic.ApplicationLogic;
import Week9.Ex17.mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
