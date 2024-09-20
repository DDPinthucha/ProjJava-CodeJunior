import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class HTML {
  public static void main(String[] args) throws InterruptedException {

    JFrame window = new JFrame("Quiz Game!!");
    window.setSize(1280, 720);
    window.setLocationRelativeTo(null);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);

    while (true) {

      int nbr = 0, score = 0, m = 0, s = 0;
      int time = 60; // sec

      welcomePage welcome = new welcomePage(window);
      welcome.choose(time);

      quiz2[] qObj = {
          new quiz2("What does HTML stand for?", "Hyper Text Markup Language", "Home Tool Markup Language",
              "Hot Text Markup Language", "High Text Markup Language", "Hyper Text Markup Language", "hint 1"),
          new quiz2("What is used to open a tag in HTML?", "[", "/", "<", ">", "<", "hint2"),
          new quiz2("What is the tag used for creating a link in HTML?", "<img>", "<a>", "<div>", "<span>", "<a>",
              "hint 3"),
          new quiz2("What is used to set the background color in HTML?", "color", "font-size", "background-color",
              "text-align", "color", "hint 4"),
          new quiz2("What is the tag used for listing items in HTML?", "<ul>", "<li>", "<ol>", "<dl>", "<ul>",
              "hint 3"),
          new quiz2("What is the <canvas> command used for in HTML?", "is used to display content as an image",
              "is used to display graphics and charts", "is used to collect data from users",
              "is used to display captions/subtitles under images", "is used to display graphics and charts",
              "hint 3"),
          new quiz2("The HTML tag <progress> is used to represent the progress of a task or process in HTML",
              "is used to display downloadable content", "is used to control music on a website",
              "is used to scroll the content of a web page", "is used to show the progress of a program or application",
              "is used to scroll the content of a web page",
              "hint2"),
          new quiz2("What is the HTML tag used for displaying text?", "<img>", "<picture>", "<figure>", "<canvas>",
              "<img>", "hint2"),
          new quiz2(

              "In HTML, what should I do if I want the content of the <div> tag to be displayed in a fixed size browser window box?",
              "Use the command display: inline;", "Use the command display: block;",
              "Use the command display: inline-block;", "Use the command display: flex;",
              "Use the command display: block;", "hint2"),
          new quiz2("In HTML, what are the benefits of using the <header> header?", "Help the website look beautiful",

              "Help users to load websites faster", "Help standardize the website",
              "Make it easier for users to access different parts of the website",
              "Make it easier for users to access different parts of the website", "hint2"),

      };

      while (nbr != qObj.length && s < time) {
        questions html = new questions(qObj[nbr], window);
        html.getAnswer(time);
        score = html.getScore();
        if (nbr == qObj.length - 1 || (s == time))
          html.Reset();
        nbr++;
      }

      int nbrQ = qObj.length;
      scorePane scorePane = new scorePane(window, score, nbrQ);
      scorePane.choose();

    }

  }
}