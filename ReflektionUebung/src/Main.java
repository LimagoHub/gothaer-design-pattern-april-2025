import creator.BeanCreator;

public class Main {
    public static void main(String[] args) {

        BeanCreator beanCreator = new BeanCreator();
        Object object = beanCreator.createAndPopulateBean("pojo.Person");
        System.out.println(object);
    }
}