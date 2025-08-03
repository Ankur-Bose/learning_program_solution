import React from 'react'

function User({ onLogout }) {
  return (
    <div>
        <h2>Welcome, User</h2>
        <p>You can now book tickets : </p>
        <ul>
            <li>Flight 101 - Delhi to Mumbai</li>
            <li>Flight 202 - Mumbai to Bangalore</li>
            <li>Flight 303 - Kolkata to Delhi</li>
        </ul>
        <button onClick={onLogout}>Logout</button>
    </div>
  )
}

export default User