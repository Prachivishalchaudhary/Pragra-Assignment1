package july15;
class car{
    private String name;
    private String engineBrand;
    public car(String name,String engineBrand){
        this.name=name;
        this.engineBrand=engineBrand;

    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", engineBrand='" + engineBrand + '\'' +
                '}';
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        System.out.println(new car("kia", "engine1"));


    }
}
