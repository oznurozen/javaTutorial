package ordinalMethod;

enum aylarr{
	OCAK, SUBAT, MART
}

public class aylar {

	public static void main(String[] args) {
		int ay =aylarr.SUBAT.ordinal();
	       
	       switch(ay){
        case 0:
            System.out.println("OCAK");
            break;
        case 1:
            System.out.println("ÞUBAT");
            break;
        case 2:
            System.out.println("MART");
            break;
        default:
        	System.out.println("Bu aylardan deðildir.");
            break;
        	
	       }

	}

}
