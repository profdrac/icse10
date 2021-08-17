package class10.chapter6;
class whatIsthis
{
    int a;
    
    public void setValue()
    {
        int a;
        this.a=20;
    }
    
    public void display()
    {
        System.out.print(a);
    }
    
    public static void main(String[] args)
    {
        whatIsthis o = new whatIsthis();
        whatIsthis x = new whatIsthis();
        o.setValue();
        o.display();
        x.setValue();
        x.display();
        
    }   
}