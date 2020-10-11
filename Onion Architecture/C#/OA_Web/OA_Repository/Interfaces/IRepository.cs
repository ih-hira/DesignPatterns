using OA_DataAccess;
using System;
using System.Collections.Generic;
using System.Text;

namespace OA_Repository.Interfaces
{
    public interface IRepository<T> where T : BaseEntity
    {
        T Get(int id);
        IEnumerable<T> GetAll();
    }
}
