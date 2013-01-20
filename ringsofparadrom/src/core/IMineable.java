package core;


import core.Ship;

/**
 *
 * @author danieljones
 */
public interface IMineable {
    public int mine() throws IllegalMoveException;
    public int mineYield();
}
