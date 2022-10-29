public class Main {
    public static void main(String[] args) {

        String text = "some text";
        int charsCount = 0;

        for (int i = 0; i < text.length(); i++) {
            charsCount++;
        }

        System.out.format("(%s) -> %d", text, charsCount);
    }
}