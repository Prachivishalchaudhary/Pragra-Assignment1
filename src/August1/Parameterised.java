package August1;
class Demo1{
    private String firstName;
    private String lastName;
    private int age;
    Demo1(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public void printInfo(){
        System.out.println("Details: "+" "+firstName+" "+lastName+" "+age);
    }

}

public class Parameterised {
    public static void main(String[] args) {
        Demo1 c = new Demo1("Prachi","Chaudhary",22);
        c.printInfo();

    }
}
