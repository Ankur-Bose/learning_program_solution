import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Rohit", score: 85 },
    { name: "Kohli", score: 95 },
    { name: "Rahul", score: 45 },
    { name: "Iyer", score: 72 },
    { name: "Hardik", score: 66 },
    { name: "Jadeja", score: 74 },
    { name: "Bumrah", score: 30 },
    { name: "Shami", score: 40 },
    { name: "Siraj", score: 50 },
    { name: "Gill", score: 82 },
    { name: "Pant", score: 60 }
  ];

  const lowScorePlayers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <hr></hr>

      <h2>Players with Score Below 70</h2>
      <ul>
        {lowScorePlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
