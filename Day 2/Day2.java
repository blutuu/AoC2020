public void numValid(ArrayList<String> passwords) {
        String[] currentEntry, bounds;
        String currentPassword;
        char targetChar;
        int minOccurence, maxOccurence, count;
        int validCount = 0;
        Pattern pattern;
        Matcher matcher;

        for (int i = 0; i < passwords.size(); i++) {
            currentEntry = passwords.get(i).split(" ");
            bounds = currentEntry[0].split("-");
            currentPassword = currentEntry[2];
            targetChar = currentEntry[1].charAt(0);
            minOccurence = Integer.parseInt(bounds[0]);
            maxOccurence = Integer.parseInt(bounds[1]);
            count = 0;

            pattern = Pattern.compile(String.valueOf(targetChar));
            matcher = pattern.matcher(currentPassword);

            while (matcher.find()) {
                count++;
            }

            if (minOccurence <= count && count <= maxOccurence) {
                validCount++;
            }
            else {
                System.out.println(Arrays.toString(currentEntry));
            }
        }

        System.out.println(validCount + " valid passwords out of " + passwords.size());

    }