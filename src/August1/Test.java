package August1;
class Demo{
    private String country;
    private String name;
    private int age;
    Demo(){
        country="canada";
        name="prachi";
        age=22;
    }
    public void info(){
        System.out.println("Details: "+" "+country+" "+name+" "+age);
    }
}

public class Test {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.info();

    }
}
