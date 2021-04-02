package ab.techstack.coding.problems.random;

public class OnlyDigitCheck {

    public boolean containsOnlyDigits(String line){
        char[] chars = line.toCharArray();
        for (int i=0; i<chars.length; i++) {
            if(!Character.isDigit(chars[i])){
                return false;
            }
        }
        return true;
    }

    public boolean containsOnlyDigitsUsingJ8(String line){
        return !line.chars()
                .anyMatch(ch -> !Character.isDigit(ch));
    }


    public boolean containsOnlyDigitsUsingRegex(String line){
        return line.matches("[0-9]+");
    }
}
