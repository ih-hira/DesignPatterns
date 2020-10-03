using System;
using System.Collections.Generic;
using System.Text;

namespace DelegateExample
{
    public class NameManager
    {
        public void UpdateName(string newName, Notification sendNotification)
        {
            Console.WriteLine("Name is updating...");
            sendNotification($"Your name successfully changed to {newName}");
        }
    }
}
