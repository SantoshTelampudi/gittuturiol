package MultilevelInheritance;

public class Car {
 String i;
    Car(){
        System.out.println("Im in car constructor");
    }

    Car(String i){
        this.i=i;
        System.out.println(("Im in parameter construcot of car"));
    }
    void tyre(){
        System.out.println("4 Wheels" + i);
    }
}
