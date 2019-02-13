import java.util.Arrays;
import java.util.Random;

class TestSort
{
  
  // yes, I should have called the sorter class something other than "Main"
  
    // Test program 
    public static void main(String args[]) 
    { 
      
      System.out.println("This will test your sorting with 1,000,000 items between +/- 1000000");
      
      double arr[] = new double[1000000];

      for (int i = 0; i < 1000000; i++) {
        arr[i] = new Random().nextDouble() * 2000000 - 1000000;
      }
      // create a sorted version to test.
      double sortedArr[] = arr.clone();
      Arrays.sort(sortedArr);
      System.out.println("sorted array: "); 
      System.out.println(Arrays.toString(sortedArr));
        
       
      Main sorter = new Main(); // create a sorter object
      sorter.sort(arr, 0, arr.length); // call the sort function
  
      System.out.println("*** your sorted array: "); 
      System.out.println(Arrays.toString(arr));
    } 

  
  
  
  
}