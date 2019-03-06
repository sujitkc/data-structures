import java.util.*;
import java.math.BigInteger;       //import the BigInteger class as Integer can't accomodate numbers greater than 65535
import java.util.Hashtable;        //import HashTable API
class Phonebook{
    public static void main(String args[]){
        Hashtable<String,BigInteger> contacts=new Hashtable<String,BigInteger>();  //HashTable API provided by java (Initialize)

        BigInteger b1 = new BigInteger("9041788329");                 //Allocate a new BigInteger so as to store a number in the b1 variable.
        BigInteger b2 = new BigInteger("987654321");
        BigInteger b3 = new BigInteger("9041537789");
        BigInteger b4 = new BigInteger("9022841890");

        contacts.put("Ross",b1);  //put function adds value to the hash table
        contacts.put("Rachel",b2);
        contacts.put("Chandler",b3);
        contacts.put("Monica",b4);


        //to check if some key is contained by the hashtable
        System.out.println(contacts.containsKey("Chandler"));    //returns a bool value

        //Let's search for some name in this phonebook.
        System.out.println(contacts.get("Chandler")); //get function gets the value for the key sent in the function.


        Set<String> keys = contacts.keySet();	//to get all the keys present in the hash table.
        for(String key: keys){
            System.out.println("Number of "+key+" is: "+contacts.get(key));
        }

        // to remove a entry from the hashtable.
        contacts.remove("Chandler");

        System.out.println(contacts.containsKey("Chandler")); //to check if key has been removed

        contacts.clear();   // to clear the hashtable completely.
    }
}