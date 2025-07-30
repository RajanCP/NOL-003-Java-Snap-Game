# Java Snap Game

**Java Snap** is a fast-paced terminal-version of the card game that tests your memory, reflexes, and reaction time. Players take turns drawing cards from a deck and must quickly type “snap” when two cards of the same rank appear in a row.

Based on the classic real-world card game Snap, this project was built to strengthen my understanding of Object-Oriented Programming (OOP) principles in Java.

---

## 🎮 How It Works

- Two players take turns drawing cards from a shuffled deck.
- If two consecutive cards have the same rank (e.g., two 7s), players must type **snap** within 2 seconds.
- The fastest (or only) player to type “snap” wins the game!
- If you’re too slow or type the wrong input, the other player wins by default.
- You can restart and play as many rounds as you like.

---

## 🛠 Prerequisites

Before you run Snap, ensure you have the following installed:

- Java Development Kit (JDK 8 or higher)
- A terminal or command prompt
- An IDE or text editor (optional)

---

### 🃏 Unicode Display Note

This game uses Unicode characters (♠ ♥ ♦ ♣ 🎉) for a more authentic card experience.

If you see `?` or empty boxes instead of card suits or emojis, try one of these:

1.  **Use IntelliJ’s Run Console** — full Unicode support built-in
2.  **Use Windows Terminal** (not CMD or PowerShell)

If you're unsure, just run the game from IntelliJ 

## 🚀 Running the Game

1. Clone or download the repository.

2. Compile the game using a terminal:

```
javac -d out src/main/java/*.java
```

3. Run the game:

```
java -cp out Main
```

4. When prompted, enter names for Player 1 and Player 2, and follow the on-screen instructions to play.

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        ├── Card.java         # Represents a playing card (with rank and suit)
        ├── CardGame.java     # Abstract base class for card games
        ├── Main.java         # Entry point; handles user input and starts the game
        ├── Player.java       # Represents a player in the game
        ├── Rank.java         # Enum for card ranks (e.g., TWO, THREE, KING)
        ├── Snap.java         # Game logic for Snap (extends CardGame)
        └── Suit.java         # Enum for card suits (Spades, Hearts, etc.)
```

## 📬 Contact

Created by **Rajan**.  
Feel free to reach out via GitHub issues if you have questions or suggestions.

---

## 📄 License

This project is open source and available under the [MIT License](https://mit-license.org/).
