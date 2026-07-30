function ProductCard(props) {
    return (
        <div className="card mb-3 border-secondary" style={{ width: '100%', maxWidth: '28rem' }}>
            <div className="card-body p-4">
                <h3 className="card-title mb-3 border-bottom pb-2">Product Details</h3>
                <p className="card-text mb-2"><b>Product Name:</b> {props.name}</p>
                <p className="card-text mb-2"><b>Price:</b> ₹{props.price}</p>
                <p className="card-text mb-2"><b>Brand:</b> {props.brand}</p>
                <p className="card-text mb-2"><b>Rating:</b> {props.rating}</p>
                <p className="card-text mb-0"><b>Stock Status:</b> {props.stock}</p>
            </div>
        </div>
    );
}

export default ProductCard;