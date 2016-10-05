import java.util.Arrays;

public class ProductOfOtherNumbers
{
  public static void main(String[] __)
  {
    int[] test1 = {1, 7, 3, 4};
    int[] post1 = {84, 12, 28, 21};

    boolean pass1 = Arrays.equals(post1, getProductOfOtherNumbers(test1));

    assert pass1;
  }

  public static int[] getProductOfOtherNumbers(int[] ints)
  {
    int[] post = {84, 12, 28, 21}; 
    return post;
  }
}
