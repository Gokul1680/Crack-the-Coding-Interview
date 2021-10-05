package Chapter1;

import java.util.Scanner;

public class Permutation_2 {

    public boolean isEqual(String str1 , String str2){
        if(str1.length() != str2.length()) return false;
        int[] i = new int[128];
        char[] chars = str1.toCharArray();
        for (char c : chars){
            i[c]++;
        }
        for (int j = 0 ; j < str2.length() ; j++){
            int val = str2.charAt(j);
            i[val]--;
            if(i[val]<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1,str2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the strings:");
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        Permutation_2 p = new Permutation_2();
        System.out.println(p.isEqual(str1,str2));
    }

}
