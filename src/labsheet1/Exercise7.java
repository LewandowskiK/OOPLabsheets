package labsheet1;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        String sentences[] = new String[3];
        int counter =0, totalWords=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Please enter piece of text "+(counter+1) +": ");
            sentences[counter] = input.nextLine();
            System.out.println("\n\n\t\t******Text Data******\n\n" +
                    "Number of characters: " + sentences[counter].length() +
                    "\nNumber of lowercase vowels: " + getLowercaseVowels(sentences[counter]) +
                    "\nNumber of words: "+getAmountWords(sentences[counter]) +
                    "\nNumber of times \"ed\" appeared: " + countED(sentences[counter]) +
                    "\n\n");

            totalWords+=getAmountWords(sentences[counter]);
            counter++;
        }while(counter < sentences.length);

        System.out.println("******Overall Results******\n\n" +
                "Shortest piece of text: " + getShortest(sentences) +
                "\nAverage number of words: " + totalWords/sentences.length);
    }
    private static int getLowercaseVowels(String a)
    {
        int amountLowercase = 0;

        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i) == 'a' ||a.charAt(i) == 'e' ||
                    a.charAt(i) == 'i' ||a.charAt(i) == 'o' ||a.charAt(i) == 'u')
                amountLowercase++;
        }

        return amountLowercase;
    }
    private static int getAmountWords(String a){
        int amountWords = 0;

        for(int i=0; i < a.length(); i++)
        {
            if(a.charAt(i) == ' ' || (a.charAt(i) == ',' && a.charAt(i+1) == ' ') || i==a.length()-1)
            {
                if((a.charAt(i) == ',' && a.charAt(i+1) == ' '))
                    i++;
                amountWords++;
            }
        }

        return amountWords;
    }

    private static int countED(String a)
    {
        int edCount = 0;

        for(int i = 0; i < a.length()-1; i++)
        {
            if(a.charAt(i) == 'e' && a.charAt(i+1) == 'd')
            {
                i++;
                edCount++;
            }
        }

        return  edCount;
    }
    private static String getShortest(String a[])
    {
        int arrayNo = 0, wordLength = 0, shortestWordLength = 500;
        String shortestWord = "";

        do{
            String sentence = a[arrayNo];

            for(int i = 0; i < sentence.length(); i++)
            {
                if(i==0)
                    wordLength = 0;
                if(i == sentence.length() - 1 && Character.isLetter(sentence.charAt(i)))
                {
                    wordLength++;
                    if(wordLength <= shortestWordLength)
                    {
                        if(wordLength == shortestWordLength)
                            shortestWord += ", " + sentence.substring(i-wordLength+1,i+1);
                        else
                        {
                            shortestWord = sentence.substring(i-wordLength+1,i+1);
                            shortestWordLength = wordLength;
                        }
                    }
                }
                else if(Character.isLetter(sentence.charAt(i)))
                    wordLength++;
                else
                {
                    if(sentence.charAt(i)=='\'')
                        wordLength++;
                    else if(wordLength <= shortestWordLength)
                    {
                        if(wordLength == shortestWordLength)
                            shortestWord += ", " + sentence.substring(i-wordLength,i+1);
                        else
                        {
                            shortestWord = sentence.substring(i-wordLength,i+1);
                            shortestWordLength = wordLength;
                        }
                    }
                    wordLength = 0;
                }
            }
            arrayNo++;
        }while(arrayNo < a.length);

        return shortestWord;
    }
}