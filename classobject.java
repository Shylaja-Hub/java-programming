
class demo_one{
    public void start(){
        System.out.println("starting");
    }
    public void stop(){
        System.out.println("stoping");
    }
}
public class classobject {
    public static void main(String []args){
        demo_one obj = new demo_one();
        obj.start();
        obj.stop();
    }
    
}
