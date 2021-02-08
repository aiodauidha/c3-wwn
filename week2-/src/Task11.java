class Link{
    private class Node{
        private Pet data;
        private Node next;
        public Node(Pet data) {
            this.data = data;
        }

        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            }
            else {
                next.addNode(newNode);
            }
        }

        public void removeNode(Node previous, Pet data) {
            if (data.equals(this.data)) {
                previous.next = this.next;
            } else {
                this.next.removeNode(this, data);
            }
        }
    }
    private Node root;
    public int count = 0;
    private String[] retArray;

    public String[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.root = 0;
        this.retArray = new String[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }

    public void add(Pet data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            root.addNode(newNode);
        }
        count++;
    }

    public void remove(Pet data) {
        if (data.equals(this.root.data)) {
            this.root = this.root.next;
        } else {
            this.root.next.removeNode(this.root, data);
        }
        count--;
    }
}

interface Pet{

    public String getName();

    public int getAge();
}

class PetShop{
    private Link pets = new Link();

    public void add(Pet pet) {
        pets.add(pet);
    }

    public void delete(Pet pet) {
        pets.remove(pet);
    }

    public Link search(String keyWord) {
        Link result = new Link();
        Object[] obj = this.pets.toArray();
        for (int x = 0; x < obj.length; x++) {
            Pet p = (Pet) obj[x];
            if (p.getName().contains(keyWord)) {
                result.add(p);
            }
        }
        return result;
    }
}

class Cat implements Pet{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat c = (Cat) obj;
        if (this.name.equals(c.name) && this.age == c.age) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String toString() {
        return "猫的名字:" + this.name + ",年龄:" + this.age;
    }
}

class Dog implements Pet{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Dog d = (Dog) obj;
        if (this.name.equals(d.name) && this.age == d.age) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String toString() {
        return "狗的名字:" + this.name + ",年龄:" + this.age;
    }
}
public class Task11 {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.add(new Cat("波斯猫", 1));
        shop.add(new Cat("暹罗猫", 2));
        shop.add(new Cat("波米拉猫", 1));
        shop.add(new Dog("松狮", 1));
        shop.add(new Dog("波尔多", 2));
        shop.delete(new Cat("波米拉猫", 9));
        Link all = shop.search("波");
        Object[] obj = all.toArray();
        for (int x = 0; x < obj.length; x++) {
            System.out.println(obj[x]);
        }
    }
}
