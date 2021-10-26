package class10.chapter4; 
/**
 * WAP to replace "Blue" with "Red"
 * @author (Ashutosh Sharma)
 */
class c10p267q12
{
    public static void main(String[] args)
    {
        String s="Blue bottle is in Blue bag lying on Blue carpet ";
        int l=s.length();
        int p=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String w=s.substring(p,i);
                switch(w)
                {
                    case "Blue":
                        System.out.print("Red ");
                        break;
                    default:
                        System.out.print(w+" ");
                }
                p=i+1;
            }
        }
    }   
}



