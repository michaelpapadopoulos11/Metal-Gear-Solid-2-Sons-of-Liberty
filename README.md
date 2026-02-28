
# 📦 MGS2: The Tanker Incident - A Terminal Text-Adventure!

## 📝 Project Summary
This is a Java text-adventure game intended to be run specifically in the **VS Code Terminal**. This game is a retelling of the Metal Gear Solid 2 Tanker Incident and features text-based cutscenes, multi-path exploration of the U.S.S. Discovery, and a turn-based combat system including the Olga Gurlukovich boss fight from the original game. Players can also find items to help them along the way and discover creative ways to approach different in-game scenarios!

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
    Type this into the terminal and press Enter to prepare all files:
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

* **CODEC Calls:** A radio interface (Freq: 140.85) featuring extensive dialogue variations. Players can call Otacon at any point for combat tips that unlock gameplay actions, randomised "Chinese proverbs," and humorous Easter eggs.
* **Tactical Combat Engine:** Turn-based encounters with mechanics for accuracy, hit/miss probabilities, and critical damage. Includes specialised CQC attacks and M9 tranquilizer logic.
* **Multi-Phase Boss Battle:** A dedicated encounter with Olga Gurlukovich featuring unique logic, including stun states from Chaff Grenades and specific health-triggered events.
* **Navigable Environment & Interaction:** A structured layout of the U.S.S. Discovery Tanker where players can move between decks. Includes a dynamic Soliton Radar that updates based on Snake's recon as well as the ability to target the environment during combat (e.g., shooting out lights to impact enemy accuracy).
* **Inventory & Status:** Real-time health bar rendering for both Snake and enemies, alongside a Ration system for percentage-based healing.
* **Terminal-Based UI:** Custom ASCII art for the Soliton Radar and camera views, all rendered with cinematic text delays to mimic the original game's pacing.

---

## 🧠 Unique Challenges & Design Decisions

### The Terminal UI Struggle
Developing an engaging experience within a standard command-line interface presented several unique design hurdles:

* **Terminal Aesthetic:** The choice of a raw, text-based terminal was intended to mirror the "high-tech, low-fi" military aesthetic of the *Metal Gear* series. The goal was to make the interface feel consistent with the data streams and UI found in the original games.
* **The Aspect Ratio Dilemma:** I initially designed the game for a compact, narrow window to keep the UI tight and focused. However, I ran into conflicting requirements: the **CODEC viewer** looked best in a narrow, vertical frame, while the **Digital Camera Viewer** required a much wider horizontal field for displaying ascii images. Balancing these required extensive trial and error with padding and custom borders to ensure the layout remained stable when switching between these different "lens" sizes.
* * **UI Constraints without UTF-8:** Designing the UI without using UTF-8 symbols was difficult. Relying strictly on standard ascii meant that every health bar, border, and icon had to be built from basic characters, requiring creative layering to achieve more of a 'game-like' look and feel.
* **Simulating a Game Engine:** Terminals are built for scrolling text, not real-time interaction. I implemented custom functions variable-speed text animation, and tactical pausing to improve user immersion. Small details, like a closing animation for the camera viewer, or custom loading animations were added to make the terminal feel less like a console and more like a deliberate game.
* **The Animation Hurdle:** I experimented with frame-by-frame ascii animations to bring cutscenes to life. I tried several approaches, including rapid buffer clearing and string-array cycling, but found it difficult to achieve a smooth framerate without significant screen flickering. Additionally, having clear-looking animations required much larger terminal window sizes which conflicted with my "small window" design vision for the game.
* **Visual Persistence (HUD):** To prevent the game from feeling like a scrolling wall of text, I used ANSI "Clear Screen" routines and header re-rendering. This allowed me to keep a "static" HUD () at the top of the screen, ensuring the player's status and the Soliton Radar remained in view at all times.
* **The "Dual-Screen" Experiment:** I initially experimented with a DS-inspired layout, attempting to split the terminal into two seperate sections: the top "screen" for visuals and animations, and a bottom "screen" for text and player actions. However, implementing a stable, dual-pane interface in a standard scrolling terminal proved difficult without a dedicated TUI library. Ensuring both sections updated independently without visual flickering or alignment issues which ultimately led me back to a the single terminal screen design.

---

## 🛠️ Future Improvements

While the current build successfully captures the core events that took place during the Tanker Incident mission, there were several "System Upgrades" identified for future development to further bridge the gap between a terminal and a game engine:

* **Language Pivot (Python Integration):** In hindsight, a Python implementation might have been more efficient for this specific medium. Python also has  more  support for libraries that would better allow for smoother ascii animation-based content and more complex terminal manipulation than standard Java.
* **Skip Scene Function:** Adding the ability to bypass cinematic text delays so players can jump straight into the action.
* **Checkpoint Save System:** Implementing a way for players to save their progress and resume from specific points in the mission.
  
---

> 
> **Developed by Mike**
> 
