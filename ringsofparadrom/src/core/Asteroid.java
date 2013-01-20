package core;

/**
 *
 * @author danieljones
 */
class Asteroid implements IMineable {
    private int id;
    private int oreCount;
    private Ore oreType;
    private int mineYieldAmount;
    
    public Asteroid(int id, Ore oreType, int oreCount, int mineYieldAmount) {
        this.id = id;
        this.oreType = oreType;
        this.oreCount = oreCount;
        this.mineYieldAmount = mineYieldAmount;
    }

    @Override
    public int mine() throws IllegalMoveException {
        int value = 0; 
        try {
            if(this.oreCount - mineYieldAmount >= 0) {
                this.oreCount -= mineYieldAmount;
                value = 1;
            } else {
                throw (new IllegalMoveException("Mine Task Rejected: Asteroid is out of ore"));                
            }
        } catch (IllegalMoveException ime) {
            System.out.println(ime.getMessage());
        }
        return value;
    }
    
    @Override
    public int mineYield() {
        return this.mineYieldAmount;
    }    

    @Override
    public String toString() {
        return "Asteroid: " + this.id;
    } 

    public int getOreCount() {
        return oreCount;
    }

    public Ore getOreType() {
        return oreType;
    }

    public void setOreCount(int oreCount) {
        this.oreCount = oreCount;
    }
    
    
    
}
