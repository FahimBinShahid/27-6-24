package dev.lpa;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;

public class MobilePhone {
    public static void main(String[] args) {
    }

        private String myNumber;
        private ArrayList<String> myContacts;


    public MobilePhone(String myNumber) {
            this.myNumber = myNumber;

            this.myContacts = new ArrayList<>();
            myContacts.add(new String("Rebeca", "01234567890"));
            myContacts.add(new String("Soler", "01987654321"));
        }

    public boolean addNewContact(String contact){
        for(String existing : myContacts){
            if(existing.equals(contact))
                return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(String oldContact, String newContact){
        for(String existing : myContacts){
            if (existing.equals(oldContact)) {
                myContacts.set(myContacts.indexOf(oldContact),newContact);
                return true;
            }
        }
        return false;
    }
    public boolean removeContact(String contact){
        for(String existing : myContacts){
            if(existing.equals(contact)){
                myContacts.remove(String existing);
                return true;
            }
        }
        return false;
    }
    private int findContact(String contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String stringInput){
        for(String contact : myContacts){
            if((contact.getName).equals(stringInput)){
                return contact.indexOf(contact);
            }
        }
        return -1;
    }
    public String queryContact(String stringInput){
        int index = findContact(stringInput);
        if(index >= 0){
            return myContacts.get(index);
        }else{
            return null;
        }
    }
    public void printContact(){
        System.out.println("Contact List:");
        for(int i = 0; i< myContacts.size(); i++){
            System.out.println((i+1) + ". " +
                    (myContacts.get(i)).getName() + "->" +
                    (myContacts.get(i).getPhoneNumber()) );
        }
    }

}