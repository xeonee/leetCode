public class SecondLargestElement {
    public static void main(String[] args) {
      int[] arr = {-1, 10, 8, 9, 10, 9, -8, 11};

      int firstMax = arr[0];
      int secondMax = arr[0];

      for(int i : arr) {
        // 1. if element is bigger than firstMax, update secondMax to firstMax
        if(i > firstMax){
          secondMax = firstMax;
          firstMax = i;
        }
        // 2. if element is smaller or equal to firstMax, compare it with secondMax
        else if(i <= firstMax && i > secondMax){
            secondMax = i;
        }

      } //end of for loop
      System.out.print(secondMax);
    }
}
