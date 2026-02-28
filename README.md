# 📦 MGS2: The Tanker Incident - A Terminal Text-Adventure!

## 📝 Project Summary
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

## 🎮 How to Play

### 🚀 Quick Start
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

## 📡 Key Features

* **Digital Camera Viewer:** A specialized horizontal interface used for recon. It uses a wide-aspect ASCII field to render detailed environments while maintaining a tactical HUD with battery and time overlays.
* **Tactical Combat Engine:** Turn-based boss encounters that move beyond simple text. Players manage health percentages, phase transitions, and tactical options like the M9 Tranquilizer, CQC, and environment-based actions like shooting out overhead lights to reduce enemy accuracy.
* **CODEC Calls:** A radio interface (Freq: 140.85) featuring extensive dialogue. Players can call Otacon for combat tips, randomized proverbs, and Easter eggs.
* **Navigable Environment:** A structured layout of the U.S.S. Discovery where players move between decks. Includes a dynamic Soliton Radar that updates based on Snake's position.
* **Inventory & Status:** Real-time rendering of health bars for both Snake and enemies, alongside a Ration system for healing and Chaff Grenades for status effects.

<div align="center">
<table border="0">
  <tr>
    <td align="center" valign="top" width="50%">
      <img src="https://github.com/user-attachments/assets/5d166d50-6f1a-44ca-a6d8-cd139da7dfcc" width="280" alt="camera viewer"/><br/>
      <em>Digital Camera Interface</em>
    </td>
    <td align="center" valign="top" width="50%">
      <img src="https://github.com/user-attachments/assets/b425e54e-ef7c-4e78-a17f-1fd88b608de0" width="380" alt="boss fights"/><br/>
      <em>Turn-Based Boss Logic</em>
    </td>
  </tr>
</table>
</div>

---

## 🧠 Unique Challenges & Design Decisions

### The Terminal UI Struggle
* **The Aspect Ratio Dilemma:** A major hurdle was switching between vertical and horizontal views. The **CODEC** required a narrow frame, but the **Digital Camera Viewer** required a wide horizontal field to prevent ASCII art from wrapping. I implemented custom padding logic to ensure the layout stayed stable during "lens" switches.
* **Terminal Aesthetic:** I chose the terminal format because the raw text output naturally emulates the "military-tech" feel of the *Metal Gear* series equipment.
* **Simulating a Game Engine:** Because terminals are built for scrolling, I implemented custom functions for variable-speed text and tactical pausing. Adding animations (like a camera shutter or loading bars) helped the terminal feel more like a deliberate game engine.
* **Visual Persistence (HUD):** To prevent a "scrolling wall of text," I used ANSI "Clear Screen" routines and header re-rendering. This keeps a **static HUD (Heads-Up Display)** at the top of the screen so health and radar stay in view at all times.

---

## 🛠️ Future Improvements

* **Language Pivot (Python Integration):** A Python implementation might have been more efficient for this medium, offering better library support for smoother ASCII animations and complex terminal manipulation.
* **Skip Scene Function:** Adding the ability to bypass cinematic text delays so players can jump straight into the action.
* **Checkpoint Save System:** Implementing a way for players to save their progress and resume from specific points in the mission.

---

> 
> **Developed by Mike**
>
