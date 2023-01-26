package CretionalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape1=new Circle();
        shape1.draw();
        Shape shape2=new Rectangle();
        shape2.draw();
        Shape shape3=new Square();
        shape3.draw();

        //*******************//
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape4=shapeFactory.getShape("daire");
        Shape shape5=shapeFactory.getShape("dikdörtgen");
        Shape shape6=shapeFactory.getShape("kare");

        shape4.draw();
        shape5.draw();
        shape6.draw();

    }
}
