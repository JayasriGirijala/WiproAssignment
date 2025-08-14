const player1 = {
    name: "Virat Kohli",
    age: 36,
    sport: "Cricket",
    stats: {
        matches: 500,
        runs: 25000,
        average: 57.2
    }
};

const player2 = {
    name: "Lionel Messi",
    age: 36,
    sport: "Football",
    stats: {
        matches: 800,
        goals: 720,
        assists: 300
    }
};

const players = [player1, player2];

let output = "";

players.forEach(player => {
    const { name, sport, stats } = player;
    output += `Player ${name} plays ${sport}.\n`;
    if (sport === "Cricket") {
        output += `Matches: ${stats.matches} | Runs: ${stats.runs} | Batting Average: ${stats.average}\n\n`;
    } else if (sport === "Football") {
        output += `Matches: ${stats.matches} | Goals: ${stats.goals} | Assists: ${stats.assists}\n\n`;
    }
});

document.getElementById("output").textContent = output;
