public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        this.top=0;
        this.bottom=0;
    }
    public Domino(int t, int b){
        this.top=t;
        this.bottom=b;
    }
    public int getTop(){
        return this.top;
    }

    public int getBottom() {
        return this.bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    //fraction form
    public String toString(){
        return this.top+"/"+this.bottom;
    }
    //flip() - switches the order of the top and bottom values.
    public void flip(){
        int temp=this.top;
        this.top=this.bottom;
        this.bottom=temp;
    }

    public void settle(){
        if(top>bottom){
            flip();
        }
    }

    public int compareTo(Domino other){
        this.settle(); //make sure top is smaller
        other.settle();
        if(this.top<other.getTop()){
            return -1;
        }else if(this.top>other.getTop()){
            return 1;
        }else{
            if(this.bottom<other.getBottom()){
                System.out.println();
                return -1;
            }else if(this.bottom>other.getBottom()){
                return 1;
            }else{
                return 0;
            }
        }
    }
//Counts the total number of dots on each ½ of the Domino and compares it to the total number on the other domino.
    public int compareToWeight(Domino other){
        this.settle();
        other.settle();
        int x=this.top+this.bottom;
        int y = other.getBottom()+other.getTop();
        if(x<y){
            return -1;
        }else if(x>y){
            return 1;
        }else{
            return 0;
        }
    }
    public boolean canConnect(Domino other){
        if(this.top==other.getTop()){
            return true;
        }else if(this.top==other.getBottom()){
            return true;
        }else if(this.bottom==other.getBottom()){
            return true;
         }else if(this.bottom==other.getTop()){
            return true;
        }
        return false;
    }


}
