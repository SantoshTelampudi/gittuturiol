package MultilevelInheritance;

public class Suzuki extends Car {

    String j;

    Suzuki() {
        System.out.println("Im in Suzuki Constructor");
    }

    Suzuki(String j) {
        this.j = j;
        System.out.println("im on P con of suzuki");
    }

    Suzuki(String i, String j) {
        super(i);
        this.j = j;
        System.out.println(("Im in P con of suzuki and car" + i + j));

    }

    void Suzukii() {
        System.out.println("Im a company called Suzuki"+ i + j);
    }
}
