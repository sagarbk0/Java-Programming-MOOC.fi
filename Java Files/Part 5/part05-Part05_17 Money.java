
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        int totalEuros=this.euros+addition.getEuros();
        int totalCents=this.cents+addition.getCents();
        if(totalCents>99){
            totalEuros+=totalCents/100;
            totalCents=totalCents%100;
        }
        Money newMoney = new Money(totalEuros,totalCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(compared.getEuros()>this.euros) {
            return true;
        } else if(compared.getEuros()<this.euros){
            return false;
        } else if(compared.getCents()>this.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int totalEuros=this.euros-decreaser.getEuros();
        int totalCents=0;
        if(this.cents<decreaser.getCents()){
            totalCents=100-this.cents-decreaser.getCents();
            totalEuros--;
        } else {
            totalCents=this.cents-decreaser.getCents();
        }
        if(totalEuros<0){
            return new Money(0,0);
        }
//        if(totalCents<0){
//            totalEuros-=1;
//            totalCents=Math.abs(totalCents);
//        }
        return new Money(totalEuros,totalCents);
    }
    
    public int getEuros() {
        return euros;
    }

    public int getCents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
