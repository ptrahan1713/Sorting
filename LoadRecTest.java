import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pattr
 */
public class LoadRecTest
{
    public static void main(String args[])
    {
        LoadRec loader = new LoadRec();

        double start = System.currentTimeMillis();
        
        for (int i = 0; i < 2; i++)
        {
            int arraySize = 10 * i;
            int[] nums = new int[arraySize];

            for (int j = 0; j < arraySize; j++)
            {
                Random rng = new Random();

                nums[j] = rng.nextInt();
            }
            
            System.out.println("Orginal");
            
            for (int k = 0; k < nums.length; k++)
            {
                System.out.print(nums[k] + " ");
            }
            
            System.out.println("\nSorted");
            loader.bubbleSort(nums);

            for (int k = 0; k < nums.length; k++)
            {
                System.out.print(nums[k] + " ");
            }

            System.out.println();
            
            //System.out.println("Total time is " + (System.currentTimeMillis() - start) + " milliseconds");
        }
        /*
        String printLoad;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> orderedList = new ArrayList<>();
        
        for(int i = 0; i < 20; i++)
        {
            Random myrng = new Random();
            
            list.add(myrng.nextInt());
        }

        //printLoad = loader.loaderRec(0, nums);
        //loader.groupSum(0, nums, 10);
        //System.out.println(printLoad);
        System.out.println(list);
        orderedList = loader.orderLow(list);
        System.out.println(orderedList);
*/
    }
}
