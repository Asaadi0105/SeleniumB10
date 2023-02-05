public class JavaPracticeInterview {

    public static void main(String[] args) {


        String text1 = "I want to solve this question by mysElf this time";
        int letterCount = 0;
        int total = 0;
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == 'e' || text1.charAt(i) == 'E') {
                total++;
            }
            letterCount++;
        } //System.out.println(letterCount);
        System.out.println(total);

        String word = "1234*4921";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);

        String str = "Hello world";
        StringBuilder reversedWords = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i] + " ");
        }
        System.out.println(reversedWords.toString().trim());


        String word1 = "abba";
        String reverse1 = "";

        for (int i = word1.length() - 1; i >= 0; i--) {
            reverse1 += word1.charAt(i);
        }
        System.out.println(reverse1);
        if (word1.equals(reverse1)) {
            System.out.println("It is Palindrome: " + reverse1);
        } else {
            System.out.println("It is not Palindrome: " + reverse1);
        }

        int number = 0;
        String star = "";

        while (number < 10) {
            star = star + "*";
            System.out.println(star);
            number++;
        }

        int i =0;
        while (i<word1.length()){
        //for (int i = 0; i < word1.length(); i++) {
            System.out.print(word1.charAt(i)+",");
            i++;
        }
    }
}
