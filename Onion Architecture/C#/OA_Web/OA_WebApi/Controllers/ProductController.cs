using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using OA_DataAccess;
using OA_Service.Interfaces;
using OA_WebApi.Models.ViewModels;

namespace OA_WebApi.Controllers
{
    [Route("api/[controller]/[action]")]
    [ApiController]
    public class ProductController : ControllerBase
    {
        private readonly IProductService _productService;
        private readonly IProductDetailsService _productDetailsService;

        public ProductController(IProductService productService, IProductDetailsService productDetailsService)
        {
            _productService = productService;
            _productDetailsService = productDetailsService;
        }
        [HttpGet]
        public IActionResult GetProducts()
        {
            List<ProductDetails> productDetails = new List<ProductDetails>();
            StatusResult<List<ProductDetails>> status = new StatusResult<List<ProductDetails>>();
            try
            {
                var prodcutList = _productService.GetProducts().ToList();
                if (prodcutList == null) throw new Exception("Couldn't connect to database");
                foreach (var product in prodcutList)
                {
                    var productDetailList = _productDetailsService.GetProductDetail(product.ProductId);
                    ProductDetails details = new ProductDetails
                    {
                        ProductId = product.ProductId,
                        Price = productDetailList.Price,
                        StockAvailable = productDetailList.StockAvailable,
                    };
                    productDetails.Add(details);
                }
                status.Status = "success";
                status.Message = "Successfully get list of products";
                status.Data = productDetails;
            }
            catch (Exception ex)
            {
                status.Status = "error";
                status.Message = ex.Message;
                status.Data = null;
            }
            return Ok(status);
        }
    }
}
