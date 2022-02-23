package assignmentq1;

class SingletonClass{
	private static SingletonClass sInstance = null;
    public String m;
	private SingletonClass()
	{
		m = "Singleton Test";
	}
	public static SingletonClass getInstance()
	{
		if (sInstance == null)
		sInstance = new SingletonClass();
		return sInstance;
	}
}
public class SingletonlClass {
	public static void main(String[] args) {
		SingletonClass ob = SingletonClass.getInstance();
		System.out.println(ob.m);
		}
	}
