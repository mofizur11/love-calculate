package com.ideasoft.lovecalculate;

public class CountingCharacters {

    public String countChars(String str1, String str2) {

        String combinedString = str1 + "loves" + str2;

        StringBuilder strAllChars = new StringBuilder();
        StringBuilder strCount = new StringBuilder();
        for (char c1 : combinedString.toCharArray()) {
            if (strAllChars.toString().indexOf(c1) < 0) {
                int count = 0;
                for (char c2 : combinedString.toCharArray()) {
                    if (c1 == c2) {
                        count = count + 1;
                    }
                }
                strAllChars.append(c1);
                strCount.append(count);
            }
        }
        return strCount.toString();
    }
}
