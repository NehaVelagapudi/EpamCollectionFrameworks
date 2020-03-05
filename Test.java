package ExceptionHandling.CollectionFramework;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
			Collections c=new Collections();
			c.add("I");
			c.add("A");
			c.add("M");
			c.add("S");
			c.add("R");
			c.add("I");
			c.add("N");
			c.add("E");
			c.add("H");
			c.add("A");
			System.out.println("The elements in collection are:");
			c.print();
			while("True"!=null)
			{
			System.out.println("\n1.Add an element to the collection\n2.Retreive an element from the collection\n3.Remove an elemnt from the collection");
			System.out.println("Enter your choice:");
			Scanner s=new Scanner(System.in);
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
			System.out.println("Enter the number of elements:");
			Scanner ss=new Scanner(System.in);
			int var1=ss.nextInt();
			System.out.println("Enter the elements:");
			for(int i=0;i<var1;i++)
			{
			Scanner sc=new Scanner(System.in);
			String v=sc.next();
			c.add(v);
			}
			     c.print();
			     break;
			case 2:
			System.out.println("Enter the index of element to retreive:");
			Scanner sc=new Scanner(System.in);
			int g=sc.nextInt();
			Object o=c.get(g);
			System.out.println("The element at index "+g +" is:"+o);
			break;
			case 3:
			System.out.println("Enter index of element to remove:");
			Scanner sss=new Scanner(System.in);
			int r=sss.nextInt();
			c.remove(r);
			System.out.println();
			System.out.println("Elements in collection after removing the element are:");
			c.print();
			break;
			default:
			System.out.println("Enter correct input");
			}
			
			}
			}
	}



