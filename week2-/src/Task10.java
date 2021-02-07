import java.util.ArrayList;

interface USB{
    void turnOn();
    void turnOff();
}

class Mouse implements USB{
    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}

class KeyBoard implements USB{
    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}

class Microphone implements USB{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}

class Computer{
    private ArrayList<USB> usbs = new ArrayList<USB>();//这里我认为用ArrayList更好，方便以后加入新的

    public void add(USB usb) {
        usbs.add(usb);
    }

    public void powerOn() {
        for ( USB usb : usbs ) {
            usb.turnOn();
        }
        System.out.println("电脑开机成功");
    }

    public void powerOff() {
        for ( USB usb : usbs ) {
            usb.turnOff();
        }
        System.out.println("电脑关机成功");
    }
}
public class Task10 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.add(new Mouse());
        computer.add(new KeyBoard());
        computer.add(new Microphone());
        computer.powerOn();
        System.out.println("----------");
        computer.powerOff();
    }
}
