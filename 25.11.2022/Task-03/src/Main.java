public class Main {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("Peter is from Spain!      ");
        String secondText = new String("Peter is from Spain!        ");
        int lastIndex = text.length() - 1;

        System.out.println(secondText.trim());

        while (text.charAt(lastIndex) == ' ') {
            text.deleteCharAt(lastIndex);
            lastIndex--;
        }

        System.out.println(text);
    }
}