package AStudy;

public class BJ_4673_1 {
	public static void main(String[] args) {
		int array[] = new int[10001]; //硅凯 积己
		
		for(int i = 1; i<=array.length; i++){
			int result = calculate(i);
			if(result<=10000){
				array[result] = 1;
			}
		}
		for(int i =1; i<array.length; i++){
			if(array[i] != 1){
				System.out.println(i);
			}
		}
	}
	
	public static int calculate(int value){//calculate 皋家靛 积己
		int result = value;
		
		while(value>0){
			result += value % 10;
			value /= 10;
		}
		return result;
	}

}
