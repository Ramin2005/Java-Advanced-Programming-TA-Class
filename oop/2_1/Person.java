
public class Person {
    protected  final String name;
    private int age;

    Person(String name, int age){

        this.name = name;

        if (age < 1){
            throw new IllegalArgumentException("age must be greater than zero!");
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
