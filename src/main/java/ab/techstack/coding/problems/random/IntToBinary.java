package ab.techstack.coding.problems.random;

public class IntToBinary {

    public String intToBinary(int number){
        String binary ="";
        StringBuffer c = new StringBuffer();

//       String  binary = Integer.toBinaryString(number);

//        OR

        while(number!= 0){
            int reminder = number%2;
            number = number/2;
            c = c.append(reminder);
        }
        return c.reverse().toString();
    }
}
