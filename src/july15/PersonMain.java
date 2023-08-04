package july15;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        int age=person1.age;
        System.out.println("My age is"+" "+age);
        double height=person1.height;
        System.out.println("My height is"+" "+height);
        String name= person1.name;
        System.out.println("My name is"+" "+name);

        person1.address();
        person1.work();
        person1.education();

    }
}
