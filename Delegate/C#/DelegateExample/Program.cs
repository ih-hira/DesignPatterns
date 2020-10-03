using System;

namespace DelegateExample
{
    class Program
    {
        static void Main(string[] args)
        {
            UpdateProfile updateProfile = new UpdateProfile();
            updateProfile.UpdateName("Imtiyaz Hossain");
            updateProfile.ChangePassword("9852147");
            Console.ReadLine();
        }
    }
}
