import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button btnE = new Button("Exit");
    private Button btnAdd = new Button("Add");
    private Label lab = new Label("0");
    private int n=0;
    public MainFrame(){
        setLayout(null);
        btnE.setSize(100,60);
        btnAdd.setSize(100,60);
        lab.setSize(100,100);
        lab.setLocation(200,50);
        btnE.setLocation(20,20);
        btnAdd.setLocation(20,80);
        btnE.setBackground(new Color(255, 31, 10));
        this.add(btnE);
        this.add(btnAdd);
        this.add(lab);
        init();
    }
    private void init(){
    setBounds(50,50,500,500);



        btnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            });
        btnAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   n++;
                   lab.setText(Integer.toString(n));
                }
            });
        this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           System.exit(0);
        }
    });
    }
}
