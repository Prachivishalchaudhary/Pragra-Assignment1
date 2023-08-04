package August1;
class Exam{
    int memory;
    String type;
    String brandName;
    Exam(){
        System.out.println("For information,go to parameterised constructor");
    }
    Exam(int memory){
        this();
        this.memory=memory;
    }
    Exam(int memory,String type){

        this(memory);
        this.memory=memory;
        this.type=type;

    }

    public void print(){
        System.out.println(memory);
        System.out.println(type);
        System.out.println(brandName);
    }
}

public class UseThisKeyword {
    public static void main(String[] args) {
        Exam exam1 = new Exam(12);
        exam1.print();

    }
}
