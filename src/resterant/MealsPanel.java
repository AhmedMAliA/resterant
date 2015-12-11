/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resterant;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Eng-mahmoud
 */
public class MealsPanel extends JPanel implements ActionListener{
    
    private JRadioButton Meat;
    private JRadioButton Chicken;
    private JRadioButton Pizza;
    private JRadioButton Burger;
    private JRadioButton Fish;
    
    private ButtonGroup BG; 
    private final double meatprice = 100;
    private final double chickenprice = 25;
    private final double pizzaprice = 30;
    private final double burgerprice = 20;
    private final double fishprice = 150;
    public static double totalmealprice = 0.0;
    public MealsPanel ()
    {
        BG = new ButtonGroup();
        setLayout(new GridLayout(5,1));
        setBorder(BorderFactory.createTitledBorder("MealsMenu"));
        
        Meat = new JRadioButton("Meat 100$");
        Meat.setForeground(Color.red);
// lama t2doos 3ala meat roo7 le action performed 
        Meat.addActionListener(this);
        Chicken = new JRadioButton("Chicken 25$");
        Chicken.addActionListener(this);
        Pizza = new JRadioButton("Pizza 30$");
        Pizza.addActionListener(this);
        Burger = new JRadioButton("Burger 20$");
        Burger.addActionListener(this);
        Fish = new JRadioButton("Fish 150$");
        Fish.addActionListener(this);
        
        BG.add(Meat);
        BG.add(Chicken);
        BG.add(Pizza);
        BG.add(Burger);
        BG.add(Fish);
        
        add(Meat);
        add(Chicken);
        add(Pizza);
        add(Burger);
        add(Fish);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(Meat.isSelected() == true)
        {
            totalmealprice = meatprice;
        }
        if(Chicken.isSelected() == true)
        {
            totalmealprice = chickenprice;
        }
        if(Pizza.isSelected() == true)
        {
            totalmealprice = pizzaprice;
        }
        if(Burger.isSelected() == true)
        {
            totalmealprice = burgerprice;
        }
        if(Fish.isSelected() == true)
        {
            totalmealprice = fishprice;
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    


}


