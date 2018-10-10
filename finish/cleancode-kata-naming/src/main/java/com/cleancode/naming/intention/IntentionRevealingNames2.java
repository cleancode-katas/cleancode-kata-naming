package com.cleancode.naming.intention;

import java.util.ArrayList;
import java.util.List;

public class IntentionRevealingNames2 {

    private List<int[]> theList;

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    private static final int FLAGGED = 4;
    private static final int STATUS_VALUE = 0;
    private List<int[]> gameBoard;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
