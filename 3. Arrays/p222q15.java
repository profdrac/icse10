package class10.chapter3;

class p222q15
{
    public static void main()
    {
        int P[]={1,2,3,4,6,10};
        int Q[]={6,12,23,19};
        int R[]=new int[10];
        for(int i=0;i<10;i++)
            R[i]=i<6 ? P[i] : Q[i-6];
        for(int i=0;i<10;i++)
        System.out.print(R[i]+" ");
    }
}