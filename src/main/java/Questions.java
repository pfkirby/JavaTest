import java.util.List;


class Questions {
    
    /**
    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    Given nums = [0,0,1,1,1,2,2,3,3,4],
    Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively
    It doesn't matter what values are set beyond the returned length.
    */

    public int removeDuplicates(int[] nums) {
        return 0;
    }


    /**
     Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

     Example:
     Input: [3,0,1]
     Output: 2

     Input: [9,6,4,2,3,5,7,0,1]
     Output: 8
     */

    public int missingNumber(int[] nums) {
        return 0;
    }

    /**
     Split a String in Balanced Strings

     Example:
     Input: s = "RLRRLLRLRL"
     Output: 4
     Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'

     Input: s = "RLLLLRRRLR"
     Output: 3
     Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.

     Input: s = "LLLLRRRR"
     Output: 1
     Explanation: s can be split into "LLLLRRRR".
     */

    public int splitString(String s) {
        return 0;
    }


    /**
     You are given coins of different denominations and a total amount of money amount.
     Write a function to compute the fewest number of coins that you need to make up that amount.
     If that amount of money cannot be made up by any combination of the coins, return -1.

     Input: coins = [1, 2, 5], amount = 11
     Output: 3
     Explanation: 11 = 5 + 5 + 1

     Input: coins = [2], amount = 3
     Output: -1
     */
    public int coinChange(int[] coins, int amount) {
        return 0;
    }

    /**
     Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.

     If possible, output any possible result.  If not possible, return the empty string.

     Example 1:

     Input: S = "aab"
     Output: "aba"
     Example 2:

     Input: S = "aaab"
     Output: ""
     */
    public String reorganizeString(String S) {
        return null;
    }

    /**
     Given a 2D array with values such as ‘S’, ‘D’, ‘1’ and ‘0’.
     - S is the Source
     - D is the Destination
     - 1 marks the valid path
     - 0 marks the obstacle
     Find the shortest distance from S to D avoiding all the obstacles.

     Input
    {
    	{'S', '0', '1', '1'},
    	{'1', '1', '0', '1'},
    	{'0', '1', '1', '1'},
    	{'1', '0', 'D', '1'}
    };
     */
    public int shortestDistance(char[][] matrix) {
        return 0;
    }
}
