package hr.patrik;


import java.awt.EventQueue;

import javax.swing.JFrame;


public class Tanks extends JFrame{
	
	private final int WIDTH = 1000;
	private final int HEIGTH = 1000;
	
	public Tanks() {
        initUI();
    }

    private void initUI() {

        add(new Board(WIDTH,HEIGHT));

        setSize(WIDTH,HEIGTH);
        setResizable(false);
        
        setTitle("Tanks Alpha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Tanks tanks;
					tanks = new Tanks();
					tanks.setVisible(true);
				}                
        });
    }

}
