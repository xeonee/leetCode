class ReduceIntToOne {
  public static void main(String[] args) {
    int n = 101;
    System.out.print(reduceSteps(n));
  }

  private static int reduceSteps(int n){
    int count = 0;

    while(n > 1){
      if(n%2 == 0) n=n/2;
      else if(n == 3 || n%4 == 1) n=n-1;
      else n=n+1;
      count++;
    }
    return count;

  }
}
