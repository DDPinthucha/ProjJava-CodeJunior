import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class CSS {
        public static void main(String[] args) throws InterruptedException {

                JFrame window = new JFrame("Quiz Game");
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
                                        new quiz2("What does CSS stand for?", "Cascading Style Sheets",
                                                        "Creative Style Sheets",
                                                        "Computer Style Sheets", "Cool Style Sheets",
                                                        "Cascading Style Sheets",
                                                        "hint 1"),
                                        new quiz2("What is the tag used to set the background color in CSS?",
                                                        "background-color",
                                                        "font-size",
                                                        "margin",
                                                        "color", "background-color",
                                                        "hint2"),
                                        new quiz2("What property is used to set the font size in CSS?", "font-size",
                                                        "font-color",
                                                        "text-align",
                                                        "<span>",
                                                        "font-size",
                                                        "hint 3"),
                                        new quiz2("What property is used to set margins in CSS?", "border", "padding",
                                                        "margin",
                                                        "width", "margin", "hint 4"),
                                        new quiz2("What are the tags used for styling in CSS?", "<style>", "<script>",
                                                        "<link>",
                                                        "<meta>", "<style>", "hint 4"),
                                        new quiz2("What property is used to define line thickness in CSS?", "border",
                                                        "padding",
                                                        "margin",
                                                        "width", "border", "hint 4"),
                                        new quiz2("What property is used to define content in CSS?", "display",
                                                        "position",
                                                        "float",
                                                        "clear", "display", "hint 4"),
                                        new quiz2("Which property is used to specify the background color of an element in CSS?",
                                                        "background-imageorder",
                                                        "background-color",
                                                        "background-repeat",
                                                        "background-size", "background-color", "hint 4"),
                                        new quiz2("Which CSS property is used to create a responsive design for different screen sizes?",
                                                        "media queries",
                                                        "@import",
                                                        "font-face",
                                                        "position", "media queries", "hint 4"),
                                        new quiz2("What property is used to define text scrolling in CSS?",
                                                        "overflow",
                                                        "position",
                                                        "display",
                                                        "float", "overflow", "hint 4")
                        };

                        while (nbr != qObj.length && s < time) {
                                questions css = new questions(qObj[nbr], window);
                                css.getAnswer(time);
                                score = css.getScore();
                                if (nbr == qObj.length - 1 || (s == time))
                                        css.Reset();
                                nbr++;
                        }

                        int nbrQ = qObj.length;
                        scorePane scorePane = new scorePane(window, score, nbrQ);
                        scorePane.choose();

                }

        }
}