package Week7;

import java.util.HashMap;

public class Ex5 {
    public static void main(String[] args) {
        // Create a HashMap to store names and nicknames
        HashMap<String, String> nicknames = new HashMap<>();

        // Store names and nicknames in the HashMap
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        // Retrieve and print Mikael's nickname
        String mikaelNickname = nicknames.get("mikael");
        System.out.println("Mikael's nickname: " + mikaelNickname);
    }
}
