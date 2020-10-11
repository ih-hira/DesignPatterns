using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace OA_WebApi.Models.ViewModels
{
    public class StatusResult<T>
    {
        public string Status { get; set; } = "error";
        public string Message { get; set; }
        public T Data { get; set; }
    }
}
