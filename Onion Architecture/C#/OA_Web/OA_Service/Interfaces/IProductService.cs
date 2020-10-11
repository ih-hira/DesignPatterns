using OA_DataAccess;
using System;
using System.Collections.Generic;
using System.Text;

namespace OA_Service.Interfaces
{
    public interface IProductService
    {
        IEnumerable<Product> GetProducts();
        Product GetProduct(int id);
    }
}
