package MultilevelInheritance;

public class GrandVitara extends Suzuki{

    String k;

    GrandVitara()
    {
        System.out.println("Im in Grand Vitara Construtor");
    }

    GrandVitara(String i, String j, String k){
        super(i,j);
        this.k=k;
      System.out.println("Im in p con of grand V" + i + j + k);
    }
    void carname()
    {
        System.out.println("Car is grand Vitara" + super.i +  super.j + this.k);
    }
}
