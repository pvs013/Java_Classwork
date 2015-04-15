
public class Word2Tester
{
    public static void main(String[] args)
    {
        String tw1 = "car";
        Word2 bigone = new Word2(tw1);
        
        
        System.out.println("Actual: " + bigone.getSubstrings());
        System.out.println("Expected: ?" );
        
        String tw2 = "basketball";
        Word2 bball = new Word2(tw2);
        
        
        System.out.println("Actual: " + bball.getSubstrings());
        System.out.println("Expected: ?" );
        
    }
}