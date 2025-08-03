import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Guest from './Guest';
import User from './User';

function App() {
  const [isLogin, setLogin] = useState(false)

  const handleLogin = () => {
    setLogin(true)
  }

  const handleLogout = () => {
    setLogin(false)
  }

  return (
    <div className="App">
      <h1>Ticket Booking App</h1>
      {isLogin ? (
        <User onLogout={handleLogout} />
      ) : (
        <Guest onLogin={handleLogin} />
      )}
    </div>
  );
}

export default App;