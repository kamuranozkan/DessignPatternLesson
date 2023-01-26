package CretionalDP.SingletonDP;

public class SingletonObject {
    String message="Merhaba";
    private static SingletonObject instance=new SingletonObject();

    private SingletonObject(){};

    public static SingletonObject getInstance(){
        return instance;
    }

    public void changeMessage(){
        this.message=this.message+" = Hello";
    }

}
