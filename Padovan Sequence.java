public int padovanSequence(int n)
    {
      int mod=(int)Math.pow(10,9)+7;
     // System.out.println(mod);
      int sum=0,a,b,c;
      a=b=c=1;
      if(n<3){
          return 1;
      }
      for(int i=3;i<=n;i++){
          sum=(a+b)%mod;
         // System.out.println(sum);
          a=b;
          b=c;
          c=sum;
      }
      return sum;
    }
