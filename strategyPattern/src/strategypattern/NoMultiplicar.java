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
public class NoMultiplicar implements Multiplicable{
    @Override
    public ParMatematico multiplicar(ParMatematico a, ParMatematico b){
        System.out.println("Este tipo de dato no se multiplica");
        return a;
    }
}
