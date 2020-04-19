public class Cup {

    private Dice[] dices;
    private int totalValue;
    public Cup(Dice[] dices){
        this.dices = dices;
    }

    public void roll(){
        for (int i = 0; i < dices.length; i++) {
            dices[i].roll();
            totalValue += dices[i].getFaceValue();
        }
    }

    public int getTotal(){
        return totalValue;
    }



}
