
public class Subject {

	public static void main(String[] args) throws UserException {
			if(2<3) {
				throw new UserException("This is invalid");
			}else System.out.println("Executed");
		/*}catch (Exception e) {
			System.out.println(e);
		}*/
	}

}
