public class App {
    public static void main(String[] args) {
    
        int x = 10;

        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("Enjoy the weather!");
        }

        int number = -7;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}