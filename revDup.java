public class revDup {
  public static void main(String[] args) {
    int arr[] = { 4, 4, 6, 6, 7, 2, 1, 9, 1, 3, 2 };
    int temp[] = new int[arr.length];
    int j = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        temp[j] = arr[i];
        j++;
      }
    }
    temp[j] = arr[arr.length - 1];
    for (int z : temp) {
      System.out.print(z + "  ");
    }
  }
}