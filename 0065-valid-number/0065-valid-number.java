import java.util.regex.Pattern;

class Solution {
    private static final Pattern NUMBER_PATTERN = 
        Pattern.compile("^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$");

    public boolean isNumber(String s) {
        return NUMBER_PATTERN.matcher(s).matches();
    }
}