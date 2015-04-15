
public class WordTester
{
    public static void main(String[] args)
    {
        Word word = new Word();
        
        String tw1 = "THISBIGONE";
        System.out.println("Actual: " + word.scramble(tw1));
        System.out.println("Expected: ?" );
        
        String tw2 = "basketball";
        System.out.println("Actual: " + word.scramble(tw2));
        System.out.println("Expected: ?" );
        
    }
}
