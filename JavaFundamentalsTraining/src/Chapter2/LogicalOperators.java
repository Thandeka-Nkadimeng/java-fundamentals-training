/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Thandeka Nkadimeng explore different operators
 */
public class LogicalOperators {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3, b = 5, c = 10, d = 12;
        boolean e = false, f = true;

        boolean results = !e;

        results = e && f;
        results = e || f;

        System.out.println(a > 0 && e && b <= 5);

        System.out.println((f || b == a) || (c > a));
        
        System.out.println((f || b == a) || (c > a));
        
        
    }
    
}
