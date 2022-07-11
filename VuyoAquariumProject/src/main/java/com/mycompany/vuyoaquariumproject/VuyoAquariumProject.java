/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vuyoaquariumproject;
import VuyoBusiness.bsLectures;
import Parametres.*;


/**
 *
 * @author ti
 */

public class VuyoAquariumProject {

    public static void main(String[] args) {
        
        /*
        int ph = 6, gh = 70, no3 = -5;
        //Integer i = new Integer(-1);
        
        paramFuncioValids parametre = new paramFuncioValids();
              
        if (ParametresValids(ph, gh, no3, parametre))
        {   
            System.out.println("Parametres correctes i la mitjan és : " + parametre.MitjaParams);
            System.out.println(no3);
        }
        else {
            System.out.println(no3);
        }
        
        */
        
        //*************** Primera  ****************************************************************************
        int QuantClientsMajorsDe35i160cm = -1;
        int edat = 35;
        int altura = 160;
        
        QuantClientsMajorsDe35i160cm = QuantsClientsTinc(edat, altura);
        
        System.out.println(QuantClientsMajorsDe35i160cm);
        
        //**************  Segona *****************************************************************************
        
        paramsQuantsClientsTinc QuantsClients = new paramsQuantsClientsTinc();
        
        QuantsClientsTinc(35, altura, QuantsClients);
        
        System.out.println(QuantsClients.Quants);
        System.out.println(QuantsClients.TempsLectura);
        
        //**************** Tercera   ***************************************************************************
        paramsQuantsClientsTinc QuantsClients2Prova = new paramsQuantsClientsTinc();
        
        QuantsClients2Prova = QuantsClientsTincITempLectura(edat, altura);
        
        System.out.println(QuantsClients2Prova.Quants);
        System.out.println(QuantsClients2Prova.TempsLectura);
    }
    
    public static int QuantsClientsTinc(int pEdat, int pAltura)
    {
        //conectem a la BD, i mirem quants hi de la edat
        int rQuants = -1;
        
        rQuants = 30;
        
        return rQuants;
    }
    
    public static void QuantsClientsTinc(int pEdat, int pAltura, paramsQuantsClientsTinc pQuants)
    {
        //conectem a la BD, i mirem quants hi de la edat utilitzo parametres pedat i paltura
        
        pQuants.Quants = 30;
        pQuants.TempsLectura = 1050;
    }
    
    public static paramsQuantsClientsTinc QuantsClientsTincITempLectura(int pEdat, int pAltura)
    {
        //conectem a la BD, i mirem quants hi de la edat
        paramsQuantsClientsTinc lQuantsTinc = new paramsQuantsClientsTinc();
        
        lQuantsTinc.Quants = 30;
        lQuantsTinc.TempsLectura = 1050;
        
     
        return lQuantsTinc;
    }
    
    /*
    private static boolean ParametresValids(int pph, int pgh, int pno3 , paramFuncioValids pparametre)//, float  MitjaParams)
    {
        boolean valorAretornar = true;
        
        if (pno3 < 0){
            pno3 = 0;
        }
        
        if (pph > 8 || pph < 2 || pgh > 45 || pgh < 67 || pno3 > 3)
        {
            valorAretornar = false;
        }
        
        pparametre.MitjaParams = pph / pgh;
        
        return valorAretornar;
    }
    */
    
}


