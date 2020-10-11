using OA_DataAccess;
using OA_Repository.Interfaces;
using OA_Service.Interfaces;
using System;
using System.Collections.Generic;
using System.Text;

namespace OA_Service.Services
{
    public class ProductDetailsService : IProductDetailsService
    {
        private IRepository<ProductDetails> _productDetailsRepository;

        public ProductDetailsService(IRepository<ProductDetails> productDetailsRepository)
        {
            _productDetailsRepository = productDetailsRepository;
        }
        public ProductDetails GetProductDetail(int id)
        {
            return _productDetailsRepository.Get(id);
        }
    }
}
