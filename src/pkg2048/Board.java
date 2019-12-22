package pkg2048;

public class Board { 
    protected Slot[][] slots;   
    public int numSlots = 0;
    private static Board board;
   
    public static Board getInstance(){
        if (board == null)
            board = new Board();
        
        return board;
    }
    
    private Board(){
        this.slots = new Slot[4][4];
    }
    
    public boolean isFull(){
        return this.numSlots == 16;
    }
 
    public void addSlot(Slot s, int l, int c){
        this.slots[l][c] = s;
    }
    
    public Slot getSlot(int l, int c){
        return this.slots[l][c];
    }
    
    public Slot getSlotAbove(int l, int c){
        if (l == 0) return null;
        return this.slots[l-1][c];
    }
    
    public Slot getSlotBelow(int l, int c){
        if (l == 3) return null;
        return this.slots[l+1][c];
    }
    
    public Slot getSlotAtLeft(int l, int c){
        if (c == 0) return null;
        return this.slots[l][c-1];
    }
    
    public Slot getSlotAtRight(int l, int c){
        if (c == 3) return null;
        return this.slots[l][c+1];
    }
    
    public boolean moveSlot(Slot s, int l, int c){
        Slot dest = this.slots[l][c];
        if (!dest.isEmpty())
            return false;
        
        dest.setValue(s.getValue());
        s.clear();
        return true;
    }
    
    public boolean setValue(int value, int l, int c){
        Slot s = this.slots[l][c];
        if (!s.isEmpty())
            return false;
        
        s.setValue(value);
        ++this.numSlots;
        return true;
    }
    
    public void clearMergedStates(){
        for (Slot[] lin: this.slots)
            for (Slot s: lin)
                s.isMerged = false;
    }
    
    public void moveUp(){
        int l;
        Slot slot, slotAbove;
        for (int i = 1; i < 4; i++){
            for (int j = 0; j < 4; j++){
                l = i;
                slot = this.getSlot(l, j);
                slotAbove = this.getSlotAbove(l, j);
                
                if (slot.isEmpty())
                    continue;
                
                while (true){
                    if (slotAbove == null)
                        break;
                    
                    if (slot.merge(slotAbove)){
                        --this.numSlots;
                        break;
                    }
                    
                    if (!slotAbove.isEmpty())
                        break;
                    
                    this.moveSlot(slot, --l, j);
                    slot = this.getSlot(l, j);
                    slotAbove = this.getSlotAbove(l, j);
                }
            }
        }
        
        this.clearMergedStates();
    }
    
    public void moveDown(){
        int l;
        Slot slot, slotBelow;
        for (int i = 3; i >= 0; i--){
            for (int j = 0; j < 4; j++){
                l = i;
                slot = this.getSlot(l, j);
                slotBelow = this.getSlotBelow(l, j);
                
                if (slot.isEmpty())
                    continue;
                
                while (true){
                    if (slotBelow == null)
                        break;
                    
                    if (slot.merge(slotBelow)){
                        --this.numSlots;
                        break;
                    }
                    
                    if (!slotBelow.isEmpty())
                        break;
                    
                    this.moveSlot(slot, ++l, j);
                    slot = this.getSlot(l, j);
                    slotBelow = this.getSlotBelow(l, j);
                }
            }
        }
        
        this.clearMergedStates();
    }
    
    public void moveLeft(){
        int c;
        Slot slot, slotLeft;
        for (int j = 1; j < 4; j++){
            for (int i = 0; i < 4; i++){
                c = j;
                slot = this.getSlot(i, c);
                slotLeft = this.getSlotAtLeft(i, c);
                
                if (slot.isEmpty())
                    continue;
                
                while (true){
                    if (slotLeft == null)
                        break;
                    
                    if (slot.merge(slotLeft)){
                        --this.numSlots;
                        break;
                    }
                    
                    if (!slotLeft.isEmpty())
                        break;
                    
                    this.moveSlot(slot, i, --c);
                    slot = this.getSlot(i, c);
                    slotLeft = this.getSlotAtLeft(i, c);
                }
            }
        }
        
        this.clearMergedStates();
    }
    
    public void moveRight(){
        int c;
        Slot slot, slotRight;
        for (int j = 3; j >= 0; j--){
            for (int i = 0; i < 4; i++){
                c = j;
                slot = this.getSlot(i, c);
                slotRight = this.getSlotAtRight(i, c);
                
                if (slot.isEmpty())
                    continue;
                
                while (true){
                    if (slotRight == null)
                        break;
                    
                    if (slot.merge(slotRight)){
                        --this.numSlots;
                        break;
                    }
                    
                    if (!slotRight.isEmpty())
                        break;
                    
                    this.moveSlot(slot, i, ++c);
                    slot = this.getSlot(i, c);
                    slotRight = this.getSlotAtRight(i, c);
                }
            }
        }
        
        this.clearMergedStates();
    }
}
