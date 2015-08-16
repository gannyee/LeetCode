public class ContainerWithMostWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 5, 6, 3, 8, 9, 12, 45 };
		System.out.println("Max Area is : " + maxArea(a));
		int[] a1 = { 12,45,32,78,11,23,14 };
		System.out.println("Max Area is : " + maxArea(a1));
		int[] a2 = { 90,34,45,21,43,32};
		System.out.println("Max Area is : " + maxArea(a2));
	}

	public static int maxArea(int[] height) {

		int maxArea = 0; // The max area
		int leftHight = 0;
		int rigtHight = height.length - 1;

		while (leftHight < rigtHight) {
			//Calculate the max area 
			maxArea = Math.max(maxArea, (rigtHight - leftHight)
					* Math.min(height[leftHight], height[rigtHight]));
			//Because of cast effect, hence choose shortest height

			if (height[leftHight] > height[rigtHight])
				rigtHight--;
			else
				leftHight++;
			//System.out.println("Left: " + height[leftHight] + " " + leftHight + " Right: " + height[rigtHight] + " " + rigtHight);
			//System.out.println("Max Area: " + maxArea);
		}
		return maxArea;
	}

}
