public class RewardValue
{
    private double cashValue;
    private int miles;
    private static final double MILES_TO_CASH_CONVERSION = 0.0035;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles)
    {
        this.miles = miles;
    }

    public double getCashValue()
    {
        if(this.miles != 0)
        {
            return this.miles * MILES_TO_CASH_CONVERSION;
        }
        else
        {
            return this.cashValue;
        }
    }

    public double getMilesValue()
    {
        if(this.cashValue != 0)
        {
            return this.cashValue / MILES_TO_CASH_CONVERSION;
        }
        else
        {
            return this.miles;
        }
    }
}
