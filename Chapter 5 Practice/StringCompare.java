public class StringCompare
{
    public static void main( String [] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        String aaa = "aaa";
        int i = word1.compareTo(word2);
        int e = word1.compareTo(aaa);
        if (e > 0){
            System.out.println("word 1 is greater than aaa");
        }
        
        else {
            System.out.println("word 1 is not greater than aaa");
        }
        if (i < 0){
            System.out.println("word 1 is less than word 2");
        }
        
        else if (i >0){
            System.out.println("word 1 is greater than word 2");
        }
        
        if(i == 0){
            System.out.println("word 1 is equal to word 2");
        }
        
        else{
            System.out.println("word 1 does not equal to word 2");
        }
        String word1prefix = word1.substring(0,3);
        String word2prefix = word2.substring(0,3);
        if (word1prefix.equals(word2prefix)){
            System.out.println("word 1 and word 2 have the same three letter prefix");
        }
    }
}
        