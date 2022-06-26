package Annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;



class BookDetails 
{

    public static void main(String[] args) 
    {
        Information i=new Information("extra info");
		Class c = i.getClass();
        java.lang.annotation.Annotation an=c.getAnnotation(info.class);
		info in=(info)an;
		System.out.println(in.Author());
		System.out.println(in.AuthorID());
		System.out.println(in.Date());
		System.out.println(in.Time());
		System.out.println(in.version());
		System.out.println(in.Description());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
 
    int AuthorID(); 
    String Author() default "Yuvraj" ; 
	String supervisor()default "Yashwant"; 
    String Date(); 
    String Time();
    int version(); 
    String Description() default "Love Book";
}


@info(AuthorID=567,Author="Yuvraj Kaulge",Date="1.12.2000",Time="11:30",version=3)
class Information{
	String extrainfo;

	public Information(String extrainfo) {
		super();
		this.extrainfo = extrainfo;
	}
	
	
}
