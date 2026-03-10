# The Tanker Incident - A Terminal Text-Adventure!

## 📡 Project Summary
This is a Java text-adventure game intended to be run specifically in the **VS Code Terminal**. This game is a retelling of the Metal Gear Solid 2 Tanker Incident and features text-based cutscenes, multi-path exploration of the U.S.S. Discovery, and a turn-based combat system including the Olga Gurlukovich boss fight from the original game.

<div align="center">
<table border="0">
  <tr>
    <td align="center" valign="top" width="33%">
      <img src="https://github.com/user-attachments/assets/dab0ccf6-ebdd-4f61-8577-74cc716c87fb" width="280" alt="Snake Intro Screen"/><br/>
      <em>Gameplay</em>
    </td>
    <td align="center" valign="top" width="33%">
      <img src="https://github.com/user-attachments/assets/fd854a85-d036-4e78-ae03-a916cd7985db" width="280" alt="Deck Map Screen"/><br/>
      <em>Map Discovery</em>
    </td>
    <td align="center" valign="top" width="33%">
      <img src="https://github.com/user-attachments/assets/093c8d34-b541-4b39-8036-53fe13e78aea" width="280" alt="Gameplay Loop Screen"/><br/>
      <em>Puzzles</em>
    </td>
  </tr>
</table>
</div>

---

## 💾 How to Play
1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/michaelpapadopoulos11/MGS2-Tanker-Incident-Text-Adventure.git](https://github.com/michaelpapadopoulos11/MGS2-Tanker-Incident-Text-Adventure.git)
    ```
2.  **Open in VS Code:** Open the folder containing the project files. 
    > **Note:** For the intended experience, please install and set your terminal font to **[Anonymous Pro](https://fonts.google.com/specimen/Anonymous+Pro)**. This ensures all ASCII art and UI elements align and display correctly.
3.  **Set the Theme:** Ensure your terminal is set to a **Dark Theme** (Solarized Dark is recommended) for the best ANSI color contrast.
4.  **Compile the Source:**
    Type this into the terminal and press Enter:
    ```bash
    javac *.java
    ```
5.  **Start the Game:**
    Run the main file to begin the mission:
    ```bash
    java Game
    ```

---

## 📦 Key Features

* **Navigable Environment:** A structured layout of the U.S.S. Discovery where players move between decks. Includes a dynamic Soliton Radar that updates based on Snake's position and intel he acquires.
* **Tactical Combat:** Turn-based combat encounters that move beyond simple text. Players manage health percentages, phase transitions, and have access to tactical options like the M9 Tranquilizer, CQC, and environment-based actions, such as shooting out overhead lights to reduce enemy accuracy.
* **CODEC Calls:** A radio interface (Freq: 140.85) featuring extensive dialogue. Players can call Otacon for combat tips, randomized proverbs, and other Metal Gear Easter eggs.
* **Inventory & Status:** Real-time rendering of health bars for both Snake and enemies, alongside a Ration system for healing and Chaff Grenades for status effects.

---

## ⚙️ Unique Challenges & Design Decisions

### Terminal UI Constraints  
Designing a game inside a terminal meant constantly working around the limits of text‑only rendering. Different parts of the game needed completely different aspect ratios: the CODEC looked best in a narrow, vertical layout, while the Digital Camera Viewer required a wide horizontal field so ASCII images wouldn’t wrap or distort. Balancing these competing formats and keeping the UI consistent across them became one of the project’s biggest design hurdles.

### Creating a “Game Engine” Inside a Terminal  
Since terminals aren’t built for games, many features had to be faked or simulated. Loading screens, camera shutter animations, hacking sequences, and other small effects were manually crafted to make the experience feel intentional and game‑like rather than just scrolling text. Building these elements — along with the tech‑styled UI inspired by Metal Gear — helped the terminal feel more like a retro tactical interface than a command line.

### Making Text Feel Dynamic  
Even simple interactions required custom solutions. Smooth text scrolling, variable‑speed dialogue, dramatic pauses, and screen‑clearing transitions all had to be implemented by hand. These small systems worked together to give the game a sense of pacing and atmosphere, making the terminal output feel alive rather than static.

---

## 🛠️ Future Improvements

* **Language Pivot (Python Integration):** A Python implementation might have been more efficient for this medium, offering better library support for smoother ASCII animations and complex terminal manipulation.
* **Skip Scene Function:** Adding the ability to bypass cinematic text delays so players can jump straight into the action.
* **Checkpoint Save System:** Implementing a way for players to save their progress and resume from specific points in the mission.

---

> 
> **Developed by Mike**
>
