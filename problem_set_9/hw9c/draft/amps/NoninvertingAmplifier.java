
public class NoninvertingAmplifier extends Amplifier
{
    // TODO: supply the implementation of NoninvertingAmplifier as a subclass of Amplifier
    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // NoninvertingAmplifier:      g = 1 + (R2 / R1)
    // TODO: the getGain method needs to return the correct gain (g)
    /**
     * Constructs an Noninverting Amplifier
     * @param resistance1 the first resistance
     * @param resistance2 the second resistance
     */
    public NoninvertingAmplifier(int resistance1, int resistance2)
    {
        super(resistance1, resistance2);
    }
    
    /**
     * Gets the gain for this amplifier circuit
     * @return the gain
     */
    public double getGain()
    {
        // Gain for NoninvertingAmplifier:      g = 1 + (R2 / R1)
        return (1 + ((double)getR2() / (double)getR1()));
    }
}
