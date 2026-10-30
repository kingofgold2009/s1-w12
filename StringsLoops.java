public class StringsLoops{
    public StringsLoops(){
  
    }
  //string destroy loop
  //string stays intact
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }
      return count;
    }
  //"sean", 3 --> "seanseansean"
  //concatenation means join --> "+"
    public String copy(String s, int num){
      int count = num;
      String word = "";
      while(count != 0){
        word += s;
        count--;
      }
      return word;
    }
  //s1 = "sean" s2 = "frog" ==> sferaong
    public String interweaving(String s1, String s2){
      String result = "";
      for(int count = 0; count < s1.length(); count++){
        result += s1.substring(count, count + 1) + s2.substring(count, count + 1);
      }
      return result;
    }
  
  
  }