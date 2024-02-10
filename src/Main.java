public class Main {
    public static void main(String[] args) {
        GeometricFigure uchburchak = new Triangle(5,6,3);

        GeometricFigure trapetsiya = new Trapezium(4,8,6);

        GeometricFigure turtburchak = new Rectangle(4,8);


        System.out.println("uchburchakning yuzi: " + uchburchak.area());
        System.out.println("uchburchakning perimetri: " + uchburchak.perimeter());
        System.out.println();


        System.out.println("trapetsiya yuzi: " + trapetsiya.area());
        System.out.println("trapetsiya perimetri: " + trapetsiya.perimeter());
        System.out.println();

        System.out.println("turtburchak yuzi: " + turtburchak.area());
        System.out.println("turtburchak perimetri: " + turtburchak.perimeter());
        System.out.println();



        /////////////////////////////////////////////////////////////////////////////////////////


        Animal dog = new Dog("it");
        Animal duck = new Duck("urdak");
        Animal cat = new Cat("mushuk");


        System.out.println(dog.getName()+ " ning ovozi: " + dog.sound());
        System.out.println(duck.getName()+ " ning ovozi: " + duck.sound());
        System.out.println(cat.getName()+ " ning ovozi: " + cat.sound());
    }
}