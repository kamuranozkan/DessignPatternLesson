package CretionalDP.Abstract_FactoryDB;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("daire")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("dikdörtgen")) {
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("kare")){
            return new Rectangle();
        }
        return null;
    }
}
