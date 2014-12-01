package euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class problem_102 {
	private final static node ORIGIN = new node(0, 0, 0);
	private static boolean sameSide(node A, node B, node C) {
		node AB = B.substract(A);
		node AC = C.substract(A);
		node AO = ORIGIN.substract(A);
		node ABcrossAC = AB.cross(AC);
		node ABcrossAO = AB.cross(AO);
		return ABcrossAC.dot(ABcrossAO) > 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"/home/reacher/workspace/euler/src/euler/p102_triangles.txt"));
		int i = 0;
		int j = 0;
		int num = 0;
		int [] coordinates = new int[6];
		for (i = 0; i < 1000; ++i) {
			String[] str = reader.readLine().split(",");
			for (j = 0; j < 6; ++j) {
				coordinates[j] = Integer.parseInt(str[j]);
			}
			node A = new node((float) coordinates[0], (float) coordinates[1], 0);
			node B = new node((float) coordinates[2], (float) coordinates[3], 0);
			node C = new node((float) coordinates[4], (float) coordinates[5], 0);
			if (sameSide(A, B, C) && sameSide(B, C, A) && sameSide(C, A, B)) {
				num++;
			}
		}
		System.out.println(num);
	}
}

class node {
	float x;
	float y;
	float z;
	public node(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public node substract(node other) {
		return new node(x - other.x, y - other.y, z - other.z);
	}
	
	public double dot(node other) {
		return x * other.x + y * other.y + z * other.z;
	}
	
	public node cross(node other) {
		return new node(y * other.z - z * other.y, z * other.x - x * other.z, x * other.y - y * other.x);
	}
}