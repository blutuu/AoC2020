    public void treesInTrajectory(ArrayList<String> grid) {
        String currentLine;
        int currentLineLength;
        int rightValue = 0;
        int treeCount = 0;

        for (int i = 1; i < grid.size(); i++) {
            currentLine = grid.get(i);
            currentLineLength = grid.get(i).length();
            rightValue = (rightValue + 3) % currentLineLength;

            if (currentLine.charAt(rightValue) == '#') {
                treeCount++;
            }
        }

        System.out.println("Num trees: " + treeCount);
    }