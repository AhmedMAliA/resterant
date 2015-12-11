/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resterant;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Eng-mahmoud
 */
public class CalctotalPrice  extends JPanel implements ActionListener{
    
    JButton B1 = new JButton("Calculate");
    JTextField Text = new JTextField(10);
    
    
    public CalctotalPrice ()
    {
        setBorder(BorderFactory.createTitledBorder("Total"));
        setLayout(new FlowLayout());
        add(B1);
        B1.addActionListener(this);
        add(Text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       double total =  MealsPanel.totalmealprice + DrinksPanel.totaldrinkprice;
       Text.setText(total + " ");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
