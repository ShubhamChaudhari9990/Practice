class Pattern {
    public static void main(String[] args) {
        /* 
          for(int i=1;i<=3;i++)
          {
            for(int j=1;j<=3;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
          }  
        /* o/p of prgram
          1 1 1
          2 2 2
          3 3 3
        */

        /* 
          for(int i=3;i>=1;i--)
          {
            for(int j=3;j>=1;j--)
            {
                System.out.print(" "+i);
            }
            System.out.println();
          }

        /* o/p 
            3 3 3
            2 2 2
            1 1 1
        */

        /*
          for(int i=1;i<=3;i++)
          {
            for(int j=1;j<=3;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
          }

        /* o/p
            1 2 3
            1 2 3
            1 2 3
        */

        /*
            for(int i=1;i<=3;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" "+j);
                }
                System.out.println();
            }
        
        /*
         *  1
            1 2
            1 2 3
         */

         /*
            int b=1;
            for(int i=1;i<=4;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    
                    System.out.print(" "+b);
                    b++;
                }
                System.out.println();
            }
            
        /*
             *   1
                 2 3
                 4 5 6
                 7 8 9 10
        */
            
        /* 
            for(int i=1;i<=5;i++)
            {
                for(int j=5-i;j>=1;j--)
                {
                    System.out.print(" ");
                }  
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }  
                for(int k=i-1;k>=1;k--)
                {
                    System.out.print(k);
                }          
                System.out.println();
            }

        /*  o/p=>
             *      1
                   121
                  12321
                 1234321
                123454321
        */
        
            
        
            // for(int i=1;i<=5;i++)
            // {
            //     for(int j=5-i;j>=1;j--)
            //     {
            //         System.out.print(" ");
            //     }  
            //     for(int j=1;j<=i;j++)
            //     {
            //         System.out.print("*");
            //     }  
            //     for(int k=i-1;k>=1;k--)
            //     {
            //         System.out.print("*");
            //     }          
            //     System.out.println();
            // }

        /*  o/p=>
                     *
                    ***
                   *****
                  *******
                 *********

                same o/p below program but differnt logic.
        */
         
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=5-i;j++)
                {
                    System.out.print(" ");
                }  
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }         
                System.out.println();
            }
        
    }   
}
