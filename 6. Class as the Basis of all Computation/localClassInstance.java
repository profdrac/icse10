class localClassInstance
{
    static int a;
    int b;
    
    public void store()
    {
        b=10;
        a++;
    }
    
    public void show()
    {
        System.out.println("class var="+a);
        System.out.println("instance var="+b);
    }
    
    public static void main(String[] args)
    {
        localClassInstance o1 = new localClassInstance();
        localClassInstance o2 = new localClassInstance();
        o1.store();
        o1.show();
        o2.store();
        o2.show();
    }   
}