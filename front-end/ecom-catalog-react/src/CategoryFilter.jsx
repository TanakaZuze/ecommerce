const CategoryFilter = ({ categories, onSelected }) => {
    return (
        <div className="row">
            <>
                <select className="form-control" id="categorySelect" onChange={(e) => onselect(e.target.value)}>
                    <option value="">All categories</option>
                    {categories.map(category => (
                        <option key={category.id} value={category.id}>{category.name}</option>
                    ))}
                </select>
            </>
        </div>
    )
}

export default CategoryFilter