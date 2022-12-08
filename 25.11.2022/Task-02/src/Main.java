public class Main {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("       Peter is from Spain!");
        String secondText = new String("       Peter is from Spain!");
        int index = 0;

        System.out.println(secondText.trim());

        while (text.charAt(index) == ' ') {
            text.deleteCharAt(0);
        }

        System.out.println(text);
    }
}