using System;

namespace MySuperBank
{
    class Program
    {
        static void Main(string[] args)
        {
            var account = new BankAccount("Richie", 12500);
            Console.WriteLine($"Account {account.Number} was created for {account.Owner} with {account.Balance}.");

            account.MakeWithdrawal(150, DateTime.Now, "Trainers");
            Console.WriteLine(account.Balance);

            Console.WriteLine(account.GetAccountHistory());

            account.MakeWithdrawal(50, DateTime.Now, "Xbox Game");
            Console.WriteLine(account.Balance);

        }
    }
}