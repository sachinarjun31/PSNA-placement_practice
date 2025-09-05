 class Animal{
    int legs=4;
    void eating(){
        System.out.println("All the animals can eat");
    }
}
class Dog extends Animal{
    int legs=4;
    String Breed;

    void bark(){
        System.out.println("Dog Barking");
    }
}

class cat extends Dog{
    int legs=4;
    String name;

    void meow(){
        System.out.println("Meowing");
    }
}

public class inheritence {
    public static void main(String[] args) {
        cat obj=new cat();
        System.out.println(obj.legs);
        
        obj.eating();
        obj.meow();
        obj.bark();
    }    
}
