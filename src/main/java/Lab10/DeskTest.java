package Lab10;
import java.util.*;

public class DeskTest {

    public static void main(String[] args) {
        Desk desk = new Desk(getTopFromInput());
        displayMenu();
        String choice = getUserInput();
        while(!choice.equals("Q")){
            
            switch(choice){
                
                case "L":
                    addLeg(desk, getLegFromInput());
                    break;    
                case "P":
                    displayDesk(desk);
                    break;
                case "S":
                    stand(desk);
                    break;
                case "Q":
                    break;
            }
            
            displayMenu();
            choice = getUserInput();
        }
    }
    
    public static void displayMenu(){
        
        System.out.println("L: add a leg to the desk.");
        System.out.println("P: display the desk info.");
        System.out.println("S: check if the desk can stand.");
        System.out.println("Q: quit the program.");
    }
    
    public static String getUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the choice: ");
        return scan.nextLine();
    }
    public static Top getTopFromInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the parameters for a top: ");
        String[] topInfo = scan.nextLine().split(",");
        Top top = new Top(topInfo[0], Double.parseDouble(topInfo[1]), Double.parseDouble(topInfo[2]));
        return top;
    }
    
    public static void addLeg(Desk desk, Leg leg){
        if(desk.addLeg(leg))
            System.out.println("The leg is successfully added.");
        else
            System.out.println("The leg is not added.");
    }
    
    public static Leg getLegFromInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the parameters for a leg: ");
        String[] legInfo = scan.nextLine().split(",");
        Leg leg = new Leg(legInfo[0], Integer.parseInt(legInfo[1]), Double.parseDouble(legInfo[2]));
        return leg;
    }
    
    public static void displayDesk(Desk desk){
        System.out.println(desk);
    }
    
    public static void stand(Desk desk){
        if(desk.canStand())
            System.out.println("The desk can stand.");
        else
            System.out.println("The desk fail to stand.");
    }
}
class Desk{
    private Top top;
    private ArrayList<Leg> legs;
    public Desk(Top top){
        this.top = top;
        legs = new ArrayList<Leg>();
    }
    
    public boolean addLeg(Leg legToBeAdded){
        boolean flag = true;
        for(Leg leg: legs){
            if(leg.getLegNo() == legToBeAdded.getLegNo()){
                flag = false;
                break;
            }
        }
        if(flag){
            legs.add(legToBeAdded);
        }
        return flag;
    }
    
    public boolean canStand(){
        if(legs.size() > 1)
            return true;
        else
            return false;
    }
    public String toString(){
        String result = top.toString();
        for(Leg leg: legs)
            result += "\n" + leg.toString();
        return result;
    }
}
class Top{
    private String material;
    private double length;
    private double width;
    
    public Top(String mat, double len, double wid){
        this.material = mat;
        this.length = len;
        this.width = wid;
    }
   
    public String toString(){
        return "The top is made of " + material + ", " + length + " cm * " + width + " cm.";
    }
}
class Leg{
    
    private String material;
    private int legNo;
    private double length;
    
    public Leg(String mat, int no, double len){
        material = mat;
        legNo = no;
        length = len;
    }
    
    public String toString(){
        return "The leg " + legNo + " is made of " + material + ", " + length + " cm.";
    }
    
    public int getLegNo(){
        return legNo;
    }
}
