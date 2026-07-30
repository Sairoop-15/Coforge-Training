function EmployeeCard(props) {
    return (
        <div className="card mb-3 border-secondary" style={{ width: '100%', maxWidth: '28rem' }}>
            <div className="card-body p-4">
                <h3 className="card-title mb-3 border-bottom pb-2">Employee Details</h3>
                <p className="card-text mb-2"><b>Employee ID:</b> {props.empId}</p>
                <p className="card-text mb-2"><b>Name:</b> {props.name}</p>
                <p className="card-text mb-2"><b>Department:</b> {props.department}</p>
                <p className="card-text mb-2"><b>Designation:</b> {props.designation}</p>
                <p className="card-text mb-0"><b>Salary:</b> ₹{props.salary}</p>
            </div>
        </div>
    );
}

export default EmployeeCard;