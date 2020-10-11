using OA_DataAccess;
using OA_Repository.Interfaces;
using OA_Service.Interfaces;
using System;
using System.Collections.Generic;
using System.Text;

namespace OA_Service.Services
{
    public class ProductService : IProductService
    {
        private IRepository<Product> _productRepository;
        private IRepository<ProductDetails> _productDetailRepository;
        public ProductService(IRepository<Product> productRepository, IRepository<ProductDetails> productDetailRepository)
        {
            _productRepository = productRepository;
            _productDetailRepository = productDetailRepository;
        }
        public Product GetProduct(int id)
        {
            return _productRepository.Get(id);
        }

        public IEnumerable<Product> GetProducts()
        {
            return _productRepository.GetAll();
        }
    }
}
