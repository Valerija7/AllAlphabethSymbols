/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allalphabethsymbols;

public class AllAlphabethSymbols {

    public static void main(String[] args) {
        String phrase = "jackdaws love my big sphinx of quartz";
        
        int counter = 0;
        
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < phrase.length(); j++) {
                if (alphabet[i] == phrase.charAt(j)) {
                    counter++;
                    break;
                }
            }
        }

        if (counter == 26) {
            System.out.println("является панграммой");
        }else{
            System.out.println("не является панграммой");
        }
    }
}
