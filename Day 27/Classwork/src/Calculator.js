import { Component } from "react";

class Calculator extends Component {
    constructor(props) {
        super(props);
        this.state = {
            n1: 0,
            n2: 0,
            result: 0
        }
    }

    additon = () => {
        this.setState({
            result: Number(this.state.n1) + Number(this.state.n2)
        });
    }

    subtraction = () => {
        this.setState({
            result: Number(this.state.n1) - Number(this.state.n2)
        });
    }

    multiplication = () => {
        this.setState({
            result: Number(this.state.n1) * Number(this.state.n2)
        });
    }

    division = () => {
        this.setState({
            result: Number(this.state.n1) / Number(this.state.n2)
        });
    }



    render() {
        return (
            <>
                <h1>Calculator Works!</h1>
                <b>Enter Number 1 : </b> <input type="text" value={this.state.n1} onChange={(event) => { this.setState({ n1: event.target.value }); }} />
                <br /><b>Enter Number 2 : </b> <input type="text" value={this.state.n2} onChange={(event) => { this.setState({ n2: event.target.value }); }} />
                <br /><button onClick={this.additon}>Addition</button>
                <br /><button onClick={this.subtraction}>Subtraction</button>
                <br /><button onClick={this.multiplication}>Muliplication</button>
                <br /><button onClick={this.division}>Division</button>
                <h3>Result : {this.state.result}</h3>
            </>
        );
    }
}

export default Calculator;