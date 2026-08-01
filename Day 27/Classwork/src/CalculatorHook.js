import React, { useState } from 'react';

function CalculatorHook() {

    const [n1, SetN1] = useState(0);
    const [n2, SetN2] = useState(0);
    const [result, setResult] = useState(0);

    const addition = () => {
        setResult(n1 + n2)
    }

    const subtraction = () => {
        setResult(n1 - n2)
    }

    const multiplication = () => {
        setResult(n1 * n2)
    }

    const division = () => {
        setResult(n1 / n2)
    }

    return (
        <div >
            <br />Enter Value of N1 <input type="number" onChange={(event) => { SetN1(Number(event.target.value)) }} />
            <br />Enter Value of N2 <input type="number" onChange={(event) => { SetN2(Number(event.target.value)) }} />


            <br /><button onClick={addition} >Addition</button>
            <button onClick={subtraction} >Subtraction</button>
            <button onClick={division} >Division</button>
            <button onClick={multiplication} >Multiplication</button>

            <h2>{result}</h2>
        </div>
    );
}

export default CalculatorHook;
