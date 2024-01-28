package animal;

class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");

    }
}