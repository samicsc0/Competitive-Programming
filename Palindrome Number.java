class Solution {
        public static boolean isPalindrome(int x) {
        String changedString = Integer.toString(x);
        String reversedString = "";
        for (int i = changedString.length() - 1; i >= 0; i--) {
            reversedString += changedString.charAt(i);
        }
        return changedString.equals(reversedString);
    }
}