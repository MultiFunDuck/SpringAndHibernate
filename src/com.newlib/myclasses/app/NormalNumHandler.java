package app;

public class NormalNumHandler implements NumberHandler {
    private Number number;

    NormalNumHandler(Number number){
        this.number = number;
    }

    public void setNumber(Number number){
        this.number = number;
    }

    @Override
    public void printnNum() {
        System.out.println("Number "+number.getВсёЧисло()+
                " состоит из целой части: "+number.getЦелаяЧасть()+
                " и дробной части: "+number.getДробаяЧасть());
    }

    @Override
    public int numProduct() {
        int numProduct = 1;

        for(int цифра:number.numberToSet()){
            numProduct = numProduct*цифра;
        }
        return numProduct;
    }
}
