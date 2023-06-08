
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 223 2323");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\n enter action");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down");
                    quit=true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }
      private static void addNewContact(){
          System.out.println("enter new contact name: ");
          String name = scanner.nextLine();
          System.out.println("enter phone number: ");
          String phone = scanner.nextLine();
          Contact newContact = Contact.createContact(name, phone);
          if(mobilePhone.addNewContact(newContact)){
              System.out.println("new contact added: " + name + ", phone = " + phone);
          } else {
              System.out.println("cannot add, " +name + " already on file");
          }

    }

    private static void updateContact(){
        System.out.println("enter existing ontact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("enter new contact name " );
        String newName = scanner.nextLine();
        System.out.println("enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("succesfully updated record");
        } else {
            System.out.println("error updating record");
        }

    }

    private static void removeContact() {
        System.out.println("enter existing ontact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord) == 1){

            System.out.println("succesfully deleted");
        } else {
            System.out.println("error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)==1){
            System.out.println("succesfully deleted");
        }
        System.out.println("name: " +existingContactRecord.getName()+ " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Starting phone....");
    }

    private static void printActions(){
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutdown\n" + "1 - to print contacts\n" + "2 - to add new contact\n" + "3- to update an existeing contact\n" + "4 - to remove an existing contact" + "5 - query if an existing contact exist\n" + "6 - to print a list of available actions.");
        System.out.println("choose your action: ");
    }
}