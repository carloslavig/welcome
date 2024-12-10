Greeting Program in Java
This is a simple Java program that interacts with the user by greeting them based on their name, the current day of the week, and the time of day. The program adjusts the greeting dynamically, offering a personalized experience.

Features
Personalized greeting: The program asks for the user's name and addresses them directly in the message.
Day of the week: Displays the current day in Portuguese (e.g., "segunda-feira").
Time-sensitive greeting:
Morning: "Bom dia!"
Afternoon: "Boa tarde!"
Evening: "Boa noite!"
Fallback greeting: "Salvêê!" (for unexpected scenarios).
Localized output: Uses the Brazilian Portuguese locale for the day of the week.
Requirements
Java: Version 8 or above.
A Java development environment (IDE or terminal).
How to run
Make sure you have JDK installed on your machine.
Clone this repository or copy the project file.
Compile the file in the terminal with the command:
bash
Copiar código
javac Main.java
Run the program with:
bash
Copiar código
java Main
Usage
When prompted, enter your name.
The program will display:
Your name.
The current day of the week in Portuguese.
A greeting based on the time of day.
Example:

less
Copiar código
Informe seu nome:
João
Olá, João, meu consagrado. Hoje é segunda-feira. Bom dia!
How it works
User Input:
The program uses a Scanner to capture the user's name.
Current Date and Time:
The program retrieves the current date using LocalDate and the current time using LocalDateTime.
Localized Day Name:
The day of the week is displayed in full using the Brazilian Portuguese locale (pt-BR).
Greeting Selection:
Based on the current hour, the program selects an appropriate greeting:
Morning: 0:00 to 11:59
Afternoon: 12:00 to 17:59
Evening: 18:00 to 23:59
A fallback greeting ("Salvêê!") is included for any edge cases.
Customization
Language: You can change the locale by modifying the line:

java
Copiar código
Locale brasil = new Locale("pt", "BR");
For example, to use English:

java
Copiar código
Locale english = new Locale("en", "US");
Greeting Text: Modify the greeting messages inside the if-else block to fit your preferences.

Contributions
Contributions are welcome! Feel free to open a pull request or report issues in the Issues section.

License
This project is free to use. You can modify and distribute it as you like!
