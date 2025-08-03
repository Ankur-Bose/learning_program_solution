import React from 'react'

function Guest({ onLogin }) {
  return (
    <div>
        <h2>Welcome, guest</h2>
        <p>Here are the flight information : </p>
        <ul>
            <li>Flight 101 - Delhi to Mumbai</li>
            <li>Flight 202 - Mumbai to Bangalore</li>
            <li>Flight 303 - Kolkata to Delhi</li>
        </ul>
        <button onClick={onLogin}>Login to Book Tickets</button>
    </div>
  )
}

export default Guest