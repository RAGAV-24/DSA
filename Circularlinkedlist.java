import java.util.*;
class Node{
  int data=0;
  Node next;
  Node(int data)
  {
    this.data=data;
    next=null;
  }
}
public class Circularlinkedlist {
    static Node head=null;
    static Node tail=null;
    public static void insertAtBegin(int data)
    {
      if(head==null)
      {
        Node ne=new Node(data);
        head=tail=ne;
        tail.next=head;
      }
      else{
        Node ne=new Node(data);
        ne.next=head;
        head=ne;
        tail.next = head;
      }
    }
    public static void insertAtEnd(int data)
    {
      if(head==null)
      {
        Node ne=new Node(data);
        head=tail=ne;
        tail.next=head;
      }
      else{
        Node ne=new Node(data);
        ne.next=head;
        tail.next = ne;
        tail=ne;
      }
    }
    public static void insertAtPosition(int data,int pos)
    {
      if(head==null)
      {
        Node ne=new Node(data);
        head=tail=ne;
        tail.next=head;
      }
      else{
        Node ne=new Node(data);
        Node temp=head;
        int k=0;
        do
        {
          temp=temp.next;
          k++;
        }
        while(k<pos-1 && temp!=head);
        ne.next=temp.next;
        temp.next=ne;
      }
    }
    public static void DeleteAtBegin()
    {
      if(head==null)
      {
        System.out.println("No Node to be deleted");
      }
      else{
        tail.next=head.next;
        head=head.next;
      }

    }
    public static void DeleteAtEnd()
    {
      if(head==null)
      {
        System.out.println("No Node to be deleted");
      }
      else
      {
        Node temp=head;
        while(temp.next!=tail)
        {
          temp=temp.next;
        }
        temp.next=head;
        tail=temp;
      }

    }

    public static void display()
    {
      if(head==null)
      {
        System.out.println("There is no node");
      }
      Node temp = head;
      do {
          System.out.print(temp.data + " ");
          temp = temp.next;
      } while (temp != head);
      System.out.println();
    }
    public static void main(String[] args){
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
          System.out.println("Enter the data");
          int d1=sc.nextInt();
          insertAtBegin(d1);
          break;
          case 2:
          System.out.println("Enter the data");
          int d2=sc.nextInt();
          insertAtEnd(d2);
          case 3:
          System.out.println("Enter the data");
          int d3=sc.nextInt();
          System.out.println("Enter the postion");
          int pos=sc.nextInt();
          insertAtPosition(d3,pos);
          break;
          case 4:
          DeleteAtBegin();
          break;
          case 5:
          DeleteAtEnd();
          break;
          case 6 :
          display();
          break;
          default :
          System.out.println("Invalid Choice");
          break;
        }
        System.out.println("Enter your choice");
        a=sc.nextInt();

      }
    }
}
