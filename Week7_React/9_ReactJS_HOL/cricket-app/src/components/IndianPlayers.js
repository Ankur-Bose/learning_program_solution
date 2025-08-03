import React from "react";

const IndianPlayers = () => {
    const players = ["Rohit", "Kohli", "Rahul", "Iyer", "Hardik", "Jadeja"];

    const oddTeam = players.filter((_, i) => i % 2 === 0);
    const evenTeam = players.filter((_, i) => i % 2 !== 0);

    const T20players = ["Surya", "Samson", "Axar Patel"];
    const RanjiTrophyPlayers = ["Pujara", "Rahane", "Virat Kohli"];

    const allPlayers = [...T20players, ...RanjiTrophyPlayers];

    return (
        <div>
            <h2>Odd Team Players</h2>
            <ul>{oddTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>

            <hr></hr>

            <h2>Even Team Players</h2>
            <ul>{evenTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>

            <hr></hr>

            <h2>All Players (T20 + Ranji)</h2>
            <ul>{allPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>
        </div>
    );
};

export default IndianPlayers;
