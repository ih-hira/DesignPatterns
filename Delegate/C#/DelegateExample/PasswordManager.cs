using System;
using System.Collections.Generic;
using System.Text;

namespace DelegateExample
{
    public class PasswordManager
    {
        public void ChangePassword(string newPassword, Notification sendNotification)
        {
            Console.WriteLine("Password is changing...");
            sendNotification($"Your new password is {newPassword}, don't enclose it to others");
        }
    }
}
