/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i16041
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public float plus(float a, float b){
        return a+b;
        
    }
    public float minus(float a, float b){
        return a-b;
        
    }
    
    public float multiplication(float a, float b){
        return a*b;
    }
    
    public float division(float a,float b){
        return a/b;   
    }
	
	public float min(float a, float b){
		return Math.min(a,b);
    
	public float max(float a,float b){
		return Math.max(a,b);
	}
	
}
