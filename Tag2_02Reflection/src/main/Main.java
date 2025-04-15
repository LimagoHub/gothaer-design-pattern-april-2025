package main;

import tiere.Schwein;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Class clazz;

        // 1. Fall
        clazz = Schwein.class;

        // 2.Fall
        Schwein piggy = new Schwein();
        clazz = piggy.getClass();

        // 3.Fall
        clazz = Class.forName("tiere.Schwein");

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println("-".repeat(20));
        Method[] methods = clazz.getMethods();
        for(Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println("-".repeat(20));
        methods = clazz.getDeclaredMethods();
        for(Method m : methods) {
            System.out.println(m.getName());
        }
        Object obj = clazz.getConstructor().newInstance();
        System.out.println(obj);

        Constructor constructor = clazz.getConstructor(String.class);
        obj = constructor.newInstance("Miss Piggy");
        System.out.println(obj);

        Method m = clazz.getDeclaredMethod("fuettern");
        m.invoke(obj);

        System.out.println(obj);

        m = clazz.getDeclaredMethod("setGewicht", int.class);
        m.setAccessible(true);
        m.invoke(obj, -100);

        System.out.println(obj);
    }
}