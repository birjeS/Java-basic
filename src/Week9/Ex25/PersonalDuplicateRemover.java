package Week9.Ex25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author seankeever
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private int amount;
    private Set<String> uniqueStrings = new HashSet<String>();

    @Override
    public void add(String characterString) {
        if (uniqueStrings.contains(characterString)) {
            amount++;
        }
        uniqueStrings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return amount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueStrings;
    }

    @Override
    public void empty() {
        uniqueStrings.clear();
        amount = 0;
    }
}