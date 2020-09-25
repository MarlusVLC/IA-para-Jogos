package States;

import Communication.Message;

public interface State <NPC> {

    public void enter(NPC npc);

    public void execute(NPC npc);

    public void exit(NPC npc);

    boolean onMessage(NPC npc, Message msg);
}
