
public class MagicSquareFactory {

    MagicSquare square;
    int[] position;
    int toAssign;
    int maxCount;
    int size;
    
    public MagicSquare createMagicSquare(int size) {
        this.size = size;
        this.square = new MagicSquare(size);
        
        this.position = new int[2];
        position[0] = 0;
        position[1] = (int)(size/2);
        
        this.toAssign = 1;
        
        this.maxCount = size*size;
        
        while(toAssign<=maxCount) {
            square.placeValue(position[1], position[0], toAssign);
                
            toAssign++;
            
            nextCell();
        }
        
        return square;
    }
    
    private void nextCell() {
        if(this.square.readValue(nextColumn(), nextRow())!=0) {
            this.position[0] = incrRow();
        } else {
            this.position[0] = nextRow();
            this.position[1] = nextColumn();
        }
    }
    
    private int nextRow() {
        int row = this.position[0];
        
        if(row-1<0) {
            row = this.size-1;
        } else {
            row--;
        }
        
        return row;
    }
    
    private int nextColumn() {
        int column = this.position[1];
        
        if(column+1 > this.size-1) {
            column = 0;
        } else {
            column++;
        }
        
        return column;
    }
    
    private int incrRow() {
        int row = this.position[0];
        
        if(row+1 > this.size-1) {
            row = 0;
        } else {
            row++;
        }
        
        return row;
    }
}
