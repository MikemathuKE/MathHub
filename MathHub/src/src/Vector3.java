/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Mathu
 */
public class Vector3 extends Vector{
    
    public Vector3(float x, float y, float z) {
        super(x, y, z);
    }
    
    public static Vector3 Cross(Vector3 a, Vector3 b) {
        float x = a.elements[1] * b.elements[2] - a.elements[2] * b.elements[1];
        float y = a.elements[2] * b.elements[0] - a.elements[0] * b.elements[2];
        float z = a.elements[0] * b.elements[1] - a.elements[1] * b.elements[0];
        return new Vector3(x, y, z);
    }
    
}
