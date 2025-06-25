class Solution {
    public int titleToNumber(String columnTitle) {
        int value = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            if (i > 0) {
                value = value * 26;
            }
            value += (columnTitle.charAt(i) - 'A' + 1);
        }
        return value;
    }
}