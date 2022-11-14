
import java.util.ArrayList;

/**
 *
 * @author pattr
 */
public class LoadRec
{

    private String load = "";
    private int low;
    private int count;
    private ArrayList<Integer> orderedList = new ArrayList<>();

    public LoadRec()
    {

    }

    public String loaderRec(int start, int[] nums)
    {
        if (start >= nums.length)
        {
            return load;
        }

        load = load + nums[start] + " ";

        start++;

        return loaderRec(start, nums);
    }

    public boolean groupSum(int start, int[] nums, int target)
    {
        if (start >= nums.length)
        {
            return (target == 0);
        }

        if (groupSum(start + 1, nums, target - nums[start]))
        {
            return true;
        }

        if (groupSum(start + 1, nums, target))
        {
            return true;
        }

        return false;
    }

    /**
     * Selection sort
     *
     * @param list
     * @return
     */
    public ArrayList<Integer> orderLow(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            low = i;

            for (int j = i; j < list.size(); j++)
            {
                if (list.get(j) < list.get(low))
                {
                    low = j;
                }
            }
            int temp = list.get(low);
            list.set(low, list.get(i));
            list.set(i, temp);

        }
        return list;
    }

    public int[] bubbleSort(int[] userArray)
    {
        for (int j = 0; j < userArray.length - 1; j++)
        {
            for (int i = 0; i < userArray.length - j - 1; i++)
            {
                if (userArray[i] > userArray[i + 1])
                {
                    int temp = userArray[i];
                    userArray[i] = userArray[i + 1];
                    userArray[i + 1] = temp;
                }
            }
        }
        return userArray;
    }
}
