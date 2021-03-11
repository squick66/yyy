public class Pies extends Animal {

    public Pies(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public double getAge() {
        return age;
    }

    @Override
    public String getString() {
        return name;
    }


}
