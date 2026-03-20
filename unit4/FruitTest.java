//write a java program to create base class fruit which has name,taste and size as its attributes an method called eat() which describe name and its taste  inherit the same  in two other class apple and orange and override the eat() method to represent each fruit taste.
class fruit {
    String name;
    String taste;
    int size;

    fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("fruit." + name + "|taste:" + taste);
    }
}

class Apple extends fruit {
    Apple() {
        super("Apple", "Sweet", 6);

    }

    void eat() {
        System.out.println("fruit:Apple | taste:sweet and crispy");
    }
}

class orange extends fruit {
    orange() {
        super("orage", "sour", 5);
    }

    void eat() {
        System.out.println("fruit:orange|taste:Tangy and juicy");
    }
}

public class FruitTest {
    public static void main(String args[]) {
        fruit obj1 = new Apple();
        fruit obj2 = new orange();
        obj1.eat();
        obj2.eat();
    }

}
