package main;

import client.Client;
import math.Calculator;
import math.CalculatorImpl;
import math.CalculatorLogger;
import math.CalculatorSecure;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        //----
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println("Duration = " + duration.toMillis());


        Calculator calculator = new CalculatorImpl();
        calculator = new CalculatorLogger(calculator);
        calculator = new CalculatorSecure(calculator);
        Client client = new Client(calculator);
        client.go();
    }
}