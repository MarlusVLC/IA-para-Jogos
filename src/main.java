import java.util.HashMap;

public class main {

    public static void main(String[] args) throws InterruptedException{

        Bob bob = new Bob();
        Billy billy = new Billy();
        while (true){
            bob.getStateMachine().update();
            Thread.sleep(1000);
            System.out.println();
            billy.getStateMachine().update();
            System.out.println();
        }

    }
}
