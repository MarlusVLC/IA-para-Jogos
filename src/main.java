import java.util.HashMap;

public class main {

    public static void main(String[] args){

        Bob bob = new Bob();
        Billy billy = new Billy();
        while (true){
            bob.getStateMachine().update();
            billy.getStateMachine().update();
        }

    }
}
