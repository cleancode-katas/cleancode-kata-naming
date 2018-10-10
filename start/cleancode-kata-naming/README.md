# Clean Code Kata - PrimePrinter

Code used to demonstrate in a workshop how clean code principles can be
applied to existing legacy code.

## Package - intention

Observe

- IntentionRevealingNames1 has variable d
- useless comment but name is bad

Activity

- change the name to elapsedTimeInDays
- remove the comment

Observe

- IntentionRevealingNames2 has lot of terse names
- Change the code to following
    ```java
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
    ```

## Package - disinformation

## Package - distintions

## Package - pronounceable

## Package - searchable

## Package - classnames

## Package - context
