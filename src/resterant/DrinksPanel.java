/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resterant;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.CheckBox;
import javax.swing.*;

/**
 *
 * @author Eng-mahmoud
 */
public class DrinksPanel extends JPanel implements  ActionListener{
    
    private JCheckBox Tea;
    private JCheckBox Coffee;
    
    private final  double Teaprice = 2.0;
    private final double Coffeeprice = 4.0;
    public static  double totaldrinkprice = 0.0;
    public DrinksPanel ()
    {
        Tea = new JCheckBox("Tea 2$");
        Coffee = new JCheckBox("Coffee 4$");
        setLayout(new GridLayout(2,1));
        setBorder(BorderFactory.createTitledBorder("DrinkMeal"));
        
        
        Tea.addActionListener(this);
        Coffee.addActionListener(this);
        add(Tea);
        add(Coffee);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == Tea)
        {
            if(Tea.isSelected() == true)
            {
                totaldrinkprice += Teaprice;
            }
            else
            {
                 totaldrinkprice -= Teaprice;   
            }
        }
        if(e.getSource() == Coffee)
        {
            if(Coffee.isSelected() == true)
            {
                totaldrinkprice += Coffeeprice;
            }
            else
            {
                 totaldrinkprice -= Coffeeprice;   
            }
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
