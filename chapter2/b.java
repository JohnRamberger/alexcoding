package chapter2;

public class b {
  public static void main(String[] args) {
    Crab mrkrabs = new Crab("mr.krabs","greedy");
    System.out.println(mrkrabs.legs);

    Crab steven = new Crab("steven", "outgoing");
    System.out.println(steven.legs);

    Spider charlotte = new Spider("charlotte", "timid", 16);

    System.out.println(charlotte.legs);

    // mrkrabs.spinWeb();

    // charlotte.spinWeb();
    // MultiLeggedCreature creature = new MultiLeggedCreature(12, "Crab", "evil", 6);
  }
}

class Crab extends MultiLeggedCreature{
  public Crab(String name, String personality) {
    super(12, name, personality, 2);
  }
}

class Spider extends MultiLeggedCreature {
  public Spider(String name, String personality, int eyeNumber) {
    super(8, name, personality, eyeNumber);
  }
}

class MultiLeggedCreature {
  int legs;
  String name;
  String personality;
  int eyeNumber;

  public MultiLeggedCreature(int legs, String name, String personality, int eyeNumber) {
    this.legs = legs;
    this.name = name;
    this.personality = personality;
    this.eyeNumber = eyeNumber;
  }

  public void skuttle() {
    System.out.println("*skuttles across the ground*");
  }
}
