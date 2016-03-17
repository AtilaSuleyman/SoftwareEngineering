/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalcombinations;
import java.lang.Math;
/**
 *
 * @author User
 */
public class TotalCombinations {

    public TotalCombinations(int states, int inputs){
        posCombinations(states,inputs);
    }
    
    public double posCombinations(double states, double inputs){
        double temp;
        temp = Math.pow(states, inputs);
        System.out.println(temp);
        return temp;
    }
    
    public static void main(String[] args) {
       TotalCombinations a = new TotalCombinations(2,8);
    }
    
}
