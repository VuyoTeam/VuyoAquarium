/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vuyoaquariumproject;
import VuyoBusiness.bsLectures;


/**
 *
 * @author ti
 */

public class VuyoAquariumProject {

    public static void main(String[] args) {
        int ph = 6, gh = 70, no3 = -5;
        
        paramFuncioValids parametre = new paramFuncioValids();
              
        if (ParametresValids(ph, gh, no3, parametre))
        {   
            System.out.println("Parametres correctes i la mitjan és : " + parametre.MitjaParams);
            System.out.println(no3);
        }
        else {
            System.out.println(no3);
        }
    }
        
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
    
}


