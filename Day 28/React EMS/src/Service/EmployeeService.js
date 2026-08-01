import axios from "axios"

class EmployeeService {
    constructor() {
        this.baseUrl = "http://localhost:1111/api/v1/ems"
    }

    saveEmployee(employee) {
        return axios.post(this.baseUrl + "/employees", employee);
    }

    updateEmployee(employee) {
        return axios.put(
            this.baseUrl + "/employees/" + employee.empId,
            employee
        );
    }

    deleteEmployee(id) {
        return axios.delete(this.baseUrl + "/employees/" + id);
    }

    findEmployee(id) {
        return axios.get(this.baseUrl + "/employees/" + id);
    }

    findAll() {
        return axios.get(this.baseUrl + "/employees");
    }
}

export default new EmployeeService();
