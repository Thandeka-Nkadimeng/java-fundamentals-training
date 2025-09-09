/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2.SelectionStructure;

/**
 *
 * @author Thandeka Nkadimeng
 * This class shows the use of switch statement.
 * Switch statement can be used to evaluate equality
 */
public class NewClasSwitchStatement {
    public static void main(String[] args) {
        // TODO code application logic here
        int dayOfWeek = 3;
        
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }
}
