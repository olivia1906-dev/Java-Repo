class Day_24 {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = 0;
            char ch = s.charAt(i);

            // Convert Roman symbol to number
            if (ch == 'I') current = 1;
            else if (ch == 'V') current = 5;
            else if (ch == 'X') current = 10;
            else if (ch == 'L') current = 50;
            else if (ch == 'C') current = 100;
            else if (ch == 'D') current = 500;
            else if (ch == 'M') current = 1000;

            // Check next character if it exists
            if (i < s.length() - 1) {
                int next = 0;
                char nextCh = s.charAt(i + 1);

                if (nextCh == 'I') next = 1;
                else if (nextCh == 'V') next = 5;
                else if (nextCh == 'X') next = 10;
                else if (nextCh == 'L') next = 50;
                else if (nextCh == 'C') next = 100;
                else if (nextCh == 'D') next = 500;
                else if (nextCh == 'M') next = 1000;

                // If next value is bigger → subtract
                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }

            } else {
                // Last character → just add
                total += current;
            }
        }

        return total;
    }
}
