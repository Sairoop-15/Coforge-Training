import './App.css';
import Calculator from './Calculator';
import Child1 from './Child1';
import Child2 from './Child2';
import EmployeeComponent from './EmployeeComponent';
import Counter from "./Counter"
import CalculatorHook from './CalculatorHook';
import EvenComponent from './evenComponent';
import OddComponent from './OddComponent';
import Home from './Home';
import About from './About';
import Contact from './Contact';
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Navbar from './Navbar';

function App(props) {
  let n = props.n;

  // return(
  //   <>
  //   {n % 2 === 0 ? <EvenComponent n = {n}/> : <OddComponent n = {n} />}
  //   </>
  // );

  // return (
  //   <>
  //     {n % 2 === 0 && <EvenComponent n={n}></EvenComponent>}
  //     {n % 2 === 1 && <OddComponent n={n}></OddComponent>}
  //   </>
  // );

  // if (n % 2 === 0) {
  //   return (<EvenComponent n={n} />);
  // }
  // else
  //   return (<OddComponent n={n} />);
  // return (
  //   <>
  //     <h1>Welcome to React</h1>
  //     <b>Welcome Sairoop</b>
  //     <br></br>
  //     <Child1 location="Hyderabad" />
  //     <br></br>
  //     <Child2 name="Sai" />
  //     <br></br>
  //     <h1>College : {props.college}</h1>
  //     <EmployeeComponent org="Coforge"></EmployeeComponent>
  //     <Calculator />
  //     <Counter />
  //     <CalculatorHook />
  //   </>
  // );
  return (
    <div>
      <BrowserRouter>
        <Navbar />
        <hr />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/contact" element={<Contact />} />
        </Routes>
      </BrowserRouter>
    </div>
  );

}

export default App;
//<> is the shortcut for React.Fragment which can replace DOM element div 