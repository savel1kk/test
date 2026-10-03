package org.example.reverse;

public class Reverse {
    public static String reverseLetter(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }

        }
        return new String(chars);

    }

}
