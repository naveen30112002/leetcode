class Main{
     public static void main(String args[]){
          int sum=0;
          int maxsum=nums[0];
          for(int i=0; i<n; i++)
          {
             sum+=nums[i];
             if(sum>maxsum)
             maxsum=sum;
             if(sum<0){
               sum=0;
             }
          }
          return maxsum;
     }
}