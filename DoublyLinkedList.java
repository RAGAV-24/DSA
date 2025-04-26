import java.util.*;
class Node
{
    int data=0;
    Node prev;
    Node next;
    Node(int data)
    {
        this.data=data;
        prev=next=null;
    }
}
class DoublyLinkedList 
{
    static Node head=null;
    static Node tail=null;
    public static void insertAtBegin(int data)
    {
        if(head==null)
        {
            Node newNode=new Node(data);
            head=tail=newNode;
        }
        else{
            Node newNode=new Node(data);
            newNode.next=head;
            head.prev=newNode;
            head=newNode;


        }
    }
    public static void insertAtEnd(int data)
    {
        if(head==null)
        {
            Node newNode=new Node(data);
            head=tail=newNode;
        }
        else{
            Node newNode=new Node(data);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;


        }
    }
    public static void insertAtposition(int data,int pos)
    {
        if(head==null)
        {
            Node newNode=new Node(data);
            head=tail=newNode;
        }
        else{
            int k=0;
            Node newNode=new Node(data);
            Node temp=head;
            while(temp!=null && k<pos-1)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            newNode.prev=temp;


        }
    }
     public static void deleteAtBegin()
    {
        if(head==null)
        {
           System.out.println("There is No node to be deleted");
        }
        else{
            head=head.next;
        }
    }
     public static void deleteAtEnd()
    {
        if(head==null)
        {
           System.out.println("There is No node to be deleted");
        }
        else{
            tail=tail.prev;
            if(head.next==null)
            {
                head=null;
            }
        }
    }
    public static void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            if(temp.next!=null)
            {
                System.out.print("->");
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choice: 1 :Insert At Begin");
        System.out.println("Choice: 2 :Insert At END");
        System.out.println("Choice: 3 :Insert At POS");
        System.out.println("Choice: 4 :DELETE At Begin");
        System.out.println("Choice: 5 :DELETE At Begin");
        System.out.println("Choice: 6 :Display");
        System.out.println("Choice: 7 :end operation");
        int a=sc.nextInt();
        while(a!=7)
        {
        switch(a)
        {
            case 1:
                System.out.println("Enter the data to be added");
                int d1=sc.nextInt();
                insertAtBegin(d1);
                break;
            case 2:
                System.out.println("Enter the data to be added");
                int d2=sc.nextInt();
                insertAtEnd(d2);
                break;
            case 3:
                System.out.println("Enter the data to be added ");
                int d3=sc.nextInt();
                System.out.println("Enter the position to be added ");
                int pos=sc.nextInt();
                insertAtposition(d3,pos);
                break;
            case 4:

                deleteAtBegin();
                break;
            case 5:

                deleteAtEnd();
                break;

            case 6:
                display();
                break;
            default:
                System.out.println("Invalid choice");
                break;


        }
        System.out.println("Enter your next choice:");
        a=sc.nextInt();
        if(a==7)
        {
            System.out.println("Break the statement final list");
            display();
            break;
        }
        }
        sc.close();

    }
}
