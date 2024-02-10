public class Duck extends Animal{
    private String name;


    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public String sound(){
        return "quack quack";
    }
}
