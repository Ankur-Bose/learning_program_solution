import logo from './logo.svg';
import './App.css';

function App() {

  const sr = 'https://media.istockphoto.com/id/1460755337/photo/white-color-theme-modern-style-office-with-exposed-concrete-floor-and-a-lot-of-plant-3d.jpg?s=612x612&w=0&k=20&c=PX1TFWVrLL34jgkmFREmxrzy3M4rqhBk4NMrHFOTmo8='

  const element = "Office Space"

  const jsxatt = <img src={sr} width="25%" height="25%" alt='Office Space'/>

  const itemName = {Name: "DBS", Rent: 50000, Address:'Chennai'}

  let colors = []

  if(itemName.Rent <= 60000){
    colors.push('red');
  }
  else{
    colors.push('green')
  }

  return (

    <>
      <h1>{element}, at Affordable Range </h1>
      {jsxatt}
      <h1>Name : {itemName.Name}</h1>
      <h2 style={{color:colors[0]}}>Rent : {itemName.Rent}</h2>
      <h3>Address : {itemName.Address}</h3>
    </>

  );
}

export default App;