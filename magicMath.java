public class magicMath { 
    public static void main(String args[])
     //myNumber is the original number.
    {
      int myNumber = 7;
      int stepOne = myNumber * myNumber;
      int stepTwo = stepOne + myNumber;
      int stepThree = stepTwo / myNumber;
      int stepFour = stepThree + 25;
      int stepFive = stepFour - myNumber;
      int stepSix = stepFive / 3;

      System.out.println(stepSix);
     }
}