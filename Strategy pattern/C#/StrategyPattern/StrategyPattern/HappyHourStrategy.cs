namespace StrategyPattern
{
    // Strategy for Happy hour (50% discount)
    class HappyHourStrategy : IBillingStrategy
    {
        public double GetActPrice(double rawPrice)
        {
            return rawPrice * 0.5;
        }
    }

}
