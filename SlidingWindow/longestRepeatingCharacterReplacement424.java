package Day9;

public class longestRepeatingCharacterReplacement424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(CharacterReplacement(s, k));
    }
    public static int CharacterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, right = 0;
        int maxlength = 0, maxcount = 0;
        for (right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxcount = Math.max(maxcount, count[s.charAt(right) - 'A']);
            int windowsize = right - left + 1;
            if (windowsize - maxcount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
