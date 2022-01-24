import java.sql.SQLOutput;
import java.util.Arrays;
public class PhoneBook{
    String name;
    long number;
    PhoneBook(String name, long number){
        this.name = name;
        this.number = number;
    }
    public void display(){
        System.out.println(this.name + "----" + this.number);
    }
    public static void sortByName(PhoneBook[] Name){
            for(int i = 0; i<Name.length-1; i++) {
                for (int j = i+1; j<Name.length; j++) {
                    if(Name[i].name.compareTo(Name[j].name)>0) {
                        PhoneBook temp = Name[i];
                        Name[i] = Name[j];
                        Name[j] = temp;
                    }
                }
            }
        }
        public static void sortByNUmber(PhoneBook[] Name){
            for(int i = 0; i<Name.length-1; i++) {
                for (int j = i+1; j<Name.length; j++) {
                    if(Name[i].number>(Name[j].number)) {
                        PhoneBook temp = Name[i];
                        Name[i] = Name[j];
                        Name[j] = temp;
                    }
                }
            }
        }
        public static void searchName(String Person, PhoneBook[] Name){
        int i;
        for( i=0; i< Name.length;i++){
            if(Person.compareTo(Name[i].name)==0){
                    break;
                }
            }
            if(i<Name.length){
                Name[i].display();
            }
            else{
                System.out.println("Contact not found.");
            }
    }
    public static void searchNumber(long num, PhoneBook[] Name){
        int i;
        for(i=0; i< Name.length;i++){
            if(num == Name[i].number){
              break;
            }
        }
        if(i<Name.length){
            Name[i].display();
        }
        else{
            System.out.println("Contact not found.");
        }
    }
    public static void main(String[] args){
        PhoneBook Prasoon = new PhoneBook("Prasoon", 959846358);
        PhoneBook Ritik = new PhoneBook("Ritik", 969845785);
        PhoneBook Amal = new PhoneBook("Amal", 979865487);
        PhoneBook Sonu = new PhoneBook("Sonu", 875248695);
        PhoneBook [] Name = {Prasoon,Ritik,Amal,Sonu};
        sortByName(Name);
        System.out.println("Sorting Contacts By Name :- ");
        for(int i=0; i< Name.length;i++){
            System.out.println(Name[i].name + "----" + Name[i].number);
        }
        System.out.println("**************************");
        sortByNUmber(Name);
        System.out.println("Sorting Contacts By Number :- ");
        for(int i=0; i< Name.length;i++){
            System.out.println(Name[i].name + "----" + Name[i].number);
        }
        System.out.println("*************************");
        System.out.println("Searching By Name :- ");
        searchName("Prasoon",Name);
        System.out.println("****************************");
        System.out.println("Search By Number :- ");
        searchNumber(969845785,Name);
        System.out.println("***************************");
        System.out.println("Output When contact is not present :- ");
        System.out.println();
        searchName("Alisa", Name);
    }
}
