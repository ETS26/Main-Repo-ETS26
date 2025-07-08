#include <WiFi.h>
#include <WiFiClientSecure.h>
#include <UniversalTelegramBot.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#include "secret.h"

WiFiClientSecure client;
UniversalTelegramBot bot(botToken, client);

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_RESET    -1
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);

unsigned int lastTime = 0;
unsigned int interval = 2000;

const int buttonDot = 25;
const int buttonDash = 26;
const int buttonDecode = 27;
const int buttonClear = 13;
const int ledPin = 16;
const int buzzerPin = 14;

String morseInput = "";
String decodedText = "";

bool telegramMod = false;
int clearButtonPressCount = 0;
unsigned long lastClearButtonPress = 0;

struct MorseEntry {
  const char* code;
  char letter;
};

MorseEntry morseTable[] = {
  {".-", 'A'}, {"-...", 'B'}, {"-.-.", 'C'}, {"-..", 'D'}, {".", 'E'},
  {"..-.", 'F'}, {"--.", 'G'}, {"....", 'H'}, {"..", 'I'}, {".---", 'J'},
  {"-.-", 'K'}, {".-..", 'L'}, {"--", 'M'}, {"-.", 'N'}, {"---", 'O'},
  {".--.", 'P'}, {"--.-", 'Q'}, {".-.", 'R'}, {"...", 'S'}, {"-", 'T'},
  {"..-", 'U'}, {"...-", 'V'}, {".--", 'W'}, {"-..-", 'X'}, {"-.--", 'Y'},
  {"--..", 'Z'}, {"-----", '0'}, {".----", '1'}, {"..---", '2'},
  {"...--", '3'}, {"....-", '4'}, {".....", '5'}, {"-....", '6'},
  {"--...", '7'}, {"---..", '8'}, {"----.", '9'},
  {".-.-.-", '.'}, {"--..--", ','}, {"---...", ':'}, {"-.-.-.", ';'}, 
  {"-.-.--", '!'}, {"-..-.", '/'}, {"-.--.", '('}, {"-.--.-", ')'},
  {".-...", '&'}, {".-..-.", '"'}, {".----.", '/'}, {"-...-", '='}, 
  {".-.-.", '+'}, {"-....-", '-'}, {"..--.-", '_'}, {"...-..-", '$'}, 
  {".--.-.", '@'}, {"..--..", '?'}, {"---..-", ':'}
};

void setup() {
  Serial.begin(115200);

  pinMode(buttonDot, INPUT_PULLUP);
  pinMode(buttonDash, INPUT_PULLUP);
  pinMode(buttonDecode, INPUT_PULLUP);
  pinMode(buttonClear, INPUT_PULLUP);
  pinMode(ledPin, OUTPUT);
  pinMode(buzzerPin, OUTPUT);

  if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) {
    Serial.println(F("SSD1306 başlatılamadı"));
    while (true);
  }

  display.clearDisplay();
  display.setTextSize(2);
  display.setTextColor(SSD1306_WHITE);
  display.setCursor(0, 0);
  display.println("Welcome To");
  display.println("MorseCoder");
  display.display();
  delay(1500);
  display.clearDisplay();

  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("WiFi baglandi");
  
  client.setInsecure(); 
}

