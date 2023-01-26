package CretionalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
       //SingletonObject obj1=new SingletonObject();
        // System.out.println(obj1.message);

       SingletonObject s1= SingletonObject.getInstance();
        System.out.println(s1.message);

        SingletonObject s2= SingletonObject.getInstance();
        s2.changeMessage();
        System.out.println(s2.message);

        SingletonObject s3= SingletonObject.getInstance();
        System.out.println(s3.message);


    }
}
