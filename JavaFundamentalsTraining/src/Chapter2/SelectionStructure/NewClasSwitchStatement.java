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
        
        if (dayOfWeek ==1) {
            System.out.println("Monday");
        }else  if (dayOfWeek ==2) {
            System.out.println("Tuesday");
        }else if (dayOfWeek ==3) {
            System.out.println("Wednesday");
        }else if (dayOfWeek ==4) {
            System.out.println("Thursday");
        }else  if (dayOfWeek ==5) {
            System.out.println("Friday");
        } if (dayOfWeek ==6) {
            System.out.println("Saturday");
        }else{
        System.out.println("Sunday");
        }
    }
}
