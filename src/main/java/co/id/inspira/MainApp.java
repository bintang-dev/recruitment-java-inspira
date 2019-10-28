package co.id.inspira;

public class MainApp {

    public static void main(String[] args) {
        FunctionApp functionApp = new FunctionApp();
        functionApp.printFibonacciRecursive(8);
        System.out.println(functionApp.FactorialRecursive(8));
        functionApp.printFibbonarci(8);
        functionApp.printFactorial(8);
    }
}
