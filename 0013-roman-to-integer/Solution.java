class Solution {
    public int romanToInt(String s) {
        int total=0;
        

        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            int currentvalue=0;
            
            {
                if (current=='I')
                    currentvalue=1;
                else if(current=='V')
                    currentvalue=5;
                else if (current=='X')
                    currentvalue=10;
                 else if (current=='L')
                    currentvalue=50;
                 else if (current=='C')
                    currentvalue=100;
                 else if (current=='D')
                    currentvalue=500;
                 else if (current=='M')
                    currentvalue=1000;
                    {
                       if(i<s.length()-1) {
                        char next = s.charAt(i + 1);
                        int nextvalue=0;

                        if(next=='I')
                        nextvalue=1;
                        if(next=='V')
                        nextvalue=5;
                        if(next=='X')
                        nextvalue=10;
                        if(next=='L')
                        nextvalue=50;
                        if(next=='C')
                        nextvalue=100;
                        if(next=='D')
                        nextvalue=500;
                        if(next=='M')
                        nextvalue=1000;
                        

                        
                            if(currentvalue < nextvalue)
                            total-=currentvalue;
                            else
                            total+=currentvalue;
                        }
                        else 
                        {
                        
                        
                            total+=currentvalue;
                        }
                        
                        
                        


                       }

                    }

            }
            return total;


        }
        
    }
