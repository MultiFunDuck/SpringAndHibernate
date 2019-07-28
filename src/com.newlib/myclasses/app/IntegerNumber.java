package app;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class IntegerNumber implements Number {
    private int number;

    IntegerNumber(int number){
        this.number = number;
    }

    @Override
    public String getВсёЧисло() {
        return String.valueOf(number);
    }

    @Override
    public int getЦелаяЧасть() {
        return number;
    }

    @Override
    public Object getДробаяЧасть() {
        return "Какая ещё дробная часть у целого числа? Ебобо?";
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
