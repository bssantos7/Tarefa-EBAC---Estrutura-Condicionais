package com.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        int n1,n2;
        String resposta="";
        Scanner scanner=new Scanner(System.in);

        System.out.println("BEM VINDO AO PROGRAMA");
        System.out.println("Digite um numero: ");
        n1=scanner.nextInt();
        System.out.println("Digite um segundo número: ");
        n2=scanner.nextInt();

        if(n1>n2){
            resposta="O numero 1 ("+n1+") é maior que o nuemro 2 ("+n2+")";
        }else if(n1<n2){
            resposta="O numero 2 ("+n2+") é maior que o nuemro 1 ("+n1+")";
        }else{
            resposta="Os números são iguais";
        }
        scanner.close();
        System.out.println(resposta);
    }
}
