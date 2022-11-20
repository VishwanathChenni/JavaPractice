package practice;

import org.junit.jupiter.api.Test;

public class QuotientAndReminder {
    int devidend=30;
    int divisior=4;
    @Test
    public void fnQuotientAndReminder(){
        int Quotient=devidend%divisior;
        System.out.println(Quotient);
    }


}
