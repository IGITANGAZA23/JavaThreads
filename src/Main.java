public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Create thread tasks
        Thread t1 = new CalculationTask(calc, 10, 5, "add");
        Thread t2 = new CalculationTask(calc, 20, 3, "subtract");
        Thread t3 = new CalculationTask(calc, 6, 7, "multiply");
        Thread t4 = new CalculationTask(calc, 50, 10, "divide");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
