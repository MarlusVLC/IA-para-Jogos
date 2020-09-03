public class VisitBankAndDepositGold implements State {
    @Override
    public void enter(FarmerBob bob) {

    }

    @Override
    public void execute(FarmerBob bob) {
        System.out.println("Been lucky today! Gotta deposit the goods!");
        bob.depositAllGold();
        if (bob.hasEnoughForTheDay()){
            System.out.println("I've gathered " + bob.getGold() + " gold coins");
            System.out.print("Worked good. Gotta rest a bit");
            bob.resetDailyGold();
            bob.changeStates(new GoHomeAndSleepTilRested());
        }
        else{
            System.out.println("Need more. Gotta work harder!");
            bob.changeStates(new EnterMineAndDigForNugget());
        }
    }

    @Override
    public void exit(FarmerBob bob) {

    }
}
