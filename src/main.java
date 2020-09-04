
public class main {

    public static void main(String[] args){

        Farmer bob = new Farmer(EnterMineAndDigForNugget.getInstance());
        Farmer billy = new Farmer(LookAtTheWeather.getInstance());
        while (true){
            bob.ExecuteState();
            billy.ExecuteState();
        }

    }
}
