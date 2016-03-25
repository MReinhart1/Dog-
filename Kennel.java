/**
 * 
 *  Michael Reinhart
 * (12/15/215)
 * This is the driver class that prints out all the dogs and compares the ages of them
 */

 
public class Kennel
{
    public static void main (String args[])
    {
        Dog dog1 = new Dog("Jack", 7, "Lab",300);
        Dog dog2 = new Dog("Celbe", 17, "Mut",147);
        Dog dog3 = new Dog ("Michael",12,"Golden Retriever", 150);
        Dog dog4 = new Dog("Will", 18);
        //Use toString method to print all facts about dogs
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        //Compares the two dogs by age and tells user which is older or younger 
        System.out.println("Comparing the dog Jack to the dog Celbe");
        if(dog1.compareTo(dog2)==0)
            System.out.println("The dogs are the same age");
        if(dog1.compareTo(dog2)==-1)
            System.out.println("Jack is younger than Celbe");
        if(dog1.compareTo(dog2)==1)
            System.out.println("Jack is older than Celbe");
        System.out.println();
        System.out.println("Comparing the dog Michael to the dog Will");
        if(dog3.compareTo(dog4)==0)
            System.out.println("The dogs are the same age");
        if(dog3.compareTo(dog4)==-1)
            System.out.println("Michael is younger than Will");
        if(dog3.compareTo(dog4)==1)
            System.out.println("Michael is older than Will");
        System.out.println();
        System.out.println("Comparing the dog Celbe to the dog Michael;");
        if(dog2.compareTo(dog3)==0)
            System.out.println("The dogs are the same age");
        if(dog2.compareTo(dog3)==-1)
            System.out.println("Celbe is younger than Michael");
        if(dog2.compareTo(dog3)==1)
            System.out.println("Celbe is older than Michael");
        System.out.println();
    }
}
