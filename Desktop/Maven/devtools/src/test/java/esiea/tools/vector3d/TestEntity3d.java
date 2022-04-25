package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
public class TestEntity3d {


    @Test
    void TestEntity3dVoidConstructor() {
        Entity3d entity1 = new Entity3d();
        assertEquals(entity1.x,0);
        assertEquals(entity1.y,0);
        assertEquals(entity1.z,0);
    }

    @Test
    void TestEntity3dCopyConstructor() {
        Entity3d entity1 = new Entity3d(1,2,3);
        Entity3d entity2 = new Entity3d(entity1);
        assertEquals(entity2.x,1);
        assertEquals(entity2.y,2);
        assertEquals(entity2.z,3);
    }
    @Test
    void TestEntity3dConstructor() {
        Entity3d entity1 = new Entity3d(1,2,3);
        assertEquals(entity1.x,1);
        assertEquals(entity1.y,2);
        assertEquals(entity1.z,3);
    }
    @Test
    void TestToString() {
        Entity3d entity = new Entity3d();
        String expected = "(0.0,0.0,0.0)";
        assertTrue(entity.toString().equals(expected));
    }

    @Test
    void TestScale() {
        Entity3d entity = new Entity3d();
        entity.scale(2.0);
        assertEquals(entity.x,0.0 );
        assertEquals(entity.y,0.0 );
        assertEquals(entity.z,0.0 );

    }

    @Test
    void TestScaleEntity() {
        Entity3d entity = new Entity3d();
        Entity3d entity2 = new Entity3d(1,2,3);

        entity.scale(2.0,entity2);
        assertEquals(entity.x, 2.0*1);
        assertEquals(entity.y, 2.0*2);
        assertEquals(entity.z, 2.0*3);

    }

    @Test
    void TestAdd() {
        Entity3d entity1 = new Entity3d(1,2,3);
        Entity3d entity2 = new Entity3d(1,2,3);
        entity1.add(entity2);
        assertEquals(entity1.x, 2.0);
        assertEquals(entity1.y, 3.0);
        assertEquals(entity1.z, 6.0);
    }

    @Test
    void TestHashCode() {
        Entity3d entity = new Entity3d(1,2,3);
        Entity3d entity1 = new Entity3d(1,2,3);
        Entity3d entity2 = new Entity3d();

        assertNotEquals(entity.hashCode(),entity2.hashCode());
        assertEquals(entity.hashCode(),entity1.hashCode());
    }

    @Test
    void TestEquals() {
        Entity3d entity = new Entity3d(1,2,3);
        Entity3d entity1 = new Entity3d(1,2,3);
        Entity3d entity2 = new Entity3d();
        assertTrue(entity.equals(entity1));
        assertFalse(entity.equals(entity2));

     }

    @Test
    void TestEpsilonEquals() {
        Entity3d entity = new Entity3d(1.1,2.2,3.3);
        Entity3d entity2 = new Entity3d(1.05,2.15,3.25);
        Entity3d entity3 = new Entity3d(5,6,7);
        assertTrue(entity.epsilonEquals(entity2,0.1));
        assertFalse(entity.epsilonEquals(entity3,0.1));

    }
}