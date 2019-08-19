using System;
using System.Collections.Generic;

namespace StrategyPattern
{
    class Customer
    {
        private  IList<double> drinks;

        // Get/Set Strategy
        public IBillingStrategy Strategy { get; set; }

        public Customer(IBillingStrategy strategy)
        {
            this.drinks = new List<double>();
            this.Strategy = strategy;
        }

        public void Add(double price, int quantity)
        {
            this.drinks.Add(this.Strategy.GetActPrice(price * quantity));
        }

        // Payment of bill
        public void PrintBill()
        {
            double sum = 0;
            foreach (double i in this.drinks)
            {
                sum += i;
            }
            Console.WriteLine("Total due: " + sum);
            this.drinks.Clear();
        }
    }

}
