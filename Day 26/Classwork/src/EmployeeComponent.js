import { Component } from "react";

class EmployeeComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            eid : 101,
            ename : "Sairoop",
            esalary : 9875
        }
    }
    render() {
        return (
            <>
                <h1>React Props And State</h1>
                <h2>Organization Name : {this.props.org}</h2>
                <br/><b>Employee Eid : {this.state.eid}</b>
                <br/><b>Employee Name : {this.state.ename}</b>
                <br/><b>employee Salary : {this.state.esalary}</b>
            </>
        );
    }
}

export default EmployeeComponent;