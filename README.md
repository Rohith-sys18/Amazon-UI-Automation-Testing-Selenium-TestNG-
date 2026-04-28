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

