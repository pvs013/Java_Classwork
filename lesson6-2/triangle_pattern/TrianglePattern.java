// Print the following pattern of brackets: 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]
public class TrianglePattern
{
    public static void main(String[] args)
    {
        // YOUR CODE HERE
        // Write nested loops so that on the first row
        // you print one pair of brackets and on the 
        // second row you print 2 pairs of brackets, and
        // so on...
        int numberOfRows = 5;
        
        for (int r=1; r <= numberOfRows; r++)
        {
            for (int b=0; b< r; b++)
            {
                System.out.printf("[]");
            }
            System.out.printf("\n");
        }
    }
}
