import java.util.HashMap;

public class main {

    public static void main(String[] args){

        HashMap<String, Farmer> farmers = new HashMap();
        farmers.put("Bob", new Farmer(EnterMineAndDigForNugget.getInstance()));
        farmers.put("Billy", new Farmer(LookAtTheWeather.getInstance()));

        while (true){
            for (Farmer farmer : farmers.values()){
                farmer.ExecuteState();
            }
        }



//        Farmer bob = new Farmer(EnterMineAndDigForNugget.getInstance())
//        Farmer billy = new Farmer(LookAtTheWeather.getInstance());
//        while (true){
//            bob.ExecuteState();
//            billy.ExecuteState();
//        }

    }
}
