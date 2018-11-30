class ser{
	public static void main(String args[]){
		int a[]={4,1,4,6,3,7,2,7,2,3,8,67};
		int serv=87;
		for(int i:a){
			if(i==serv){
				System.out.println("Element found");
				System.out.println(i);
				return;
			}
			
		}

		System.out.println("Not found");

	}
}