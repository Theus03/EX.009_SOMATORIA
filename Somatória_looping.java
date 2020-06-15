/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
public class Somatória_looping {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor:");
        int cont = leitor.nextInt();
        int soma=0;
        System.out.println("Soma de 1 até 100");
        for(int i=1;i<=cont;i++ ){
        soma += i;
        System.out.println(i + " - " +soma);
    }
        int soma3 = 0;
        System.out.println("Soma 1 até 100 não mútiplo de 3");
        for(int i=cont;i>0;i--){
            if (i%3!=0){
                soma3+=1;
            System.out.println(i +" - " +soma3);
            }
        }
    }
    }
