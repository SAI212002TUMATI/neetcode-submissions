class Solution {
    public String multiply(String num1, String num2) {

        if(num1.equals("0")||num2.equals("0")){     //If Either num is 0,result is 0
            return "0";
        }
        int n=num1.length();
        int m=num2.length();

        int []result=new int[n+m];          //max possible length of the answer n+m

        for(int i=n-1;i>=0;i--){            //start multiplying from last digit
            for(int j=m-1;j>=0;j--){
                int digit1=num1.charAt(i)-'0';
                int digit2=num2.charAt(j)-'0';      //convert char into digit to integer

                int product=digit1*digit2+result[i+j+1]; //Multiply and add value ,if any at that pos
                result[i+j+1]=product%10;       //store the current digit
                result[i+j]+=product/10;        //Add the carry to the previous pos
            }
        }
        StringBuilder answer = new StringBuilder();

        for(int digit:result){                  //convert the result array into a string
            if(answer.length() ==0 && digit==0){        //skip leading zeroes
                continue;
            }
            answer.append(digit);
        }
        return answer.toString();
        
    }
}
