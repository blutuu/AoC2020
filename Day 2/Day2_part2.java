public void numValid(ArrayList<String> passwords) {
        String[] currentEntry, positions;
        String currentPassword;
        char targetChar;
        int positionOne, positionTwo, count;
        int validCount = 0;

        for (int i = 0; i < passwords.size(); i++) {
            currentEntry = passwords.get(i).split(" ");
            positions = currentEntry[0].split("-");
            currentPassword = currentEntry[2];
            targetChar = currentEntry[1].charAt(0);
            positionOne = Integer.parseInt(positions[0]);
            positionTwo = Integer.parseInt(positions[1]);
            count = 0;


            if (currentPassword.charAt(positionOne - 1) == targetChar ^ currentPassword.charAt(positionTwo - 1) == targetChar) {
                validCount++;
            }
            else {
                System.out.println(Arrays.toString(currentEntry));
            }
        }

        System.out.println(validCount + " valid passwords out of " + passwords.size());

    }