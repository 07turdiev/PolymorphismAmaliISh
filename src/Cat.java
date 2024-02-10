public class Cat extends Animal{
    private String name;


    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public String sound(){
        return "meow meow";
    }
}
