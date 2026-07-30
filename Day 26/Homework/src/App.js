import logo from './logo.svg';
import './App.css';
import MyChild1 from "./MyChild1"
import EmployeeCard from './EmployeeCard';
import ProductCard from './ProductCard';

function App() {
  const current = new Date();
  const date = `${current.getDate()}/${current.getMonth() + 1}/${current.getFullYear()}`;
  return (
    <div className="App">
      <h1>Welcome to React</h1>
      <br></br><b>Sairoop</b>
      <br></br><b>{date}</b>
      <br></br>
      <MyChild1 name="Rahul" Course="CSE" Age={22} City="Hyderabad"></MyChild1>
      <EmployeeCard empId={101}
        name="Sai"
        department="IT"
        designation="Software Engineer"
        salary={50000}></EmployeeCard>
      <EmployeeCard
        empId={102}
        name="Rahul"
        department="HR"
        designation="HR Manager"
        salary={60000}
      />
      <EmployeeCard
        empId={103}
        name="Priya"
        department="Finance"
        designation="Accountant"
        salary={55000}
      />
      <ProductCard name="Laptop"
        price={65000}
        brand="Dell"
        rating={4.5}
        stock="In Stock"></ProductCard>
      <ProductCard
        name="Mobile"
        price={25000}
        brand="Samsung"
        rating={4.2}
        stock="Out of Stock"
      />

      <ProductCard
        name="Headphones"
        price={3000}
        brand="Boat"
        rating={4.0}
        stock="In Stock"
      />

    </div>
  );
}

export default App;
