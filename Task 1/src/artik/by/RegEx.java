package artik.by;

public class RegEx {
    RegEx(){
        String str ="FIFA will never !  regret it";
        String[] arr= str.split("\\s*(\\s|\\.|!)\\s*");
        for(String t:arr){
            System.out.println(t + "\n");
        }
    }
}
