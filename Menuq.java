import javax.swing.*;

import java.awt.event.*;

class JMenuBarTest extends JFrame
{
    private static final long serialVersionUID = 1L;
    private  final  String[][]  menuFile =
            {{"Абитурент"     ,  "А",  "", ""},
                    {"Сбор документов"  ,  "О", "O", ""},
                    {"Сдать документов",  "С", "S", ""}};
    private  final  String[][]  menuEdit =
            {{"Сдать ЕНТ" , "E",  "", ""},
                    {"Предмет"  , "П", "X", "images/cut.png"},
                    {"Балл", "Б", "C", "images/copy.png"}};

    private JMenu createMenuItems(final String[][] items)
    {

        JMenu menu = new JMenu(items[0][0]);
        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++) {

            JMenuItem item = new JMenuItem(items[i][0]);
            item.setMnemonic(items[i][1].charAt(0));
            item.setAccelerator(KeyStroke.getKeyStroke(items[i][2].charAt(0),
                    KeyEvent.CTRL_MASK));
            if (items[i][3].length() > 0)
                item.setIcon(new ImageIcon(items[i][3]));
            menu.add(item);
        }
        return menu;
    }

    private JMenu createSubmenus()
    {
        JMenu text = new JMenu("Студент");

        JMenu style = new JMenu("Студент");
        JMenuItem bold = new JMenuItem("Абитурент");
        JMenuItem italic = new JMenuItem("Очник");
        JMenu font = new JMenu("СутдентЗаочник");
        JMenuItem arial = new JMenuItem("Aбитурент");
        JMenuItem times = new JMenuItem("Заочник");
        font.add(arial); font.add(times);
     
        style.add(bold);
        style.add(italic);
        style.addSeparator();
        style.add(font);
        text.add(style);
        return text;
    }
    //--------------------------------------------------------
    public JMenuBarTest() {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenuItems(menuFile));

        menuBar.add(createMenuItems(menuEdit));

        menuBar.add(createSubmenus());


        menuBar.add(Box.createHorizontalGlue());

        JLabel exit = new JLabel(new ImageIcon("images/exit.png"));
        exit.setText("Выход");
        exit.setBorder(BorderFactory.createEtchedBorder());
        menuBar.add(exit);


        setJMenuBar(menuBar);

        setSize(300, 200);
        setVisible(true);
    }
    //--------------------------------------------------------
    public static void main(String[] args)
    {

        JFrame.setDefaultLookAndFeelDecorated(true);
        new JMenuBarTest();
    }
}