
abstract class Abstract{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

// MyBook class 
class MyBook extends Abstract{

    void setTitle(String s)
    {
        title=s;
    }
}