package text;

import org.example.WordUtils;

public class testWordUtils {
    public static void main(String []args){
        String result1 = WordUtils.abbreviate("abc",0,2,"def");
        String result2= WordUtils.capitalize("abc def hij");
        String result3= WordUtils.initials("Li Lin Feng");
        if(result1 !="abdef")
        {
            System.err.println("Error:incorrect result1");
            System.out.println("错误结果1为:"+result1);
        }
        if(result2 !="Abc Def Hij")
        {
            System.err.println("Error:incorrect result2");
            System.out.println("错误结果2为:"+result2);
        }
        if(result3 !="LLF")
        {
            System.err.println("Error:incorrect result3");
            System.out.println("错误结果3为:"+result3);
        }
    }
}
