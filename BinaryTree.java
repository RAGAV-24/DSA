import java.util.*;
class Node
{
    int data=0;
    Node prev,next;
    Node(int data)
    {
        this.data=data;
        prev=next=null;
    }
}
class BinaryTree{
    public static Node root=null;

    public static void create(int[] arr)
    {
        int n=arr.length;
        int k=0;
        root=new Node(arr[k]);
        k++;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty() && k<n)
        {
            Node t=q.poll();
            if(t.prev==null)
            {
                Node t1=new Node(arr[k]);
                k++;
                q.add(t1);
                t.prev=t1;

            }
            if(t.next==null)
            {
                Node t2=new Node(arr[k]);
                k++;
                q.add(t2);
                t.next=t2;

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
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("Enter the level order traversal:");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        create(arr);
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