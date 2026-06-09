public class Instructor extends Person {
    private long salary;
    private final int id;
    
    public Instructor(String name, int age,
         int id, long salary){

        super(name, age);
        
        if(id < 1){
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getName(){
        return "Instructor name: " + super.name;
    }
    
}