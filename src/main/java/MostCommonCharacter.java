import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * 
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        char mostCommon = str.charAt(0);
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            int count = freqMap.getOrDefault(c, 0) + 1;
            freqMap.put(c, count);

            // Update the most common character if needed
            if (count > maxCount) {
                maxCount = count;
                mostCommon = c;
            }
        }

        return mostCommon;
    }
}
