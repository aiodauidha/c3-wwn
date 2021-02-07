abstract class A{
    private int numa = 10;
    public abstract void showA();

    public int getNuma() {
        return numa;
    }
}

abstract class B extends A{
    private  int numb = 20;
    public abstract void showB();

    public int getNumb() {
        return numb;
    }
}


class C extends B{
    private int numc = 30;

    public int getNumc() {
        return numc;
    }

    @Override
    public void showA() {
        System.out.println("A类中numa：" + getNuma());
    }

    @Override
    public void showB() {
        System.out.println("B类中numb；" + getNumb());
    }

    public void showC() {
        System.out.println("C类中numc：" + getNumc());
    }

}
public class Task8 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
