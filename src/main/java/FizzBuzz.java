public class FizzBuzz {
    public String play(String s) {
        int number = Integer.parseInt(s);

        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);

    }
}
