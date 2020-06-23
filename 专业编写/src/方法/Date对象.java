package 方法;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date对象 {

	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		System.out.println(now);
		Date past = new Date(1);
		System.out.println(past);
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
		System.out.println(sim.format(now));
		String str="2008-08-08 08:08:08 888";
		System.out.println(sim.parse(str));
		System.out.println(sim.format(sim.parse(str)));
		
		System.out.println(System.currentTimeMillis());
	}

}
