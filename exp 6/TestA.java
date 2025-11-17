class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}


interface Pet {
    void play();
}

interface Wild {
    void hunt();
}
class Dog extends Animal implements Pet, Wild {
    public void play() {
        System.out.println("Dog loves to play with humans.");
    }

    public void hunt() {
        System.out.println("Dog can also hunt when trained.");
    }
}

public class TestA {
    public static void main(String[] args) {
        System.out.print(" Prithviraj 24csu345");
        Dog d = new Dog();
        d.eat();   
        d.play();  
        d.hunt(); 
    }
}

