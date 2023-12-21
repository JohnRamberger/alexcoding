package chapter2.part1;

/**
 * QUIZ
 * NOTE: For each class, make a constructor containing all of the properties in the order they are listed.
 * 
 * TODO: 1. Create a class called Lion with the following properties:
 * - name (String)
 * - gender (String)
 * - age (int)
 * - weight (double)
 * - height (double)
 * - hasMane (boolean)
 * 
 * TODO: 2. Create a class called Tiger with the following properties:
 * - name (String)
 * - gender (String)
 * - age (int)
 * - numberOfStripes (int)
 * - weight (double)
 * - height (double)
 * 
 * TODO: 3. Create a class called Bear with the following properties:
 * - name (String)
 * - gender (String)
 * - furColor (String)
 * - age (int)
 * - weight (double)
 * - height (double)
 * - clawLength (double)
 * 
 * TODO: 4. Create a method called roar() in each class that prints "ROAR!"
 * 
 * TODO: 5. Create a method called hunt() in each class that prints "Hunting..."
 * 
 * TODO: 6. Create a method called doLionThings() in the Lion class that prints "Doing lion things..."
 * 
 * TODO: 7. Create a method called doTigerThings() in the Tiger class that prints "Doing tiger things..."
 * 
 * TODO: 8. Create a method called doBearThings() in the Bear class that prints "Doing bear things..."
 * 
 * CHECKPOINT: 9. Run the main method and make sure all tests pass.
 * 
 * TODO: 10. Create a new class that each of the animals can inherit from called Animal.
 * 
 * TODO: 11. Move the properties and methods that are common to all animals into the Animal class.
 * 
 * TODO: 12. Make sure the Animal class is abstract.
 * 
 * CHECKPOINT: 13. Run the main method and make sure all tests pass.
 */

class Lion {

}

class Tiger {

}

class Bear {

}

class Animal {

}

public class quiz {
  public static void main(String[] args) {
    int failed = 0;

    failed += testLion();
    failed += testTiger();
    failed += testBear();

    print("--------");
    print("-Report-");
    print("--------");

    if (failed == 0) {
      print("All tests passed!");
    } else {
      print("Failed " + failed + " tests.");
    }
  }

  static int testLion() {
    int failed = 0;
    Lion l1 = new Lion("lion1", "male", 37, 170.1,  3.6, true);

    if (!l1.name.equals("lion1")) {
      print("failed testLion name");
      print("expected: lion1");
      print("actual: " + l1.name);

      failed++;
    } 

    if (!l1.gender.equals("male")) {
      print("failed testLion gender");
      print("expected: male");
      print("actual: " + l1.gender);

      failed++;
    }

    if (l1.age != 37) {
      print("failed testLion age");
      print("expected: 37");
      print("actual: " + l1.age);

      failed++;
    }

    if (l1.weight != 170.1) {
      print("failed testLion weight");
      print("expected: 170.1");
      print("actual: " + l1.weight);

      failed++;
    }

    if (l1.height != 3.6) {
      print("failed testLion height");
      print("expected: 3.6");
      print("actual: " + l1.height);

      failed++;
    }

    if (!l1.hasMane) {
      print("failed testLion hasMane");
      print("expected: true");
      print("actual: " + l1.hasMane);

      failed++;
    }

    l1.roar();
    l1.hunt();
    l1.doLionThings();

    return failed;
  }

  static int testTiger() {
    int failed = 0;
    Tiger t1 = new Tiger("tiger1", "female", 18, 26, 106.8, 2.9);

    if (!t1.name.equals("tiger1")) {
      print("failed testTiger name");
      print("expected: tiger1");
      print("actual: " + t1.name);

      failed++;
    }

    if (!t1.gender.equals("female")) {
      print("failed testTiger gender");
      print("expected: female");
      print("actual: " + t1.gender);

      failed++;
    }

    if (t1.age != 18) {
      print("failed testTiger age");
      print("expected: 18");
      print("actual: " + t1.age);

      failed++;
    }

    if (t1.numberOfStripes != 26) {
      print("failed testTiger numberOfStripes");
      print("expected: 26");
      print("actual: " + t1.numberOfStripes);

      failed++;
    }

    if (t1.weight != 106.8) {
      print("failed testTiger weight");
      print("expected: 106.8");
      print("actual: " + t1.weight);

      failed++;
    }

    if (t1.height != 2.9) {
      print("failed testTiger height");
      print("expected: 2.9");
      print("actual: " + t1.height);

      failed++;
    }

    t1.roar();
    t1.hunt();
    t1.doTigerThings();

    return failed;
  }

  static int testBear() {
    int failed = 0;
    Bear b1 = new Bear("bear1", "non-binary", "white", 22, 214.5, 6.56, 3.4);

    if (!b1.name.equals("bear1")) {
      print("failed testBear name");
      print("expected: bear1");
      print("actual: " + b1.name);

      failed++;
    }

    if (!b1.gender.equals("non-binary")) {
      print("failed testBear gender");
      print("expected: non-binary");
      print("actual: " + b1.gender);

      failed++;
    }

    if (!b1.furColor.equals("white")) {
      print("failed testBear furColor");
      print("expected: white");
      print("actual: " + b1.furColor);

      failed++;
    }

    if (b1.age != 22) {
      print("failed testBear age");
      print("expected: 22");
      print("actual: " + b1.age);

      failed++;
    }

    if (b1.weight != 214.5) {
      print("failed testBear weight");
      print("expected: 214.5");
      print("actual: " + b1.weight);

      failed++;
    }

    if (b1.height != 6.56) {
      print("failed testBear height");
      print("expected: 6.56");
      print("actual: " + b1.height);

      failed++;
    }

    if (b1.clawLength != 3.4) {
      print("failed testBear clawLength");
      print("expected: 3.4");
      print("actual: " + b1.clawLength);

      failed++;
    }

    b1.roar();
    b1.hunt();
    b1.doBearThings();

    return failed;
  }


  static void print(String s) {
    System.out.println(s);
  }
}