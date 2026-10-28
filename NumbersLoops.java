public class NumbersLoops{
    public NumbersLoops(){
      //while that prints 0-10
      int index = 0;
      while(index < 11){
        System.out.println(index);
        index++;
      }
      System.out.println("what is the index now:" + index);

      //for i that prints 0-10
      for(int index2 = 0; index2 < 11; index2++){
        System.out.println(index2);
      }
    }
  
    public int digitSum(int num){
      int sum = 0;
      for(int index3 = 0; index3 <= num; index3++){
       sum = sum + index3;
      }
      return sum;
    }
  
    public int reverseNum(int num){
      //123 mod 10 __> 3
      //123/10 --> 12
      //12 mod 10 --> 2
      //12/10 --> 1
      //1 mod 10 --> 1
      //1/10 --> 0
      // how are you going to 3...32...321
      int newNum = 0;
      while(num != 0){
        newNum = newNum*10 + (num % 10);
        //use mod
        //use int division
        //mathy oment to build newNum
        num /= 10;
      }
      return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    int count = 0;
    public int palindromeCount(int start, int finish){
      for(int x = start; x <= finish; x++){
        if(x == reverseNum(x))
          ++count;
      }
      return count;
    }
  
  
  }
