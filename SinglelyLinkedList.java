import java.util.*;
class Node
{
    int data=0;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class SinglelyLinkedList
{
    public static Node create(int[] arr)
    {
        int k=0;
        Node c=new Node(arr[k]);
        Node j=c;
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            j.next=temp;
            j=j.next;
        }
        return c;
    }
    public static Node insertBegin(int data,Node r)
    {
        Node f=new Node(data);
        f.next=r;
        r=f;
        return f;
    }
    public static Node insertEnd(int data,Node r)
    {
        Node f=new Node(data);
        Node temp=r;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=f;
        return r;
    }
    public static Node insertAtPosition(int data,int pos ,Node r)
    {
        int g=0;
        Node f=new Node(data);
        Node temp=r;
        while(temp.next!=null && g<pos-1 )
        {
            temp=temp.next;
            g++;

        }
        f.next=temp.next;
        temp.next=f;
        return r;
    }
     public static Node deleteBegin(Node r)
    {
       Node f=r.next;

        return f;
    }
     public static Node deleteEnd(Node r)
    {
       Node f=r;
       while(f.next.next!=null)
       {
           f=f.next;
       }
       f.next=null;

        return r;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
        //   System.out.println(arr[i]);
        arr[i]=sc.nextInt();
        }

        //CREATING THE LINKED LIST

        Node root=create(arr);
        //  Node temp=root;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        //INSERT AT BEGIN

        Node r=root;
        root=insertBegin(6,r);
        //  Node temp=root;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        //INSERT AT END

        Node r2=root;
        root=insertEnd(7,r2);
        //  Node temp=root;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        // Insert at the given position


        Node r3=root;
        root=insertAtPosition(6,6,r3);
        //     Node temp=root;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }


        // Delete at BEGIN


        Node r4=root;
        root=deleteBegin(r4);
        //  Node temp=root;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }


        // Delete at END
        Node r5=root;
        root=deleteEnd(r5);
        //  Node temp=root;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        sc.close();

    }
}