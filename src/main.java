import Entidades.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.lang.Math.round;

public class main {

    static float sec = 2;

    public static void main(String[] args) throws InterruptedException{

        Bob bob = new Bob();
        Billy billy = new Billy();
        while (true){
            Iterator it = EntityManager.getInstance().getMap().entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<String, Entity> entry = (Map.Entry)it.next();
                Entity e = entry.getValue();
                e.update();
                Thread.sleep(1000 * round(sec));
                System.out.println("");
            }
        }

    }
}
