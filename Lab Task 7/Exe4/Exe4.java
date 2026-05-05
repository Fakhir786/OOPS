package exe4;
               
public class Exe4 {
    public static void main(String[] args) {
        Cat c = new Cat();           
        c.name = "Kitty";
        c.id = 1;
           
        Dog d = new Dog();
        d.name = "Tiger";
        d.id = 2;
        System.out.println("Cat Name: " + c.name);
        c.drink();           
        c.walk();

        System.out.println();

        System.out.println("Dog Name: " + d.name);
        d.eat();           
        d.bark();
    }           
}
