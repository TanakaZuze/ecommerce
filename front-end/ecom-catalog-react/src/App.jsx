import { useEffect, useState } from 'react'
import './App.css'
import ProductList from './ProductList';
import CategoryFilter from './CategoryFilter';

function App() {
  const [products, setProducts] = useState([]);
  const [categories, setCategory] = useState([]);
  const [selectedCategory, setSelectedCategory] = useState([]);
  const [searchTerm, setSearchTerm] = useState([]);
  const [sortOrder, setSortOrder] = useState([]);
 

  

  useEffect(() => {
    fetch('http://localhost:8080/products')
      .then(response => response.json())
      .then(data => setProducts(data));

      fetch('http://localhost:8080/products')
      .then(response => response.json())
      .then(data => setCategory(data));
  }, []);

  const handleSearchChange=(event) => {
    setSearchTerm(event.target.value);
  };

  const handleSortChange=(event) => {
    setSortOrder(event.target.value);
  };

  const handleCategorySelect=(categoryId) => {
    setSortOrder(categoryId ? Number(categoryId) : null);
  };

 


  return (
    <div className='container'>
{/* category UI */}
<div className='container'>
  <h1 className='mb-4'>Product Catalog</h1>

  <div className='row mb-4'>
      <div className='col-md-2'>
        <CategoryFilter categories={categories} onSelect={handleCategorySelect} />
      </div>

      <div className='col-md-7 mb-2'>
        <input
         type="text" 
         className='form-control'
         placeholder='Search for products.'
        onChange={handleSearchChange}
        />
  </div>

  <div className='col-md-3'>
           <select className="form-control" onChange={handleSortChange} id="">
            <option value="asc">Sort by Price: Low to high</option>
            <option value="desc">Sort by Price: High to low</option>
           </select>
        </div>


      </div>


</div>





{/* All products UI */}
      <div>
        {products.length ? (
          // display products
          <ProductList products={products} />
        ) : (
          <p>No products found</p>
        )}
      </div>
    </div>
  )
}

export default App
