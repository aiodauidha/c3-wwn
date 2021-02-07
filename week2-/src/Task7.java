abstract class Poultry{
    private String name;
    private String symptom;
    private String age;
    private String illness;

    public Poultry() {}

    public Poultry(String name, String symptom, String age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public abstract void showSymptom();

    public void showMsg() {
        System.out.println("动物种类：" + getName() + ",年龄：" + getAge() + "\n" + "入院原因:" + getIllness());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}

class Duck extends Poultry{
    public Duck() {
    }

    public Duck(String name, String symptom, String age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状为：" + getSymptom());
    }
}

public class Task7 {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧", "2岁","感冒");
        duck.showMsg();
        duck.showSymptom();
    }
}
