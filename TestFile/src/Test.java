import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		System.out.println("Testing!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		long a=46;
        long b=1000;
        List<String> listOfIntegers = new ArrayList<>();
        for(long i=a;i<=b;i++)
        {
            listOfIntegers.add(i+"");
        }
        List<Long> ans = listOfIntegers.stream()
        	.filter(i->iskaprekar(Long.parseLong(i))==true)
        	.map(i->Long.parseLong(i))
        	.collect(Collectors.toList());
        System.out.println(ans);
        

	}
	static boolean iskaprekar(long n)
    {
        if (n == 1)
           return true;
      
        // Count number of digits in square
        long sq_n = n * n;
        long count_digits = 0;
        while (sq_n != 0)
        {
            count_digits++;
            sq_n /= 10;
        }
      
        sq_n = n*n; // Recompute square as it was changed
      
        // Split the square at different poitns and see if sum
        // of any pair of splitted numbers is equal to n.
        for (long r_digits=1; r_digits<count_digits; r_digits++)
        {
             long eq_parts = (long) Math.pow(10, r_digits);
      
             // To avoid numbers like 10, 100, 1000 (These are not
             // Karprekar numbers
             if (eq_parts == n)
                continue;
      
             // Find sum of current parts and compare with n
             long sum = sq_n/eq_parts + sq_n % eq_parts;
             if (sum == n)
               return true;
        }
      
        // compare with original number
        return false;
    }
}
