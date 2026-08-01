import React, { useState } from "react";
import Employee from "../Models/Employee";
import EmployeeService from "../Service/EmployeeService";

export default function EmployeeHome() {
    const [empId, setEmpId] = useState(0);
    const [empName, setEmpName] = useState("");
    const [email, setEmail] = useState("");
    const [empSalary, setEmpSalary] = useState(0);
    const [deptNo, setDeptNo] = useState(0);
    const [result, setResult] = useState("");
    const [employees, setEmployees] = useState([]);
    const [errors, setErrors] = useState({
        empId: "",
        empName: "",
        email: "",
        empSalary: "",
        deptNo: ""
    });

    const validateEmployee = () => {
        const newErrors = {
            empId: "",
            empName: "",
            email: "",
            empSalary: "",
            deptNo: ""
        };

        if (!empId || Number(empId) <= 0) {
            newErrors.empId = "Employee ID is required and must be positive.";
        }
        if (!empName.trim()) {
            newErrors.empName = "Employee Name is required.";
        }
        if (!email.trim()) {
            newErrors.email = "Email is required.";
        }
        if (!empSalary || Number(empSalary) <= 0) {
            newErrors.empSalary = "Salary is required and must be positive.";
        }
        if (!deptNo || Number(deptNo) <= 0) {
            newErrors.deptNo = "Department No is required and must be positive.";
        }

        setErrors(newErrors);
        return Object.values(newErrors).every((value) => value === "");
    }

    const saveEmployee = () => {
        if (!validateEmployee()) {
            return;
        }
        const employee = new Employee(empId, empName, email, empSalary, deptNo);
        EmployeeService.saveEmployee(employee)
            .then(response => setResult(response.data))
            .catch(err => setResult(err.message));
    }

    const updateEmployee = () => {
        if (!validateEmployee()) {
            return;
        }
        const employee = new Employee(empId, empName, email, empSalary, deptNo);
        EmployeeService.updateEmployee(employee)
            .then(response => setResult(response.data))
            .catch(err => setResult(err.message))
    }

    const deleteEmployee = () => {
        let id = empId
        if (!empId || Number(empId) <= 0) {
            setErrors({
                ...errors,
                empId: "Employee ID is required and must be positive."
            });
            return;
        }
        EmployeeService.deleteEmployee(id)
            .then(response => setResult(response.data))
            .catch(err => setResult(err.message))
    }

    const findEmployee = () => {
        if (!empId || Number(empId) <= 0) {
            setErrors({
                ...errors,
                empId: "Employee ID is required and must be positive."
            });
            return;
        }

        EmployeeService.findEmployee(empId)
            .then(response => {
                setEmployees([response.data]); // convert single object to array
                setResult("");
            })
            .catch(err => setResult(err.message));
    }

    const findAll = () => {
        EmployeeService.findAll()
            .then(response => {
                setEmployees(response.data);
                setResult("");
            })
            .catch(err => setResult(err.message));
    }

    return (
        <>
            <h1>Employee Employee Home Page</h1>

            <b>Employee ID <input type="text" value={empId} onChange={(e) => setEmpId(e.target.value)} /></b>
            {errors.empId && <div style={{ color: "red" }}>{errors.empId}</div>}
            <br></br>
            <b>Employee Name <input type="text" value={empName} onChange={(e) => setEmpName(e.target.value)} /></b>
            {errors.empName && <div style={{ color: "red" }}>{errors.empName}</div>}
            <br></br>
            <b>Employee Email <input type="text" value={email} onChange={(e) => setEmail(e.target.value)} /></b>
            {errors.email && <div style={{ color: "red" }}>{errors.email}</div>}
            <br></br>
            <b>Employee Salary <input type="text" value={empSalary} onChange={(e) => setEmpSalary(e.target.value)} /></b>
            {errors.empSalary && <div style={{ color: "red" }}>{errors.empSalary}</div>}
            <br></br>
            <b>Employee DNO <input type="text" value={deptNo} onChange={(e) => setDeptNo(e.target.value)} /></b>
            {errors.deptNo && <div style={{ color: "red" }}>{errors.deptNo}</div>}
            <br></br>

            <button onClick={saveEmployee}>Save</button>
            <button onClick={updateEmployee}>Update</button>
            <button onClick={deleteEmployee}>Delete</button>
            <button onClick={findEmployee}>Find</button>
            <button onClick={findAll}>Find All</button>

            <br></br>

            <b>{result}</b>

            <br />

            {employees.length > 0 && (
                <table className="table table-bordered table-striped table-hover">
                    <thead className="table-dark">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Salary</th>
                            <th>Dept No</th>
                        </tr>
                    </thead>
                    <tbody>
                        {employees.map(emp => (
                            <tr key={emp.empId}>
                                <td>{emp.empId}</td>
                                <td>{emp.empName}</td>
                                <td>{emp.email}</td>
                                <td>{emp.empSalary}</td>
                                <td>{emp.deptNo}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            )}

            <b>{result}</b>

        </>
    );
}
