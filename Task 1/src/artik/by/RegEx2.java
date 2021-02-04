package artik.by;

public class RegEx2 {
    RegEx2(String str){
        if(str.matches(".*\\.(com|by)")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
