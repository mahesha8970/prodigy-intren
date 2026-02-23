📌 Interactive Navigation Menu
📖 Project Description

This project is a simple Interactive Navigation Menu built using HTML, CSS, and JavaScript.

The navigation bar:

Stays fixed at the top of the page

Changes background color when the user scrolls

Has hover effects on menu items

Uses smooth styling with CSS transitions

🚀 Features

✅ Fixed navigation bar
✅ Scroll detection using JavaScript
✅ Dynamic background color change on scroll
✅ Hover effect on menu links
✅ Responsive meta viewport added

🛠️ Technologies Used

HTML5

CSS3

JavaScript (Vanilla JS)

📂 Project Structure
task-1/
│── index.html

(All HTML, CSS, and JavaScript are written inside a single HTML file.)

⚙️ How It Works

The navbar is fixed using:

position: fixed;
top: 0;

When the page scrolls more than 50px, JavaScript adds a class:

window.addEventListener("scroll", function() {
    if (window.scrollY > 50) {
        navbar.classList.add("scrolled");
    }
});

The .scrolled class changes the background color:

nav.scrolled {
    background-color: #ff5733;
}
💻 How to Run the Project

Download or clone the repository

git clone https://github.com/your-username/your-repo-name.git

Open the file:

index.html

Run it in your browser.

📸 Output

Initially → Dark navbar (#333)

On scroll → Orange navbar (#ff5733)

On hover → Text becomes yellow and slightly larger

🎯 Learning Outcome

From this project, you can understand:

How to use addEventListener

How to manipulate classes using JavaScript

How to create hover effects

How to build a simple responsive navigation bar

👨‍💻 Author

Mahesha
