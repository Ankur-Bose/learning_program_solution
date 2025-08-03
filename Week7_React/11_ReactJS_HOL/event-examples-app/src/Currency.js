import React, { useState } from "react";

function Currency() {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("INR to Euro");

  const rate = 0.0100;

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!amount || parseFloat(amount) <= 0) {
      alert("Please enter a valid amount.");
      return;
    }

    let convertedAmount = 0;
    let message = "";

    if (currency === "INR to Euro") {
      convertedAmount = (parseFloat(amount) / rate).toFixed(2);
      message = `${amount} INR = ${convertedAmount} EUR`;
    } else if (currency === "Euro to INR") {
      convertedAmount = (parseFloat(amount) * rate).toFixed(2);
      message = `${amount} EUR = ${convertedAmount} INR`;
    }

    alert(message);
  };

  return (
    <div
      style={{
        margin: "30px",
        padding: "20px",
        border: "1px solid #ccc",
        borderRadius: "10px",
        maxWidth: "400px",
      }}
    >
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: "10px" }}>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            style={{ marginLeft: "10px", padding: "5px" }}
            required
          />
        </div>

        <div style={{ marginBottom: "10px" }}>
          <label>Currency: </label>
          <select
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            style={{ marginLeft: "10px", padding: "5px" }}
          >
            <option value="INR to Euro">INR</option>
            <option value="Euro to INR">Euro</option>
          </select>
        </div>

        <button type="submit" style={{ padding: "5px 15px" }}>
          Submit
        </button>
      </form>
    </div>
  );
}

export default Currency;