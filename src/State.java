public interface State <NPC> {

    public void enter(NPC farmer);

    public void execute(NPC farmer);

    public void exit(NPC farmer);
}
