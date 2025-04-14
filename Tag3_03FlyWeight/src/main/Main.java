package main;
public class Main {
    public static void main(String[] args) {

        AttributedCharacter a1 = AttributedCharacter.getInstance('A', false);
        AttributedCharacter a2 = AttributedCharacter.getInstance('A', false);
        AttributedCharacter a3 = AttributedCharacter.getInstance('A', true);
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println("Hello, World!");
    }
}