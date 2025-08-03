import React, { useState } from "react";
import ListOfPlayers from "./components/ListOfPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const [flag, setFlag] = useState(true)

  const toggleFlag = (prevFlag) => {
    setFlag(prevFlag => !prevFlag)
  }

  return (
    <div>
      <h1>Cricket App</h1>
      <button
      onClick={toggleFlag}
      style={{ marginBottom: "20px" }}
      >Switch List</button>
      {flag ? <ListOfPlayers/> : <IndianPlayers/>}
    </div>
  );
}

export default App;