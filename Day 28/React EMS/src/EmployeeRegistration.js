import React, { useState } from "react";

function EmployeeRegistration() {
    const [employeeId, setEmployeeId] = useState("");
    const [employeeName, setEmployeeName] = useState("");
    const [employeeEmail, setEmployeeEmail] = useState("");
    const [departmentNo, setDepartmentNo] = useState("");
    const [salary, setSalary] = useState("");

    const [submitted, setSubmitted] = useState(false);
    const [message, setMessage] = useState("");

    const submitForm = () => {
        if (
            employeeId === "" ||
            employeeName === "" ||
            employeeEmail === "" ||
            departmentNo === "" ||
            salary === ""
        ) {
            setMessage("All fields are required");
            setSubmitted(false);
            return;
        }

        setMessage("");
        setSubmitted(true);
    };

    return (
        <>
            <h2>Employee Registration</h2>

            Employee Id :
            <input
                type="number"
                value={employeeId}
                onChange={(e) => setEmployeeId(e.target.value)}
            />
            <br /><br />

            Employee Name :
            <input
                type="text"
                value={employeeName}
                onChange={(e) => setEmployeeName(e.target.value)}
            />
            <br /><br />

            Department No :
            <input
                type="number"
                value={departmentNo}
                onChange={(e) => setDepartmentNo(e.target.value)}
            />
            <br /><br />

            Employee Email :
            <input
                type="email"
                value={employeeEmail}
                onChange={(e) => setEmployeeEmail(e.target.value)}
            />
            <br /><br />

            Salary :
            <input
                type="number"
                value={salary}
                onChange={(e) => setSalary(e.target.value)}
            />
            <br /><br />

            <button onClick={submitForm}>
                Submit
            </button>

            <br /><br />

            <button>Insert</button>
            <button>Update</button>
            <button>Delete</button>
            <button>Find</button>
            <button>FindAll</button>

            <span style={{ color: "red" }}>{message}</span>

            {submitted && (
                <>
                    <h3>Employee Details</h3>

                    <p>Employee Id : {employeeId}</p>
                    <p>Employee Name : {employeeName}</p>
                    <p>Employee Email : {employeeEmail}</p>
                    <p>Department No : {departmentNo}</p>
                    <p>Salary : {salary}</p>
                </>
            )}
        </>
    );
}

export default EmployeeRegistration;