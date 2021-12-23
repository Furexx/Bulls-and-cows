class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder str = new StringBuilder();
        for (char letter = 'A';letter <= 'Z';letter++) {
            str.append(letter);
            if (letter != 'Z') {
                str.append(" ");
            }
        }
        return str;
    }
}