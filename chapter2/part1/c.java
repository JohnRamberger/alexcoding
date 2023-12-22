package chapter2.part1;


public class c {
  public static void main(String[] args) {
    Person1 richard = new Person1("Richard", 6.1, 100, "brown", 18, false);
    Person1 alex = new Person1("alex", 6.1, 100, "brown", 18, true);

    Gorilla albert = new Gorilla("albert", 5, 200, 30);
    Whale Gorlock = new Whale("Gorlock", 10, 4000, 5, 30);
    Dolphin Finley = new Dolphin("Finley", 4, 400, 3, 1, true);
    // richard.birthday();
    // albert.birthday();
    // Gorlock.birthday();
    // Finley.birthday();

    // System.out.println(richard);
    // System.out.println(alex);
    // System.out.println(albert);
    // System.out.println(Gorlock);
    // System.out.println(Finley);

    // richard.makeNoise();
    // albert.makeNoise();

    // Mammal jeremy = new Mammal("jeremy", 5.1, 80, 17, false);

    Mammal finley2 = new Dolphin("Finley", 4, 400, 3, 1, true);

    Mammal[] mammals = {richard, alex, albert, Gorlock, Finley, finley2};

    for (int i = 0; i < mammals.length; i ++) {
      mammals[i].makeNoise();
    }

  }
}

// states and behaviors || Variable = state || Behavior = action
class Person1 extends Mammal {
  String eyecolor;
  
  Person1(String name, double height, double weight, String eyecolor, int age, boolean swims) {
    super(name, height, weight, age, swims);
    this.eyecolor = eyecolor;
  }

  public void makeNoise() {
    System.out.println("what up bruh");
  }
}

class Gorilla extends Mammal {
  Gorilla(String name, double height, double weight, int age) {
    super(name, height, weight, age, false);
  }

  public void makeNoise() {
    System.out.println("oo oo ah ah");
  }
}

class Whale extends Mammal {
  int length;
  Whale(String name, double height, double weight, int age, int length) {
    super(name, height, weight, age, true); 
    this.length = length;
  }

  public void makeNoise() {
    System.out.println("wub");
  }
}



class Dolphin extends Mammal {
  int fin;
  Boolean married;
  Dolphin(String name, double height, double weight, int age, int fin, Boolean married){
    super(name, height, weight, age,true); //needs to be same as mammal
    this.fin = fin;
    this.married = married;
  }

  public String toString() {
    return super.toString() + ", " + fin + ", " + married; 
  }

  public void birthday() {
    age = age + 1;
    super.birthday();
  }
  
  public void makeNoise() {
    System.out.println("riii");
  }
}

abstract class Mammal implements makesNoise {
  String name;
  double height;
  double weight;
  int age;
  boolean swims;
  
  Mammal(String name, double height, double weight, int age, boolean swims) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.age = age;
    this.swims = swims;
  }

  public void birthday() {
    age = age + 1;
    System.out.println("Happy birthday " + name + " you are now " + age + " years old!");
  }

  public String toString() {
    return "(" + name + ", " + height+ ")";
  }
}

interface makesNoise {
  int volume = 10;
  void makeNoise();
}
