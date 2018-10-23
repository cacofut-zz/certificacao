class Chicken {}
interface HenHouse { public java.util.List<Chicken> getChickens(); }
public class ChickenSong {
	public static void main(String[] args) {
		HenHouse house = new Teste();
		Chicken chicken = house.getChickens().get(0);
		for(int i=0; i<house.getChickens().size();
			chicken = house.getChickens().get(i++)) {
			System.out.println("Cluck");			
 } } }

/*
14. Assuming we have a valid, non-null HenHouse object whose value is initialized by the
blank line shown here, which of the following are possible outputs of this application?
(Choose all that apply)

A. The code will not compile because of line 6.
B. The code will not compile because of lines 7–8.
C. The application will compile but not produce any output. (X)
D. The application will output Cluck exactly once. (X)
E. The application will output Cluck more than once. (X)
F. The application will compile but produce an exception at runtime. (X)

*/
