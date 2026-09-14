package org.vikash;

public class ReverseString {
    public String reverseString(String str) {
        int l = 0;
        int r = str.length() - 1;
        char[] ch = str.toCharArray();
        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}
