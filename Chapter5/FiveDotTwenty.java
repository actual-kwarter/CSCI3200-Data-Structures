public class FiveDotTwenty{
	public static void main(String[] args){
		Map<String, Integer> m = new Map<>();
		
		m.put("Matt", 22);
		m.put("Liza", 23);
		System.out.println(m);
		System.out.println(m.get("Matt"));
		System.out.println(m.isEmpty());
		m.makeEmpty();
		System.out.println(m);
	}
}