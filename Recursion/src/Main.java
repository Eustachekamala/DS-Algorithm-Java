//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Recursion =  Recursion is when a method calls itself to solve a smaller part of a problem.
                        It typically includes:
                        * Base case – the condition to stop recursion.
                        * Recursive case – where the function calls itself with smaller input
         */
        walk(5);
        System.out.println(factorial(7));
    }

    private static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    private static void walk(int steps) {
        if (steps < 1) return ; // base case
        System.out.println("You take a step!");
        walk(steps - 1); // recursion
    }
}