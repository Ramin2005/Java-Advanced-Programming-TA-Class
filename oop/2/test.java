public class test {
    
    public static void main(){
        Person ps = new Person("p1", 1);
        Instructor in = new Instructor("in1", 40,100,80000);
        Student st = new Student("st1", 19, 1000);

        Person ps2 = new Student("st2", 19, 1001);

        System.out.println(ps2.getName());
    }
}
