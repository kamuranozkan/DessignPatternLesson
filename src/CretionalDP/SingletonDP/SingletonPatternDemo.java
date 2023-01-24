package CretionalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
       // SingletonObject obj1 = new SingletonObject();
        SingletonObject obj2=SingletonObject.getInstance();
        System.out.println(obj2.message);
        obj2.changeMessage();
        
        SingletonObject obj3=SingletonObject.getInstance();
        System.out.println("obj3.message = " + obj3.message);

        SingletonObject obj4=SingletonObject.getInstance();
        System.out.println(obj4.message);



    }
}
