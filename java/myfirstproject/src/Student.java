public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("penisbreath");
        System.out.println("The student who got an A in all his classes is" + s.getName());
    }
}
class Mammal {

}
class Aardvark extends Mammal {

}
class Person {
    void walk(){
        System.out.println("Can Run...");
    }
}
class Employee extends Person {
    void walk(){
        System.out.println("Run Faster...");
    }
    public static void main(String arg[]){
        Person p = new Employee();
        p.walk();
    }
    

}
