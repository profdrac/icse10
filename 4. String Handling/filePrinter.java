package class10.chapter4;
/*
 * WAP to get complete path of a file and show folder-name, file-name and file-extension separately
 * e.g. Input: C:\Users\Ashu\Pictures\art2.jpg
 * Output:
 * Folder = C:\Users\Ashu\Pictures\
 * Filename = art2
 * Extension = jpg
 */
import java.util.Scanner;

class filePrinter
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complete path: ");
        String s = sc.nextLine();
        int l = s.length();
        int lbs = s.lastIndexOf('\\');
        System.out.println("Folder = "+s.substring(0, lbs+1));
        int ld = s.lastIndexOf('.');
        System.out.println("Filename = "+s.substring(lbs+1,ld));
        System.out.println("Extension = "+s.substring(ld+1));
    }
    
}