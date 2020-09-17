import java.util.Random;

public class Bob extends Farmer {

    public int nuggets, gold, fatigue, thirsty, dailyGold;



    public Bob() {

        nuggets = 0;
        gold = 0;
        fatigue = 0;
        thirsty = 0;
        dailyGold = 0;
        r = new Random();

        setEstadoAtual(EnterMineAndDigForNugget.getInstance());
        //estadoAtual = LookAtTheWeather.getInstance(); //Vai dar um erro porque é inacessível pelo Bob, somente pelo Billy
    }






    public void addGoldNugget(){
        nuggets++;
    }


    public void increaseFatigue(int n){
        fatigue += Math.abs(n);
    }

    public void increaseThirsty(int n){
        thirsty += Math.abs(n);
    }

    public void eraseThirsty(){ thirsty = 0; }

    public void rest(){ fatigue--; }

    public boolean pocketsFull() {
        if (nuggets >= 5) { return true; }
        return false;
    }

    public boolean isThirsty() {
        if (thirsty >= 8) { return true; }
        return false;
    }

    public boolean isRested(){
        if (fatigue <= 0){
            fatigue = 0;
            return true;
        }
        return false;
    }

    public boolean hasEnoughForTheDay(){
        if (dailyGold >= 200){ return true; }
        return false;
    }

    public void resetDailyGold(){
        dailyGold = 0;
    }

    public void depositAllGold(){
        dailyGold += nuggets*10;
        nuggets = 0;
        gold += dailyGold;
    }

    public int getGold(){
        return gold;
    }


}
