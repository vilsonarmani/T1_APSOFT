/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_07;

public class Ex_07 {

  
    public static void main(String[] args) {
        PeriodoDatas pd = new PeriodoDatas("01/04/2019", "30/04/2019");
        
        System.out.println("Data Inicial: "+pd.getInicio()+" a "+pd.getTermino());
        System.out.println("Data Alterada: "+pd.getInicio()+" a "+pd.prolongar(10).getFim());
    }
    
}
