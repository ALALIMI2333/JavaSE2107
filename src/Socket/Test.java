package Socket;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] allOut = {1,2,3,4,7,232,76,238,543,112};
        int pw = 232;
        System.out.println(Arrays.toString(allOut));

            int deleted = pw;
            for (int i = 0; i < allOut.length; i++)
            {
            if (allOut[i] ==pw){
                allOut[i] = allOut[allOut.length-1];
                allOut = Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
            }

        System.out.println(Arrays.toString(allOut));
    }
}
