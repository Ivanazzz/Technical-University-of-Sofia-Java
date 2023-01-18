public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            public void printAnimalInfo() {
                System.out.println("Name: Rex, Age: 5");
            }
        };

        dog.printAnimalInfo();
    }
}