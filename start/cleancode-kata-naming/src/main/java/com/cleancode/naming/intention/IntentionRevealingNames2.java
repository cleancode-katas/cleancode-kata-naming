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
}
