# 🛒 Amazon UI Automation Testing (Selenium + TestNG)

This project is a **Selenium WebDriver automation script using Java and TestNG** that performs basic operations on Amazon such as searching for products and handling dynamic web elements.

---

## 🔧 Tech Stack

- 💻 Java (JDK 8+)
- 🌐 Selenium WebDriver
- 🧪 TestNG
- 🔌 WebDriverManager
- 🌍 Google Chrome Browser

---

## 💻 Features

- 🔍 Search for products (iPhone, Samsung Galaxy)
- 🌐 Open Amazon website automatically
- 📄 Navigate through search results
- ⚠️ Handle missing elements using exception handling
- 🚀 Execute tests using TestNG framework

---

## 🚀 How It Works

1. Opens Amazon website
2. Searches for:
   - iPhone
   - Samsung Galaxy
3. Tries to click first product
4. Attempts further actions (if elements are available)
5. Closes browser automatically

---

## ⚠️ Limitations

- Amazon website is highly dynamic
- Product elements may not always be detected
- "Add to Cart" button is not consistently available
- Page structure changes frequently (A/B testing)
- Timing issues due to dynamic loading

---

## ▶️ How to Run

### 1. Prerequisites

- Java JDK installed
- Maven installed
- Google Chrome installed

---

### 2. Clone the Repository
git clone https://github.com/your-username/your-repo-name.git

---

### 3. Navigate to Project Folder
cd your-repo-name

---

### 4. Run the Tests
mvn test

---

## 📊 Console Output
Galaxy product not found
iPhone product not found

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS

---

## 📂 Project Structure
Amazon-Automation/
├── src/
│ └── test/
│ └── java/
│ └── tests/
│ └── AmazonTests.java
├── pom.xml
├── testng.xml
├── README.md
---

## 🧠 What You'll Learn

- Selenium WebDriver basics
- Handling dynamic web elements
- TestNG test execution
- Exception handling in automation
- Real-world automation challenges

---

## ✅ Interview Points

- Handles dynamic UI scenarios
- Uses exception handling for stability
- Demonstrates real-world limitations of automation
- Successfully executes tests with Maven + TestNG
- Clean and understandable code structure

---

## 🔮 Future Improvements

- Improve element locators
- Implement Explicit Waits fully
- Add "Add to Cart" functionality
- Use Page Object Model (POM)
- Add reporting (Extent Reports)

---

## 👨‍💻 Author

Made by **Devisetty Rohith**  
B.Tech CSE (Data Science) Student  
Learning Automation Testing & Full Stack Development

---

## 📬 Contact

📧 Email: devisettyrohith@gmail.com  
🔗 GitHub Profile: https://github.com/Rohith-sys18  
📂 Project Repository: https://github.com/Rohith-sys18/Amazon-UI-Automation-Testing-Selenium-TestNG-

Feel free to connect or reach out!
