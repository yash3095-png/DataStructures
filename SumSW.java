import java.util.*;

public class SumSW {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,max=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            sum+=arr[i];
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        if(hm.size()==k) max=sum;
        int left=0,right=k;
        while(right<n){
            sum+=arr[right];
            hm.put(arr[right],hm.getOrDefault(arr[right],0)+1);
            sum-=arr[left];
            hm.put(arr[left],hm.get(arr[left])-1);
            if(hm.get(arr[left])==0) hm.remove(arr[left]);
            if(hm.size()==k) max=Math.max(max,sum);
            left++;
            right++;
        }
        System.out.println(max);
    }
}
