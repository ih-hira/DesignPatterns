using System;
using System.Collections.Generic;
using System.Text;

namespace DelegateExample
{
    public delegate void Notification(string text);
    public class UpdateProfile
    {

        public void UpdateName(string newName)
        {
            Notification notificationType = PopUpNotification;
            NameManager nameManager = new NameManager();
            nameManager.UpdateName(newName, notificationType);
        }

        public void ChangePassword(string newPassword)
        {
            Notification notificationType = SmsNotification;
            PasswordManager passwordManager = new PasswordManager();
            passwordManager.ChangePassword(newPassword, notificationType);
        }

        private void PopUpNotification(string text)
        {
            Console.WriteLine($"PopUp: {text}");
        }
        private void SmsNotification(string text)
        {
            Console.WriteLine($"SMS: {text}");
        }
        private void EmailNotification(string text)
        {
            Console.WriteLine($"EMAIL: {text}");
        }
    }
}
