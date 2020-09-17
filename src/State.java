public interface State <Farmer> {

    public void enter(Farmer farmer);

    public void execute(Farmer farmer);

    public void exit(Farmer farmer);
}
