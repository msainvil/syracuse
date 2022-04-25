package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVector3d {
	@Test
	void TestVector3dConstructors() {
		Vector3d vector3d = new Vector3d();
		assertEquals(vector3d.x,0);
		assertEquals(vector3d.y,0);
		assertEquals(vector3d.z,0);
	}

	/* example
	   v1 x v2 = | i  j   k |
	             | 3  4   8 |
	             | 7  2   1 |
	           = i(4*1-2*8)-j(3*1-7*8)+k(3*2-4*7)
	    see also https://mathinsight.org/cross_product
	 */
	@Test
	void TestVector3dCross() {
		Vector3d vector3d = new Vector3d(1,0,0);
		Vector3d v1 = new Vector3d(0,1,0);
		Vector3d v2 = new Vector3d(0,0,1);
		vector3d.cross(v1,v2);

		assertEquals(vector3d.x,1);
		assertEquals(vector3d.y,0);
		assertEquals(vector3d.z,0);

	}

	/* https://mathinsight.org/dot_product

	 */
	@Test
	void TestVector3dDotProduct() {
		Vector3d vector3d = new Vector3d(0,0,0);
		Vector3d vector3d2 = new Vector3d(1,1,1);

		assertEquals(vector3d.dot(vector3d2),0);

	}

	@Test
	void TestVector3dLength() {
		Vector3d vector3d2 = new Vector3d(1,1,1);
		vector3d2.length();
		assertEquals(vector3d2.length(),1.7320508075688772);

	}

}
