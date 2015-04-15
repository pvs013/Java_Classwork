// BlueJ project: lesson4/checkerboard
// Video: Checkerboard

public class CheckerBoardPainter
{
    /**
     * Computes the color of a square on a checkerboard.
     * The top left corner is blue.
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint
     */
    public int getColor(int row, int col)
    {
        // two odd or two even numbers will sum even and mod 0
        // odd/even combination will sum odd and mod 1
        return ((row+col) % 2);

    }
}
