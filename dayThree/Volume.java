class Volume { 
	int height;
	int weight;
	int depth;

	public static void main(String[] args) {
		Volume v = new Volume();
		v.height = 5;
		v.weight = 6;
		v.depth = 7;

		System.out.println("Volume v's height is " + v.height);
		System.out.println("Volume v's weight is " + v.weight);
		System.out.println("Volume v's depth is " + v.depth);
		System.out.println("Volume v's weight/area is " + ((float)v.weight / (float)(v.depth * v.height)));
	}
}
