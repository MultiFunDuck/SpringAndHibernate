package app;

import java.util.HashSet;
import java.util.Set;

public class FloatNumber implements Number{
    private float number;

    FloatNumber(float number){
        this.number = number;
    }

    @Override
    public String getВсёЧисло() {
        return String.valueOf(number);
    }

    @Override
    public int getЦелаяЧасть() {
        return (int)number;
    }

    @Override
    public Object getДробаяЧасть() {
        return number - getЦелаяЧасть();
    }

    public Set<Integer> numberToSet(){
        Set<Integer> numSet = new HashSet<>();
        int number = getЦелаяЧасть();
        while(number!=0){
            numSet.add(number%10);
            number = (number - number%10)/10;
        }
        return numSet;
    }
}
