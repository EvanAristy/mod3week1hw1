package mod3Week1HW1;

	public class GetUp {
		
		public static boolean getUp(boolean squawking, int currHour) {
			if(squawking == true && (currHour < 0 || currHour > 23)) {
				return false;
			} else if (squawking == true && (currHour < 6 || currHour > 22)) {
				return true;
			} else {
				return false;
			}
		}
		
		public static void main(String[] args) {
			
			// method name getUp takes two parameters
			// first parameters = boolean squawking
			// 2nd parameter int = currentHour 0-23
			// if currHour <6 || >22 return true
			// if currHour < 0 || > 23 return false
			
			
			System.out.println(getUp(true, 3));
	
		}
}