void loop() {
 if (digitalRead(buttonClear) == LOW) {
  delay(50); 

  if (telegramMod) {
    
    if (millis() - lastClearButtonPress < 1000) {
      clearButtonPressCount++;
    } else {
      clearButtonPressCount = 1; 
    }
    lastClearButtonPress = millis(); 

    while (digitalRead(buttonClear) == LOW) {
      delay(10); 
    }

    if (clearButtonPressCount >= 3) {
      telegramMod = false; 
      clearButtonPressCount = 0;

      morseInput = "";
      decodedText = "";

      display.clearDisplay();
      display.setTextSize(2);
      display.setCursor(0, 0);
      display.println("Mors Modu");
      display.display();
      tone(buzzerPin, 500, 100); 
      delay(1000);
      display.clearDisplay();
      
    }

  } else {
    
    if (decodedText.length() > 0) {
      String morseVersion = textToMorse(decodedText);
      String message = "Mors: " + morseVersion + "\nMetin: " + decodedText;
      Serial.println(message);
      bot.sendMessage(chat_id, message, "");

      display.clearDisplay();
      display.setTextSize(2);
      display.setCursor(0, 0);
      display.println("Mesaj");
      display.println("Gonderildi");
      display.display();
      delay(1000); 
    }
    
    morseInput = "";
    decodedText = "";
    display.clearDisplay();
    display.setTextSize(1);
    display.setCursor(0, 0);
    display.print("Code:");
    display.display();
    digitalWrite(ledPin, HIGH);
    delay(200);
    digitalWrite(ledPin, LOW);
    delay(300);
  }
}

  if (!telegramMod) { 
    
    if (digitalRead(buttonDot) == LOW) {
      morseInput += ".";
      updateDisplay();
      tone(buzzerPin, 1000, 50);
      delay(150);
    }

    if (digitalRead(buttonDash) == LOW) {
      morseInput += "-";
      updateDisplay();
      tone(buzzerPin, 1000, 50);
      delay(250);
    }

    if (digitalRead(buttonDecode) == LOW) {
      if (morseInput == ".......") { 
        telegramMod = true;
        morseInput = "";
        decodedText = "";
        display.clearDisplay();
        display.setTextSize(2);
        display.setCursor(0, 0);
        display.println("Telegram");
        display.println("Mode");
        display.display();
        tone(buzzerPin, 500, 100);
        delay(1000);
      } else {
        char result = decodeMorse(morseInput);
        if (result != ' ') {
          decodedText += result;
        }

        display.clearDisplay();
        display.setTextSize(1);
        display.setCursor(0, 0);
        display.print("Code:");
        display.print(morseInput);

        display.setTextSize(1);
        display.setCursor(0, 30);
        if (result != ' ') {
          display.print(decodedText);
        } else {
          display.print("ERROR");
        }
        display.display();

        digitalWrite(ledPin, HIGH);
        delay(200);
        digitalWrite(ledPin, LOW);

        morseInput = "";
        updateDisplay();
        delay(500);
      }
    }
  } 
  else { 
    
    if (millis() > lastTime + interval) {
      int numNewMessages = bot.getUpdates(bot.last_message_received + 1);

      while (numNewMessages) {
        for (int i = 0; i < numNewMessages; i++) {
          String text = bot.messages[i].text;
          String morse = textToMorse(text);
          showText(morse);
        }
        numNewMessages = bot.getUpdates(bot.last_message_received + 1);
      }
      lastTime = millis();
    }
  }
}


void updateDisplay() { 
  display.setTextSize(1);
  display.setCursor(0, 0);
  display.fillRect(0, 0, SCREEN_WIDTH, 16, SSD1306_BLACK);
  display.print("Code:");
  display.print(morseInput);
  display.display();
}

char decodeMorse(String code) { 
  for (int i = 0; i < sizeof(morseTable) / sizeof(MorseEntry); i++) {
    if (code == morseTable[i].code) {
      return morseTable[i].letter;
    }
  }
  return ' ';
}

String letterToMorse(char letter) { 
  letter = toupper(letter); 
  for (int i = 0; i < sizeof(morseTable) / sizeof(MorseEntry); i++) {
    if (morseTable[i].letter == letter) {
      return String(morseTable[i].code);
    }
  }
  return "";
}

String textToMorse(String text) { 
  String morse = "";
  for (int i = 0; i < text.length(); i++) {
    if (text[i] == ' ') {
      morse += "   "; 
    } else {
      morse += letterToMorse(text[i]);
      morse += " ";
    }
  }
  return morse;
}

void showText(String text) {
  
  display.clearDisplay();

  String originalText = textToPlain(text); 

  display.setTextSize(1);

  // Üst satır
  display.setCursor(0, 0);
  display.print("Mors: "+text);
 

  display.setCursor(0, 30);
  display.print("Text: "+originalText);
  

  display.display();
  Serial.println("Mors Kodu: "+text);
  Serial.println("Text: "+originalText);
}

String textToPlain(String morse) { 
  String decoded = "";
  String currentCode = "";
  for (int i = 0; i < morse.length(); i++) {
    char c = morse[i];
    if (c == '.' || c == '-') {
      currentCode += c;
    } else if (c == ' ' || i == morse.length() - 1) {
      if (currentCode.length() > 0) {
        decoded += decodeMorse(currentCode);
        currentCode = "";
      }
      if (i < morse.length() - 2 && morse[i+1] == ' ' && morse[i+2] == ' ') {
        decoded += " ";
        i += 2;
      }
    }
  }
  return decoded;
}

