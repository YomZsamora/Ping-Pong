# Ping-Pong
Ping Pong application. Enter a number. It counts up to that number, replacing numbers divisible by 3 with "ping", numbers divisible by 5 with "pong" and numbers divisible by both with "ping pong".

## Prerequisites
- Have Gradle & JDK installed.

### Technologies Used
- openJDK-17
- Gradle 7.4.2
- JUnit Jupiter 5.8.1

### Setup/Installation Requirements
* To run the application, in your terminal:

    1. Open terminal and Clone or download the Repository `https://github.com/YomZsamora/Ping-Pong.git`
    2. cd into `Ping-Pong`
    3. Compile `gradle compileJava`
    4. cd into `Ping-Pong/build/classes/java/main  `
    5.  Run this command `java App` to run the app

## Behavior Driven Development
BDD(Behavior Driven Development) focuses on users being able to provide a random number.  It counts up to that number, replacing numbers divisible by 3 with "ping", numbers divisible by 5 with "pong" and numbers divisible by both with "ping pong". 

This requires users to input a random number, submit and wait for result.

| Input                                         |                                    output                                     |                                                                 Purpose |
|:----------------------------------------------|:-----------------------------------------------------------------------------:|------------------------------------------------------------------------:|
| Run the App                                   |                  get a brief intro message to enter a number                  |                                                   Provide Random Number |
| User enters a random number                   |    ArrayList showing divisibility with 3 and/or 5 up to the provide number    |                                Identify Numbers Divisible by 3 and/or 5 |

### Development

Want to contribute? Great!

To fix a bug or enhance an existing module, follow these steps:

- Fork the repo
- Create a new branch (`git checkout -b improve-feature`)
- Make the appropriate changes in the files
- Add changes to reflect the changes made
- Commit your changes (`git commit -am 'Improve feature'`)
- Push to the branch (`git push origin improve-feature`)
- Create a Pull Request

### License

*MIT*
Copyright (c) 2022 **Yommie Samora**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.