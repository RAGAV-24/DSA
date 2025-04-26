
import java.util.*;
class Node
{
    int data=0;
    Node prev,next;
    Node(int data)
    {
        this.data=data;
    }
}
class BinarySearchTree
{
        public static Node root=null;
    public static void insert(int data)
    {
     Node newNode=new Node(data);
        if(root==null)
        {
            root=newNode;
        }
        else{
            Node current=root;
            while(true)
            {
            if(current.data>data)
            {
                if(current.prev==null)
                {
                    current.prev=newNode;
                    break;
                }
                else{
                    current=current.prev;

                }
            }
            else{
                if(current.next==null)
                {
                    current.next=newNode;
                    break;
                }
                else{
                    current=current.next;
                }
            }
            }
        }
    }
    public static void  postOrder(Node r)
    {
        if(r==null)
        {
            return ;
        }
         postOrder(r.prev);
         postOrder(r.next);
        System.out.print(r.data+"-> ");

    }
    public static void  preOrder(Node r)
    {
        if(r==null)
        {
            return ;
        }
        System.out.print(r.data+"-> ");
       preOrder(r.prev);
       preOrder(r.next);

    }
    public static void  inOrder(Node r)
    {
        if(r==null)
        {
            return ;
        }
        inOrder(r.prev);
        System.out.print(r.data+"-> ");
       inOrder(r.next);

    }
    public static void main(String[] aergs)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[] arr=new int[a];
      for(int i=0;i<a;i++)
      {
      arr[i]=sc.nextInt();
      }
      for(int i:arr)
      {
          insert(i);
      }
      System.out.println("Preorder");
      preOrder(root);
      System.out.println();
      System.out.println("Inorder");
      inOrder(root);
      System.out.println();
      System.out.println("Postorder");
      postOrder(root);
    }
}