public class Main {
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("(")) {
                count = count + 1;
            }
            else {
                count = count -1;
            }
            if (count < 0) {
                return false;
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    // 2. reverseInteger
    public static String reverseInteger(int a) {
        String input = String.valueOf(a);
        String thing = "";
        for (int i = 0; i < input.length(); i++) {
            thing = input.charAt(i) + thing;
        }
        return thing;
    }

    // 3. encryptThis®
    public static String encryptThis(String str) {
        String thing = "";
        String[] wordBank = str.split(" ");
        for (String converter : wordBank) {
            char firstLet = converter.charAt(0);
            char secondLet = '\0';
            if (converter.length() > 2) {
                secondLet = converter.charAt(1);
            }
            char lastLet = converter.charAt(converter.length()-1);
            String body = "";
            if (converter.length() > 2) {
                body = converter.substring(2, converter.length() - 1);
            }
            thing += ((int) firstLet) + "" + lastLet + body + secondLet + " ";
        }
        return thing.substring(0, thing.length() - 1).trim();
    }
    // 4. decipherThis
    /* Honestly, solving this was a lot easier than I thought. I think the main difficulty was actually figuring out the
    logic of encrypt this haha! Anyway, feels good to be done. */
    public static String decipherThis(String str) {
        String thing = "";
        String[] wordBank = str.split(" ");
        String first = "";
        int takeDistance = 0;
        for (String converter : wordBank) {
            first = "";
            takeDistance = 0;
            for (int i = 0; i < converter.length(); i++) {
                if (Character.isDigit(converter.charAt(i))) {
                    first += converter.charAt(i);
                    takeDistance += 1;
                }
            }
            int firstNum = Integer.parseInt(first);
            char firstLet = (char) firstNum;
            char secondLet = '\0';
            if (converter.length() > 4) {
                secondLet = converter.charAt(takeDistance);
            }
            char lastLet = converter.charAt(converter.length()-1);
            String body = "";
            if (converter.length() > 4) {
                body = converter.substring(takeDistance+1, converter.length() - 1);
            }
            thing += firstLet + "" + lastLet + body + secondLet + " ";
        }
        return thing.substring(0, thing.length() - 1).trim();
    }
}