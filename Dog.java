/**
 * 
 * Michael Reinhart 
 * (12/15/2015)
 * This is the constructor class that has all methods to calculate or get the information used to make
 * the toString and compare any two dogs.
 */
public class Dog implements Comparable
{
    private String name, breed;
    private int pounds,age, dogAge;
    // Method used if all instance data is given
    public Dog (String dog, int years, String type, int weight){
        name = dog;
        age = years;
        breed = type;
        pounds = weight;
    }
    // Method used if only Name and Age are given
        public Dog (String dog, int years){
        name = dog;
        age = years;
        breed = "unknown";
        pounds = 0;
    }
    // compareTo method
    public int compareTo (Object other){
        Dog dogAge = (Dog) other;
        Dog o = (Dog) other;
        if (this.age==o.age){
            return 0;       
        }
        else if(this.age>o.age)
            return 1;  
        else 
           return -1;
    }
    // Returns the name of the dog
    public String getName(){
        return name;
    }
    // Returns the dogs age 
    public int getAge(){
        return age;
    }
    // Returns the dogs breed 
    public String getBreed(){
        return breed;
    }
    // Returns the weight of the dog
    public int getWeight(){
        return pounds;
    }
    // Calcualtes the age of the dog in human years 
    public int setDogYears(){
        return age *7;
    } 
    
    // toStrign used to print all facts about the dog
    public String toString(){
        String str = "The dogs name is: " + name +
        "\n The dogs age is: " + this.getAge() +
        "\n The dogs breed is: " + this.getBreed() +
        "\n The dogs weight is: ";
        if (this.getWeight()>0)
             str += this.getWeight()+ " lbs";
        else {
            str += "Unknown";
        }
        str += "\n The dogs age in dog years is: " + this.setDogYears() + "\n";
        return str;

    } 
}
