/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author admin
 */
public class Fraccion extends ParMatematico{
     public Fraccion(){
         super();
         tipoSuma=new DenominadorComun();
         tipoMultiplicacion=new MultiplicarDirecto();
        }
     
     public Fraccion(int a, int b){
         super(a,b);
         tipoSuma=new DenominadorComun();
         tipoMultiplicacion=new MultiplicarDirecto();
        }
     
     public void mostrar(){
     System.out.println(dato1+"/"+dato2);
     }
     
}
