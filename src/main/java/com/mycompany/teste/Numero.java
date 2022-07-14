/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author henri
 */
public class Numero {
    
    public long fatorial(int valor){
        if(valor == 0){
            return 1;
        }else{
            return valor * fatorial(valor -1);
        }
    }
    
    public static void main(String vags[]){
        Numero num = new Numero();
        System.out.println("valor: "+num.fatorial(10));
    }
}
