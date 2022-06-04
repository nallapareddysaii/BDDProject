Feature: To validate Adactin hotel app login Functionality

Scenario: To validate Login using valid credentials

Given User opens "chrome" browser
And User launches app URL using "https://adactinhotelapp.com/"
When User enters text "reyaz0310" in textbox using xpath "//input[@name='username']"
When User enters text "reyaz123" in textbox using xpath "//input[@name='password']"
When User clicks button using xpath "//input[@name='login']"
Then validate title to be "Adactin.com - Search Hotel"

@tag0528
Scenario Outline: To validate Login using Invalid credentials

Given User opens "chrome" browser
And User launches app URL using "https://adactinhotelapp.com/"
When User enters text '<username>' in textbox using xpath "//input[@name='username']"
When User enters text '<password>' in textbox using xpath "//input[@name='password']"
When User clicks button using xpath "//input[@name='login']"
Then validate title to be '<expectedTitle>'

Examples: 
| username | password | expectedTitle |
| reyaz0310 | reyaz456 | Adactin.com - Hotel Reservation System |
| reyaz1212 | reyaz123 | Adactin.com - Hotel Reservation System |
| reyaz1212 | reyaz456 | Adactin.com - Hotel Reservation System |