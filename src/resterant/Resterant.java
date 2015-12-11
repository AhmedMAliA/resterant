/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resterant;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Eng-mahmoud
 */
public class Resterant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        
        window.setLayout(new BorderLayout());
        TitlePanel TP = new TitlePanel();
        MealsPanel MP = new MealsPanel();
        DrinksPanel DP = new DrinksPanel();
        CalctotalPrice CP = new CalctotalPrice();
        window.add(TP,BorderLayout.NORTH);
        window.add(MP,BorderLayout.WEST);
        window.add(DP,BorderLayout.CENTER);
        window.add(CP,BorderLayout.SOUTH);
        window.setTitle("MY RES");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        
        // TODO code application logic here
    }
    
}
