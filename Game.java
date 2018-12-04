import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Game extends JFrame
{
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    int AC_Milan = 0;
    int Real_Madrid = 0;
    String last_Scorer = "N/A";
    String _Winner = "Winner: DRAW";

    public Game()
    {
        super("Game");
        setSize(700,300);
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        add(new JPanel());
        add(last);
        add(new JPanel());
        add(milan);

        milan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                AC_Milan++;
                last_Scorer = "AC Milan";
                _Winner = ((AC_Milan > Real_Madrid) ? "Winner: AC Milan" : "Winner: Real Madrid");
                if (AC_Milan == Real_Madrid) _Winner = "Winner: DRAW";
                result.setText("Result: " + AC_Milan + " X " + Real_Madrid);
                last.setText("Last Scorer: " + last_Scorer);
                winner.setText(_Winner);
            }
        });



        add(result);
        add(madrid);

        madrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                Real_Madrid++;
                last_Scorer = "Real Madrid";
                _Winner = ((AC_Milan > Real_Madrid) ? "Winner: AC Milan" : "Winner: Real Madrid");
                if (AC_Milan == Real_Madrid) _Winner = "Winner: DRAW";
                result.setText("Result: " + AC_Milan + " X " + Real_Madrid);
                last.setText("Last Scorer: " + last_Scorer);
                winner.setText(_Winner);
            }

        });

        add(new JPanel());
        add(winner);
        add(new JPanel());
        setVisible(true);

    }
    public static void main(String[] args)
    {
        new Game();
    }
}

