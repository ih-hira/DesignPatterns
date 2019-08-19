namespace StrategyPattern
{
    // Normal billing strategy (unchanged price)
    class NormalStrategy : IBillingStrategy
    {
        public double GetActPrice(double rawPrice)
        {
            return rawPrice;
        }
    }

}
