public class RewardValue
{
    private double cashValue;
    private int miles;

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
            return this.miles * 0.0035;
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
            return this.cashValue / 0.0035;
        }
        else
        {
            return this.miles;
        }
    }
}
