import java.util.HashMap;

public class main {

    public static void main(String[] args){

//        HashMap<String, Farmer> farmers = new HashMap();
//        farmers.put("Bob", new Bob());
//        farmers.put("Billy", new Billy(LookAtTheWeather.getInstance()));
//
//        while (true){
//            for (Farmer farmer : farmers.values()){
//                farmer.ExecuteState();
//            }
//        }



        Bob bob = new Bob();
        Billy billy = new Billy();
        while (true){
            bob.ExecuteState();
            billy.ExecuteState();
        }

    }
}
