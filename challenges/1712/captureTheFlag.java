/*
* WAP to reveal the hidden flag /Intro to hacking :)
* Objective: Finish decode-function by understanding logic of encode-function
* @author: Ashutosh Sharma
*/

class captureTheFlag
{
    String ucantreadme="b5vp8sei;psyA";

    private void encode(String s)
    {
        int l = s.length();
        for(int i = 0 ; i < l ; i++)
        {
            char ch = s.charAt(i);
            int ac = (int) ch;
            ac += i;
            ucantreadme += (char) ac;
        }
    }

    private void decode()
    {
        String flag="";
        int l = ucantreadme.length();
        for(int i = 0 ; i < l ; i++)
        {
            //your code goes here
        }
        System.out.println(flag);
    }
    
    public static void main(String args[])
    {
        captureTheFlag o = new captureTheFlag();
        //o.encode("I passed a magic string here");
        o.decode();
    }
}
