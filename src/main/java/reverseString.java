import java.util.Arrays;

public class reverseString {


    public static void main(String[] args) {
        String str = "Adam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

//        String str1 = "Adam";
        StringBuilder stringBuilder = new StringBuilder("Adam");
        System.out.println(stringBuilder.reverse());

        // second way for StringBuilder
        String str1 = "Adam";
        StringBuilder str2 = new StringBuilder();
        str2.append(str1);
        System.out.println(str2.reverse());

        String str3 = "Adam";

        char[] try1 = str3.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }

        StringBuffer str4 = new StringBuffer(str3);
        System.out.println(str4.reverse());

        int[] list = {1, 4, 8, 4, 8, 34, 56};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int smallestNum = list[0];
        System.out.println(smallestNum);

        int largestNum = list[list.length-1];
        System.out.println(largestNum);
        System.out.println(getSmallestNum());


        String name = "adam";
        char[] ch = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    break;
                }
            }
        }

        String str5 = "beautiful beach";
        char[] carry = str5.toCharArray();
        System.out.println("The string is:" + str5);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str5.length(); i++) {
            for (int j = i + 1; j < str5.length(); j++) {
                if (carry[i] == carry[j]) {
                    System.out.print(carry[j] + " ");
                    break;
                }
            }
        }
        getSmallestNum();
    }


    public static int getSmallestNum() {

        int[] list = {7, 4, 8, 4, 8, 34, 56};
        //int smallestNum = 0;
        int num = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            //for (j = i + 1; j < list.length; j++) {
            if (num > list[i]) {
                num = list[i];
                System.out.println(num);
            }
        }

        return num;
    }

//    public static char getDuplicates() {
//        String name = "adam";
//        char[] ch = name.toCharArray();
//        int i;
//        int j;
//        for (i = 0; i < name.length(); i++) {
//            for (j = i + 1; j < name.length(); j++) {
//                if (ch[i] == ch[j]) {
//                    System.out.println(ch[j]);
//                    break;
//                }
//            }
//        }return ch[j];
//    }
}




