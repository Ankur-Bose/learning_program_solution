import './App.css';
import {CalculatorScore} from './components/CalculatorScore';

function App() {
  return (
    <div>
      <CalculatorScore
        Name = {"Ankur"}
        School = {"St Thomas Boys School"}
        Total = {550}
        Goal = {600} 
      />
    </div>
  );
}

export default App;