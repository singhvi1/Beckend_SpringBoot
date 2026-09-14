package org.vikash;

public class ReverseString {
    public String reverseString(String str) {
        char[] ch = str.toCharArray();
        int l = 0;
        int r = str.length() - 1;
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
