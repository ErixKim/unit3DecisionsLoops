public class StringCompare
{
    public static void stringCompare()
    {
        String word1 = "catalog";
        String word2 = "cat";
        int compare = word1.compareTo(word2);
        int compareaaa = word1.compareTo("aaa");
        if (compareaaa > 0)
        {
            System.out.println("Word 1 is lexicographically greater than aaa");
        }
        else
        {
            System.out.println("Word 1 is not lexicographically greater than aaa");
        }
        
        if (compare == 0)
        {
            System.out.println("Word 1 is lexicographically equal to word 2");
        }
        else
        {
            System.out.println("Word 1 is not lexicographically equal to word 2");
        }
        
        if (compare < 0)
        {
            System.out.println("Word 1 is lexicographically less to word 2");
        }
        else
        {
            System.out.println("Word 1 is not lexicographically less to word 2");
        }
        
        if (word1.substring(0,2).equals(word2.substring(0,2)))
        {
            System.out.println("Word 1 and Word 2 have the same three letter prefix");
        }
        else
        {
            System.out.println("Word 1 and Word 2 dont have the same three letter prefix");
        }
    }
}