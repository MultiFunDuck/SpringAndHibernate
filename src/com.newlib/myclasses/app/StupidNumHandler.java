package app;

import java.util.Date;

public class StupidNumHandler implements NumberHandler {
    private Number number;
    StupidNumHandler(Number number){
        this.number = number;
    }

    public void setNumber(Number number){
        this.number = number;
    }

    @Override
    public void printnNum() {
        System.out.println(" А я не собираюсь тебе печатать нихуя, потому что ты пидр, и сейчас "+(new Date().toString()));
    }

    @Override
    public int numProduct() {
        int numProduct = 1;

        for(int цифра:number.numberToSet()){
            numProduct = numProduct*цифра*(int)(Math.random()*100);
        }
        return numProduct;
    }
}
