public interface State {

    public void enter(FarmerBob bob);

    public void execute (FarmerBob bob);

    public void exit (FarmerBob bob);
}
