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
public class Vector {
    
    public Vector(int actualSize) {
        size = actualSize;
        elements = new float[size];
        for(float element : elements) {
            element = 0;
        }
    }

    public Vector(float... values) {
        size = values.length;
        elements = new float[size];
        int i = 0;
        for(float value : values) {
            elements[i++] = value;
        }
    }
    
    public static Vector Add(Vector v1, Vector v2) {
        Vector res = new Vector(v1.size);
        if (v1.size == v2.size) {
            for (int i = 0; i < v1.size; i++) {
                res.elements[i] = v1.elements[i] + v2.elements[i];
            }
        }else {
            System.err.println("Vectors don't have the same size");
            System.exit(1);
        }
        return res;
    }
    
    public static Vector Subtract(Vector v1, Vector v2) {
        Vector res = new Vector(v1.size);
        if (v1.size == v2.size) {
            for (int i = 0; i < v1.size; i++) {
                res.elements[i] = v1.elements[i] - v2.elements[i];
            }
        }else {
            System.err.println("Vectors don't have the same size");
            System.exit(1);
        }
        return res;
    }
    
    public static Vector Dot(Vector v1, Vector v2) {
        Vector res = new Vector(v1.size);
        if (v1.size == v2.size) {
            for (int i = 0; i < v1.size; i++) {
                res.elements[i] = v1.elements[i] * v2.elements[i];
            }
        }else {
            System.err.println("Vectors don't have the same size");
            System.exit(1);
        }
        return res;
    }
    
    public float Length() {
        double sum = 0;
        for ( float element : elements) {
            sum += element * element;
        }
        return (float)Math.sqrt(sum);
    }
    
    public void Print() {
        System.out.print("( ");
        for(int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            if(i != size-1) {
                System.out.print(", ");
            }else {
                System.out.print(" )\n");
            }
        }
    }
    
    public float[] elements;
    public int size;
}
