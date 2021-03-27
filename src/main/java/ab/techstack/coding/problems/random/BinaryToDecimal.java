package ab.techstack.coding.problems.random;

public class BinaryToDecimal {

    public int convertBinaryToDecimal(Integer binary){  //101

        //101
        //               1*2^2+0*2^1+1*2^0
int result = 0;
        int multiplyer = 1;
        while(binary!=0){
            int reminder = binary%10;
            binary = binary/10;
           result = result + (reminder * multiplyer);
            multiplyer = multiplyer*2;

        }


        return result;
    }
}
