package math;
public class Calculator {

    private static final Calculator instance = new Calculator();

    public static Calculator getInstance() {
        return instance;
    }

    private Calculator() {}

    private double memory = 0;

    public double getMemory() {
        return memory;
    }

    public void setMemory(final double memory) {
        this.memory = memory;
    }

    public void add(final double num) {
        memory += num;
    }
    public void sub(final double num) {
        memory -= num;
    }
    public void mult(final double num) {
        memory *= num;
    }
    public void div(final double num) {
        memory /= num;
    }

    public void print() {
        System.out.println(memory);
    }

    public void clear() {
        memory = 0;
    }

}
