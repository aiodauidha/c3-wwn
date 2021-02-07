public class Task8 {
    public static void main(String[] args) {
        //测试
        Rabbit rabbit=new Rabbit();
        Tiger tiger=new Tiger();
        rabbit.eat();
        rabbit.sleep();
        tiger.eat();
        tiger.sleep();
    }
}
//父类
class Animal{
    private double height; //身高
    private double weight; //体重
    public void eat(){
        System.out.println("eat...");
    }
    public void sleep(){
        System.out.println("sleep...");
    }
}
//子类
class Rabbit extends Animal{

    public void eat() {
        System.out.println("rabbits eat grass");
    }

    public void sleep() {
        super.sleep();
    }
}
class Tiger extends Animal{
    public void eat() {
        System.out.println("Tigers eat meat");
    }
    public void sleep() {
        super.sleep();
    }
}