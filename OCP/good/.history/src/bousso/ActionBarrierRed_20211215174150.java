package src.bousso;

public class ActionBarrierRed implements ActionBarrier{

    @Override
    public String raiseBarrier(Light li) {
        // TODO Auto-generated method stub
        li.setMb(this);
        return "up";
    }
    
}
