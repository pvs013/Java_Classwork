public class VoltageDividerAmplifier extends Amplifier
{
     // TODO: supply the implementation of VoltageDividerAmplifier as a subclass of Amplifier
     // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
     // VoltageDividerAmplifier:    g = R2 / (R1 + R2)
     // TODO: the getGain method needs to return the correct gain (g)
    /**
     * Constructs an VoltageDivider Amplifier
     * @param resistance1 the first resistance
     * @param resistance2 the second resistance
     */
    public VoltageDividerAmplifier(int resistance1, int resistance2)
    {
        super(resistance1, resistance2);
    }
     /**
     * Gets the gain for this amplifier circuit
     * @return the gain
     */
    public double getGain()
    {
        // Gain for VoltageDividerAmplifier:    g = R2 / (R1 + R2)
        return ((double)getR2() / ((double)getR1() + (double)getR2()));
    }
}
