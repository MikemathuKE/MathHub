/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathhub;

import src.Vector;
import static src.Vector.*;
import src.Vector3;
import static src.Vector3.*;

/**
 *
 * @author Mathu
 */
public class MathHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector3 v = new Vector3(0, 3, 4);
        Vector3 w = new Vector3(5, 6, 7);
        Vector a = Add(v, w);
        Vector s = Subtract(v, w);
        Vector d = Dot(v, w);
        Vector c = Cross(v, w);
        a.Print();
        s.Print();
        d.Print();
        c.Print();
        System.out.println(v.Length());
    }
    
}
