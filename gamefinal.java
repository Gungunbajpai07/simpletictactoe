import java.util.Scanner;
class gamefinal
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,move=0,c=0,ch=0;
        System.out.println("enter the name of 1st player");
        String playerA=sc.next();
        System.out.println("enter the name of 2nd player");
        String playerB=sc.next();
        char ar[][]=new char[3][3];
     do
     {
        for(move=0;move<9;move++)
        {
            if(move%2==0)
            {
            System.out.println("choose where to enter "+ playerA);
            i=sc.nextInt();
            j=sc.nextInt();
            ar[i][j]='X';
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                System.out.print(ar[i][j]+" ");  
                }
                System.out.println(" ");
            }
            i=0;j=0;
            if(ar[0][0]==ar[1][1]&&ar[2][2]==ar[1][1]&&ar[0][0]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[0][2]==ar[1][1]&&ar[1][1]==ar[2][0]&&ar[0][2]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[0][0]==ar[0][1]&&ar[0][0]==ar[0][2]&&ar[0][0]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[1][0]==ar[1][1]&&ar[1][1]==ar[1][2]&&ar[1][2]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[2][0]==ar[2][1]&&ar[2][0]==ar[2][2]&&ar[2][1]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[0][0]==ar[1][0]&&ar[0][0]==ar[2][0]&&ar[0][0]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[0][1]==ar[1][1]&&ar[0][1]==ar[2][1]&&ar[2][1]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[0][2]==ar[2][2]&&ar[0][2]==ar[1][2]&&ar[1][2]=='X')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }  

        //player1move ends here
            else
            {
                System.out.println("choose where to enter"+playerB);
                i=sc.nextInt();
                j=sc.nextInt();
                ar[i][j]='O';
                for(i=0;i<3;i++)
                {
                for(j=0;j<3;j++)
                    {
                        System.out.print(" ");
                    }
                System.out.println(" ");
                } 
                i=0;j=0;
                if(ar[0][0]==ar[1][1]&&ar[2][2]==ar[1][1]&&ar[0][0]=='O')
            {
                System.out.println(playerB+ " wins ");
                c++;
                break;
            }
            else if(ar[0][2]==ar[1][1]&&ar[1][1]==ar[2][0]&&ar[0][2]=='O')
            {
                System.out.println(playerB+ " wins ");
                c++;
                break;
            }
            else if(ar[0][0]==ar[0][1]&&ar[0][0]==ar[0][2]&&ar[0][0]=='O')
            {
                System.out.println(playerA+ " wins ");
                c++;
                break;
            }
            else if(ar[1][0]==ar[1][1]&&ar[1][1]==ar[1][2]&&ar[1][2]=='O')
            {
                System.out.println(playerB+ " wins ");
                c++;
                break;
            }
            else if(ar[2][0]==ar[2][1]&&ar[2][0]==ar[2][2]&&ar[2][1]=='O')
            {
                System.out.println(playerB+ " wins ");
                c++;
                break;
            }
            else if(ar[0][0]==ar[1][0]&&ar[0][0]==ar[2][0]&&ar[0][0]=='O')
            {
                System.out.println(playerB+ " wins ");
                c++;
                break;
            }
            else if(ar[0][1]==ar[1][1]&&ar[0][1]==ar[2][1]&&ar[2][1]=='O')
            {
                System.out.println(playerB+ " wins ");
                c++;
                break;
            }
            else if(ar[0][2]==ar[2][2]&&ar[0][2]==ar[1][2]&&ar[1][2]=='O')
            {
                System.out.println(playerB+ " wins ");
                c++;
                break;
            }
            //player 2 move ends here
        }  
        System.out.println("displaying the format");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(ar[i][j]);
            }
        System.out.println(" ");
        }
        
    }
    if(c==0)
    {
        System.out.println("no one wins");
    }
}
        System.out.println("if u wish to replay press 0");
         ch=sc.nextInt();
    //for ends
}//do ends
    while(ch==0);
}
}
