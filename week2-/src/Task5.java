class Monkey{
    public Monkey(String s) {}

    public void speak() {
        System.out.println("咿咿呀呀......");
    }
}

class People extends Monkey{

    public People(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }

    public void think() {
        System.out.println("别说话，认真思考！");
    }
}
public class Task5 {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey("monkey1");
        People people1 = new People("people1");
        monkey1.speak();
        people1.speak();
        people1.think();
    }
}

