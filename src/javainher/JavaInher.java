package javainher;

class Animal {

    public void eat() {
        System.out.println("Aniamls intakes through mouth directly");
    }

    public void run() {
        System.out.println("All Animals can run");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("All Dogs can bark");
    }
}

class LabraDog extends Dog {

    public void fight() {
        System.out.println("Labrador can fight");
    }
}

class Cat extends Animal {

    public void bits() {
        System.out.println("Cats can bits");
    }
}

class Monkey extends Animal {

    @Override
    public void eat() {
        System.out.println("Monkey eat with hands");
    }

    public char jump(m) {
        System.out.println("Monkey can jump");
        return m;
    }
   
}

public class JavaInher {

    public static void main(String[] args) {
        Dog d = new Dog();
        Monkey m = new Monkey();
        d.eat();
        d.bark();
        d.run();
        m.eat();
        System.out.println("This is overriden" );

    }

}
