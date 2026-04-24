package practice;

public class secondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr={1};

        int first=0;
        int second=0;

        if (arr.length<2)
        {
            System.out.println("Array must have at least 2 element :");
            return;
        }
        for (int num:arr)
        {
            if (num>first)
            {
                second=first;
                first=num;
            }else if (num>second && num!=first)
            {
                second=num;
            }
        }
        if (second==0)
        {
            System.out.println("there is no second largest element :");
        }else
        {
            System.out.println("The second largest no is :"+second);
        }
    }
}
