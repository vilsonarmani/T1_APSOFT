/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_06;


public class Triangulo {
    private int l1;
    private int l2;
    private int l3;

    public Triangulo(int l1, int l2, int l3) {
        if (verificaLados(l1, l2, l3)){
            this.l1 = l1;
            this.l2 = l2;
            this.l3 = l3;
        }else{
            System.out.println("Parametros inválidos");
        }
    }

    public void setL1(int l1) {
        if (verificaLados(l1, l2, l3)) this.l1 = l1;
        else System.out.println("Alteração inválida");
    }

    public void setL2(int l2) {
       if (verificaLados(l1, l2, l3)) this.l2 = l2;
       else System.out.println("Alteração inválida");
    }

    public void setL3(int l3) {
       if (verificaLados(l1, l2, l3)) this.l3 = l3;
       else System.out.println("Alteração inválida");
    }
    
   private boolean verificaLados(int l1, int l2, int l3){       
       return (l1 > 0 && l2 > 0 && l3 > 0) && ((l1+l2) > l3 && (l2+l3) > l1 && (l3+l1) > l2);
   } 
}
