/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magic.Design;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author KeerthanaaKannan
 */


public class MagicTable extends DefaultTableCellRenderer {

    
   public MagicTable() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable myTable, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(myTable, value, selected, focused, row, column);
        setBackground(new java.awt.Color(241, 250, 238)); 
        setForeground(new java.awt.Color(0,0,0));
        myTable.setFillsViewportHeight(true);
        setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myTable.setShowGrid(true);
        TableCellRenderer rendererFromHeader = myTable.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        return this;
    }
}