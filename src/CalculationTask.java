public class CalculationTask extends Thread {

        private Calculator calculator;
        private double a, b;
        private String operation;

        public CalculationTask(Calculator calculator, double a, double b, String operation) {
            this.calculator = calculator;
            this.a = a;
            this.b = b;
            this.operation = operation;
        }

        @Override
        public void run() {
            double result = 0;

            switch (operation.toLowerCase()) {
                case "add":
                    result = calculator.add(a, b);
                    break;
                case "subtract":
                    result = calculator.subtract(a, b);
                    break;
                case "multiply":
                    result = calculator.multiply(a, b);
                    break;
                case "divide":
                    result = calculator.divide(a, b);
                    break;
                default:
                    System.out.println("Unknown operation: " + operation);
            }

            System.out.println(
                    "Thread: " + Thread.currentThread().getName() +
                            " → Result of " + operation + " (" + a + ", " + b + ") = " + result
            );
        }
    }
