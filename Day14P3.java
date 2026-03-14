/*Across the vast desert of Aramoor, traders travel in long caravans carrying
rare spices and precious goods between distant kingdoms. Each caravan forms a
strict sequence of camels walking one after another along a narrow path.

Due to an approaching sandstorm, the caravan leader must quickly change the 
direction of the entire caravan so that the last camel becomes the first, 
and the first becomes the last.

However, the camels are tied together using special desert ropes where each
camel only knows the camel directly ahead of it.

Your task is to reorganize the caravan so that the direction of the entire
chain is reversed.

You must reverse the order of camels using the most efficient approach.

Input Format:
-------------

The first line contains an integer N representing the number of camels in the 
caravan.

The second line contains N space-separated integers representing the 
identification numbers of the camels in their current order from front to back.

Output Format:
--------------

Print the identification numbers of the camels after reversing the caravan order.

The numbers must be printed in a single line separated by spaces.

Sample Input-1:
---------------

5
10 20 30 40 50

Sample Output-1:
----------------

50 40 30 20 10

Explanation:
------------

The caravan initially moves in the order:

10 → 20 → 30 → 40 → 50

After reversing the direction:

50 → 40 → 30 → 20 → 10


Sample Input-2:
---------------

3
7 14 21

Sample Output-2:
----------------

21 14 7
*/

import java.util.*;

class Day14P3{
    static int[] reverse(int[] arr,int i,int j){
        if(i>=j) return arr;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return reverse(arr,i+1,j-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}