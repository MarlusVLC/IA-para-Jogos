import java.util.Random;

public class Billy extends Farmer {




    public Billy() {

        r = new Random();
        setEstadoAtual(LookAtTheWeather.getInstance());

    }




    //BILLY
    public boolean wantsToDoNothing(){
        if (r.nextDouble() <= 0.25){
            return true;
        }
        return false;
    }

    public boolean wantsToWalk(){
        if (r.nextDouble() <= 0.75){
            return true;
        }
        return false;
    }


}
