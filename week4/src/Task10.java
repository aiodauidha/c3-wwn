public class Task10 {
    public static void main(String[] args) {
        Object obj = new Object();
        Runnable A = new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 6; i++) {
                        System.out.println("线程A打印：" + 2 * i);
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        obj.notify();
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Runnable B = new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("线程B打印：" + (2 * i + 1));
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        obj.notify();
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        new Thread(A).start();
        new Thread(B).start();
    }
}
