package pkg2048;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Slot {    
    public static Color getColor(int value){
        switch (value){
            case    2: return new Color(0xEE, 0xE4, 0xDA);
            case    4: return new Color(0xED, 0xE0, 0xC8);
            case    8: return new Color(0xF2, 0xB1, 0x79);
            case   16: return new Color(0xF5, 0x95, 0x63);
            case   32: return new Color(0xF6, 0x7C, 0x5F);
            case   64: return new Color(0xF6, 0x5E, 0x3B);
            case  128: return new Color(0xED, 0xCF, 0x72);
            case  256: return new Color(0xED, 0xCC, 0x61);
            case  512: return new Color(0xED, 0xC8, 0x50);
            case 1024: return new Color(0xED, 0xC5, 0x3F);
            case 2048: return new Color(0xED, 0xC2, 0x2E);
            case 4096: return new Color(0x3E, 0x39, 0x33);
            default:   return new Color(0xCC, 0xC0, 0xB3);
        }
    }
    
    public static Font getFont(int value){
        String name = "Dialog";
        int style = Font.BOLD;
        int numDigits = (int)Math.ceil(Math.log10(value)) + 1;
        int size = 36 - 6*(numDigits-1);
        
        return new Font(name, style, size);
    }
    
    protected JButton button;
    public boolean isMerged = false;
    
    public Slot(JButton jb){
        this.button = jb;
        this.clear();
    }
        
    public boolean isEmpty(){
        return !this.button.isEnabled();
    }
    
    public void clear(){
        this.button.setEnabled(false);
        this.button.setText("");
        this.button.setBackground(Slot.getColor(0));
    }
    
    public void setValue(int value){
        this.button.setEnabled(true);
        this.button.setFont(Slot.getFont(value));
        this.button.setText(String.valueOf(value));
        this.button.setBackground(Slot.getColor(value));
    }
    
    public Integer getValue(){
        if (this.isEmpty()) return null;
        return Integer.valueOf(this.button.getText());
    }
    
    public boolean merge(Slot dest){        
        if (this.isEmpty() || dest.isEmpty() || dest.isMerged)
            return false;
                
        int valueSrc = (int) this.getValue();
        int valueDest = (int) dest.getValue();
        
        if (valueSrc != valueDest)
            return false;
        
        this.clear();
        dest.setValue(valueDest*2);
        dest.isMerged = true;
        
        return true;
    }

    public boolean isEqual(Slot s){
        if (s == null)
            return false;
        
        if (this.isEmpty() && s.isEmpty())
            return true;
        
        return (int)this.getValue() == (int)s.getValue();
    }
}
